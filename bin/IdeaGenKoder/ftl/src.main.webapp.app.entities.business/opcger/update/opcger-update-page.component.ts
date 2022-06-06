import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChange } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { map } from 'rxjs/operators';

import { NATURAL_NUMBERS, DATE_TIME_FORMAT, ALPHA_NUMERIC_PATTERNS, LATIN_PATTERNS, NUMBERS_LETTERS, DATE_MASK, CURRENCY_MASK } from 'app/config/input.constants';

import { IOpcger, Opcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';
import { ICatRamos } from '../../catramos/catramos.model';
import { CatRamosService } from '../../catramos/service/catramos.service';

@Component({
  selector: 'app-opcger-update',
  templateUrl: './opcger-update-page.component.html',
})
export class OpcgerUpdatePageComponent implements OnInit, OnChanges {
  @Input()
  id?: number;

  @Input()
  value?: IOpcger;

  @Input()
  message?: string;

  @Input()
  parentForm?: FormGroup;

  @Output()
  requiredBoolean: EventEmitter<boolean> = new EventEmitter<boolean>();

  @Output()
  formChange: EventEmitter<FormGroup | undefined> = new EventEmitter<FormGroup | undefined>();

  @Output()
  valueUpdate: EventEmitter<any> = new EventEmitter<any>();

  @Output()
  auxSave: EventEmitter<any | undefined> = new EventEmitter<any | undefined>();

  @Output()
  childForm: EventEmitter<any | undefined> = new EventEmitter<any | undefined>();

  isSaving = false;
  catramosSelect: ICatRamos[] = [];

  ramsubramoMask  = { size: 6, pattern: NATURAL_NUMBERS, mask: 'M{7}' };
  monedaMask      = { size: 1, pattern: NATURAL_NUMBERS, mask: 'M{2}' };
  numnormaMask    = { size: 2, pattern: NATURAL_NUMBERS, mask: 'M{3}' };
  finivigMask     = DATE_MASK;
  descnormMask    = { size: 30, pattern: LATIN_PATTERNS, mask: 'L{31}' };
  valorMask       = { size: 15, pattern: ALPHA_NUMERIC_PATTERNS, mask: 'N{16}' };

  editForm = this.fb.group({
    id: [{ value: null, disabled: true }, []],
    ramsubramo:[null, [Validators.required, Validators.maxLength(this.ramsubramoMask.size)]],
    moneda:    [null, [Validators.required, Validators.maxLength(this.monedaMask.size)]],
    numnorma:  [null, [Validators.required, Validators.maxLength(this.numnormaMask.size)]],
    finivig:   [null, [Validators.required, Validators.maxLength(this.finivigMask.size)]],
    descnorm:  [null, [Validators.required, Validators.maxLength(this.descnormMask.size)]],
    valor1:    [null, []],
    valor2:    [null, []],
    valor3:    [null, []],
    valor4:    [null, []],
    valor5:    [null, []],
    valor6:    [null, []],
    valor7:    [null, []],
    valor8:    [null, []],
    valor9:    [null, []],
    valor10:   [null, []],
    valor11:   [null, []],
    valor12:   [null, []],
    descval1:  [null, []],
    descval2:  [null, []],
    descval3:  [null, []],
    descval4:  [null, []],
    descval5:  [null, []],
    descval6:  [null, []],
    descval7:  [null, []],
    descval8:  [null, []],
    descval9:  [null, []],
    descval10: [null, []],
    descval11: [null, []],
    descval12: [null, []],
  });

  constructor(
    protected valueService: OpcgerService,
    protected catRamosService: CatRamosService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.loadExtData();
    this.loadData();
  }

  loadData(): void {
    if (this.id) {
      this.valueService
        .find(this.id)
        .pipe(
          map(res =>
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            res.body ? res.body : this.getNewValue()
          )
        )
        .subscribe(resBody => {
          // eslint-disable-next-line @typescript-eslint/no-unsafe-return
          this.value = resBody;
          this.updateData();
        });
    } else {
      if (this.value) {
        this.valueService
        .findByData(this.value.id!, this.value)
        .pipe(
          map(res =>
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            res.body ? res.body : this.getNewValue()
          )
        )
        .subscribe(resBody => {
          // eslint-disable-next-line @typescript-eslint/no-unsafe-return
          this.value = resBody;
          this.updateData();
        });
      }
      else
      {
        this.value = this.getNewValue();
      }
      this.updateData();
    }
  }

  loadExtData(): void {
    // TODO Aqui poner consultas adicionales
    this.catRamosService.query().subscribe((res: HttpResponse<ICatRamos[]>) => {
      this.catramosSelect = res.body ?? [];
      this.catramosSelect.map(p => {
        // eslint-disable-next-line @typescript-eslint/restrict-template-expressions
        p.nombrel = `${p.ramsubramo!} ` +
        `(${p.nombrem!} ,`;
      });
    });
  }

  private getNewValue(): any {
    // eslint-disable-next-line @typescript-eslint/no-unsafe-return
    return new Opcger();
  }

  private updateData(): void {
    // eslint-disable-next-line no-console
    // console.log(this.value);
    this.updateForm(this.value);
    this.evaluateRequired(this.requiredBoolean);
    // eslint-disable-next-line no-console
    // console.log('Value Json:' + JSON.stringify(this.value));

    if (this.parentForm) {
      this.parentForm.addControl('child-opcger', this.editForm);
      this.formChange.emit(this.editForm);
    }

    this.editForm.valueChanges.subscribe(() => {
      const eFrm = this.createFromForm();
      this.valueUpdate.emit(eFrm);
      // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
      if (this.childForm) {
        this.childForm.emit(this.editForm);
      }
    });
  }

  updateForm(value: any): void {
    this.editForm.patchValue({
      ...value,
      finivig: value.finivig ? value.finivig.toDate() : null,
    });
    // Solo se marca si es edicion, para nuevos no
    if (value.id) {
      this.editForm.markAllAsTouched();
    }
  }

  save(): void {
    this.isSaving = true;
    const value = this.createFromForm();
    if (value.id !== undefined) {
      this.subscribeToSaveResponse(this.valueService.update(value));
    } else {
      this.subscribeToSaveResponse(this.valueService.create(value));
    }
  }

  private createFromForm(): any {
    // eslint-disable-next-line @typescript-eslint/no-unsafe-return
    return {
      ...this.getNewValue(),
      // id: this.editForm.get(['id'])!.value,
      // abreviatura: this.editForm.get(['abreviatura'])!.value,
      // descripcion: this.editForm.get(['descripcion'])!.value,
      ...this.value,
      ...this.editForm.value,
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IOpcger>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
    if (this.auxSave) {
      this.auxSave.emit(true);
    }
  }

  protected onSaveError(): void {
    // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
    if (this.auxSave) {
      this.auxSave.emit(false);
    }
  }

  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  ngOnChanges(changes: { requiredBoolean: SimpleChange }): void {
    // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
    if (changes.requiredBoolean && this.requiredBoolean) {
      this.evaluateRequired(changes.requiredBoolean.currentValue);
      // eslint-disable-next-line no-console
      // console.log('ngOnChanges:' + this.requiredBoolean);
    }
  }

  evaluateRequired(requiredBoolean: any): void {
    // eslint-disable-next-line no-console
    // console.log('Requerido enable?: ' + JSON.stringify(requiredBoolean));
    if (requiredBoolean === 'false' || requiredBoolean === false) {
      this.editForm.disable();
      const value = this.getNewValue();
      this.updateForm(value);
    } else {
      this.editForm.enable();
    }
  }

  isFormSectionInvalid(section: number): boolean {
    if (section === 0) {
      return (
        this.editForm.get(['ramsubramo'])!.invalid ||
        this.editForm.get(['moneda'])!.invalid ||
        this.editForm.get(['numnorma'])!.invalid ||
        this.editForm.get(['finivig'])!.invalid ||
        this.editForm.get(['descnorm'])!.invalid
      );
    }
    // else if (section === 1 && this.domicilioForm) {
    //   return this.domicilioForm.invalid;
    // }
    return false;
  }

}
