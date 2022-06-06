import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { map } from 'rxjs/operators';

import { Opcger, IOpcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';

/** Para usar como UPDATE */
import { HttpResponse } from '@angular/common/http';
import { NATURAL_NUMBERS, DATE_TIME_FORMAT, ALPHA_NUMERIC_PATTERNS, LATIN_PATTERNS, NUMBERS_LETTERS, DATE_MASK, CURRENCY_MASK } from 'app/config/input.constants';
import { ICatRamos } from '../../catramos/catramos.model';
import { CatRamosService } from '../../catramos/service/catramos.service';
/* Para usar como UPDATE **/

/** 2021-06-28 ati: Para usar como UPDATE */
@Component({
  selector: 'app-opcger-detail',
  templateUrl: '../update/./opcger-update-page.component.html',
})
export class OpcgerDetailPageComponent implements OnInit {
  @Input()
  id?: number;

  @Input()
  value?: IOpcger;

  @Input()
  message?: string;

/** Para usar como UPDATE */
isSaving = false;
catramosSelect: ICatRamos[] = [];

ramsubramoMask = { size: 10, pattern: NATURAL_NUMBERS, mask: 'M{11}' };
monedaMask = { size: 1, pattern: NATURAL_NUMBERS, mask: 'M{2}' };
numnormaMask = { size: 2, pattern: NATURAL_NUMBERS, mask: 'M{3}' };
finivigMask = DATE_MASK;
descnormMask = { size: 30, pattern: LATIN_PATTERNS, mask: 'L{31}' };
valorMask = { size: 15, pattern: ALPHA_NUMERIC_PATTERNS, mask: 'N{16}' };
/* Para usar como UPDATE **/

  editForm = this.fb.group({
    id: [],
    ramsubramo: [],
    moneda: [],
    numnorma: [],
    finivig: [],
    descnorm: [],
    valor1:    [],
    valor2:    [],
    valor3:    [],
    valor4:    [],
    valor5:    [],
    valor6:    [],
    valor7:    [],
    valor8:    [],
    valor9:    [],
    valor10:   [],
    valor11:   [],
    valor12:   [],
    descval1:  [],
    descval2:  [],
    descval3:  [],
    descval4:  [],
    descval5:  [],
    descval6:  [],
    descval7:  [],
    descval8:  [],
    descval9:  [],
    descval10: [],
    descval11: [],
    descval12: [],
  });

  constructor(
    private valueService: OpcgerService,
/** Para usar como UPDATE */
    protected catRamosService: CatRamosService,
/* Para usar como UPDATE **/
    private fb: FormBuilder,
    protected activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.loadExtData();
    this.loadData();
  }

  loadData(): void {
    // eslint-disable-next-line no-console
    // console.log(this.value);
    if (this.id) {
      this.valueService
        .find(this.id)
        .pipe(
          map(res =>
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            res.body! // ? res.body : this.getNewValue()
          )
        )
        .subscribe(
          resBody => (
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            (this.value = resBody), this.loadExtData(), this.updateForm(this.value)
          )
        );
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


  updateForm(value: any): void {
    this.editForm.patchValue({
      ...value,
      finivig: value.finivig ? value.finivig.toDate() : null,
    });
    this.editForm.disable();
  }

  private updateData(): void {
    // eslint-disable-next-line no-console
    console.log(this.value);
    this.updateForm(this.value);
  }

/** Para usar como UPDATE */
  isFormSectionInvalid(section: number): boolean {
    return false;
  }
/* Para usar como UPDATE **/

}
