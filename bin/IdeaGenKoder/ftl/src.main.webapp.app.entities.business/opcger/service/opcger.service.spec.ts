import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

import { IOpcger, Opcger } from '../opcger.model';

import { OpcgerService } from './opcger.service';
import * as dayjs from 'dayjs';

describe('Service Tests', () => {
  describe('Opcger Service', () => {
    let service: OpcgerService;
    let httpMock: HttpTestingController;
    let elemDefault: IOpcger;
    let expectedResult: IOpcger | IOpcger[] | boolean | null;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],
      });
      expectedResult = null;
      service = TestBed.inject(OpcgerService);
      httpMock = TestBed.inject(HttpTestingController);

      elemDefault = {
        id: 0,
        ramsubramo: 0,
        moneda: 0,
        numnorma: 0,
        finivig: dayjs(),
        descnorm: "AAAAAA",
      };
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign({}, elemDefault);

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a Opcger', () => {
        const returnedFromService = Object.assign(
          {
            id: 0,
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.create(new Opcger()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a Opcger', () => {
        const returnedFromService = Object.assign(
          {
            id: 1,
            ramsubramo: 1,
            moneda: 1,
            numnorma: 1,
            finivig: dayjs(),
            descnorm: "BBBBBB",
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should partial update a Opcger', () => {
        const patchObject = Object.assign(
          {
            finivig: dayjs(),
            descnorm: "CCCCCC",
          },
          new Opcger()
        );

        const returnedFromService = Object.assign(patchObject, elemDefault);

        const expected = Object.assign({}, returnedFromService);

        service.partialUpdate(patchObject).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PATCH' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of Opcger', () => {
        const returnedFromService = Object.assign(
          {
            id: 1,
            ramsubramo: 1,
            moneda: 1,
            numnorma: 1,
            finivig: dayjs(),
            descnorm: "DDDDDD",
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a Opcger', () => {
        service.deleteOLD(123).subscribe(resp => (expectedResult = resp.ok));

        const req = httpMock.expectOne({ method: 'DELETE' });
        req.flush({ status: 200 });
        expect(expectedResult);
      });

      describe('addToCollectionIfMissing', () => {
        it('should add a Opcger to an empty array', () => {
          const opcger: IOpcger = { id: 123 };
          expectedResult = service.addToCollectionIfMissing([], opcger);
          expect(expectedResult).toHaveLength(1);
          expect(expectedResult).toContain(opcger);
        });

        it('should not add a Opcger to an array that contains it', () => {
          const opcger: IOpcger = { id: 123 };
          const opcgerCollection: IOpcger[] = [
            {
              ...opcger,
            },
            { id: 456 },
          ];
          expectedResult = service.addToCollectionIfMissing(opcgerCollection, opcger);
          expect(expectedResult).toHaveLength(2);
        });

        it("should add a Opcger to an array that doesn't contain it", () => {
          const opcger: IOpcger = { id: 123 };
          const opcgerCollection: IOpcger[] = [{ id: 456 }];
          expectedResult = service.addToCollectionIfMissing(opcgerCollection, opcger);
          expect(expectedResult).toHaveLength(2);
          expect(expectedResult).toContain(opcger);
        });

        it('should add only unique Opcger to an array', () => {
          const opcgerArray: IOpcger[] = [{ id: 123 }, { id: 456 }, { id: 29824 }];
          const opcgerCollection: IOpcger[] = [{ id: 123 }];
          expectedResult = service.addToCollectionIfMissing(opcgerCollection, ...opcgerArray);
          expect(expectedResult).toHaveLength(3);
        });

        it('should accept varargs', () => {
          const opcger: IOpcger = { id: 123 };
          const opcger2: IOpcger = { id: 456 };
          expectedResult = service.addToCollectionIfMissing([], opcger, opcger2);
          expect(expectedResult).toHaveLength(2);
          expect(expectedResult).toContain(opcger);
          expect(expectedResult).toContain(opcger2);
        });

        it('should accept null and undefined values', () => {
          const opcger: IOpcger = { id: 123 };
          expectedResult = service.addToCollectionIfMissing([], null, opcger, undefined);
          expect(expectedResult).toHaveLength(1);
          expect(expectedResult).toContain(opcger);
        });
      });
    });

    afterEach(() => {
      httpMock.verify();
    });
  });
});
