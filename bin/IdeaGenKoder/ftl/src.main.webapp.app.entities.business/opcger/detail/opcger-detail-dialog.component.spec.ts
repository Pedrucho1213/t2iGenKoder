import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { Opcger } from '../opcger.model';

import { OpcgerDetailDialogComponent } from './opcger-detail-dialog.component';

describe('Component Tests', () => {
  describe('Opcger Management Detail Component', () => {
    let comp: OpcgerDetailDialogComponent;
    let fixture: ComponentFixture<OpcgerDetailDialogComponent>;

    beforeEach(() => {
      TestBed.configureTestingModule({
        declarations: [OpcgerDetailDialogComponent],
        providers: [
          {
            provide: ActivatedRoute,
            useValue: { data: of({ opcger: new Opcger(123) }) },
          },
        ],
      })
        .overrideTemplate(OpcgerDetailDialogComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(OpcgerDetailDialogComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should load opcger on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.opcger).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
