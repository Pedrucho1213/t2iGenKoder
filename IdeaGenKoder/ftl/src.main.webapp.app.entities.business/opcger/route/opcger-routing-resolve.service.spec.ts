jest.mock('@angular/router');

import { TestBed } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ActivatedRouteSnapshot, Router } from '@angular/router';
import { of } from 'rxjs';

import { IOpcger, Opcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';

import { OpcgerRoutingResolveService } from './opcger-routing-resolve.service';

describe('Service Tests', () => {
  describe('Opcger routing resolve service', () => {
    let mockRouter: Router;
    let mockActivatedRouteSnapshot: ActivatedRouteSnapshot;
    let routingResolveService: OpcgerRoutingResolveService;
    let service: OpcgerService;
    let resultOpcger: IOpcger | undefined;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],
        providers: [Router, ActivatedRouteSnapshot],
      });
      mockRouter = TestBed.inject(Router);
      mockActivatedRouteSnapshot = TestBed.inject(ActivatedRouteSnapshot);
      routingResolveService = TestBed.inject(OpcgerRoutingResolveService);
      service = TestBed.inject(OpcgerService);
      resultOpcger = undefined;
    });

    describe('resolve', () => {
      it('should return existing IOpcger for existing id', () => {
        // GIVEN
        service.find = jest.fn(id => of(new HttpResponse({ body: new Opcger(id) })));
        mockActivatedRouteSnapshot.params = { id: 123 };

        // WHEN
        routingResolveService.resolve(mockActivatedRouteSnapshot).subscribe(result => {
          resultOpcger = result;
        });

        // THEN
        expect(service.find).toBeCalledWith(123);
        expect(resultOpcger).toEqual(new Opcger(123));
      });

      it('should return new IOpcger if id is not provided', () => {
        // GIVEN
        service.find = jest.fn();
        mockActivatedRouteSnapshot.params = {};

        // WHEN
        routingResolveService.resolve(mockActivatedRouteSnapshot).subscribe(result => {
          resultOpcger = result;
        });

        // THEN
        expect(service.find).not.toBeCalled();
        expect(resultOpcger).toEqual(new Opcger());
      });

      it('should route to 404 page if data not found in server', () => {
        // GIVEN
        spyOn(service, 'find').and.returnValue(of(new HttpResponse({ body: null })));
        mockActivatedRouteSnapshot.params = { id: 123 };

        // WHEN
        routingResolveService.resolve(mockActivatedRouteSnapshot).subscribe(result => {
          resultOpcger = result;
        });

        // THEN
        expect(service.find).toBeCalledWith(123);
        expect(resultOpcger).toEqual(undefined);
        expect(mockRouter.navigate).toHaveBeenCalledWith(['404']);
      });
    });
  });
});
