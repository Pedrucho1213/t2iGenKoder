jest.mock('@angular/router');

import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { OpcgerService } from '../service/opcger.service';
import { Opcger } from '../opcger.model';

import { OpcgerUpdateDialogComponent } from './opcger-update-dialog.component';

describe('Component Tests', () => {
  describe('Opcger Management Update Component', () => {
    let comp: OpcgerUpdateDialogComponent;
    let fixture: ComponentFixture<OpcgerUpdateDialogComponent>;
    let service: OpcgerService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],
        declarations: [OpcgerUpdateDialogComponent],
        providers: [FormBuilder, ActivatedRoute],
      })
        .overrideTemplate(OpcgerUpdateDialogComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(OpcgerUpdateDialogComponent);
      comp = fixture.componentInstance;
      service = TestBed.inject(OpcgerService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new Opcger(123);
        spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.update).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));

      it('Should call create service on save for new entity', fakeAsync(() => {
        // GIVEN
        const entity = new Opcger();
        spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.create).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));
    });
  });
});
