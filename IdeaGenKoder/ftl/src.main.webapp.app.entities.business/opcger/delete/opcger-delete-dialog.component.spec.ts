jest.mock('@ng-bootstrap/ng-bootstrap');

import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { of } from 'rxjs';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

import { OpcgerService } from '../service/opcger.service';

import { OpcgerDeleteDialogComponent } from './opcger-delete-dialog.component';

describe('Component Tests', () => {
  describe('Opcger Management Delete Component', () => {
    let comp: OpcgerDeleteDialogComponent;
    let fixture: ComponentFixture<OpcgerDeleteDialogComponent>;
    let service: OpcgerService;
    let mockActiveModal: NgbActiveModal;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],
        declarations: [OpcgerDeleteDialogComponent],
        providers: [NgbActiveModal],
      })
        .overrideTemplate(OpcgerDeleteDialogComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(OpcgerDeleteDialogComponent);
      comp = fixture.componentInstance;
      service = TestBed.inject(OpcgerService);
      mockActiveModal = TestBed.inject(NgbActiveModal);
    });

    describe('confirmDelete', () => {
      it('Should call delete service on confirmDelete', inject(
        [],
        fakeAsync(() => {
          // GIVEN
          spyOn(service, 'delete').and.returnValue(of({}));

          // WHEN
          comp.updateComponent?.doDelete(123);
          tick();

          // THEN
          expect(service.delete).toHaveBeenCalledWith(123);
          expect(mockActiveModal.close).toHaveBeenCalledWith('deleted');
        })
      ));

      it('Should not call delete service on clear', () => {
        // GIVEN
        spyOn(service, 'delete');

        // WHEN
        comp.cancel();

        // THEN
        expect(service.delete).not.toHaveBeenCalled();
        expect(mockActiveModal.close).not.toHaveBeenCalled();
        expect(mockActiveModal.dismiss).toHaveBeenCalled();
      });
    });
  });
});
