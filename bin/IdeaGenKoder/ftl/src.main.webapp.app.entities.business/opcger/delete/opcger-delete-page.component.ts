import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { Opcger, IOpcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';

@Component({
  selector: 'app-opcger-delete',
  templateUrl: './opcger-delete-page.component.html',
})
export class OpcgerDeletePageComponent implements OnInit {
  @Input()
  id?: number;

  @Input()
  value?: IOpcger;

  @Input()
  message?: string;

  @Output()
  auxSave: EventEmitter<any | undefined> = new EventEmitter();

  isSaving = false;

  constructor(protected valueService: OpcgerService) {}

  ngOnInit(): void {
    this.loadExtData();
    this.loadData();
  }

  loadData(): void {
    // eslint-disable-next-line no-console
    // console.log(`Value Id: ${this.id!}`);
    if (this.id) {
      this.valueService
        .find(this.id)
        .pipe(
          map(res =>
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            res.body ? res.body : this.getNewValue()
          )
        )
        .subscribe(
          resBody => (
            // eslint-disable-next-line @typescript-eslint/no-unsafe-return
            (this.value = resBody), this.loadExtData()
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
        .subscribe(
          resBody => {
          // eslint-disable-next-line @typescript-eslint/no-unsafe-return
          (this.value = resBody), this.loadExtData()
        });
      }
      else
      {
        this.value = this.getNewValue();
      }
    }
  }

  loadExtData(): void {
    // TODO Aqui poner consultas adicionales
  }

  private getNewValue(): any {
    // eslint-disable-next-line @typescript-eslint/no-unsafe-return
    return new Opcger();
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<any>>): void {
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
    this.isSaving = false;
    // eslint-disable-next-line no-console
    // console.log(`Error on delete: ${this.id!}`);
    // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
    if (this.auxSave) {
      this.auxSave.emit(false);
    }
  }
/* 2021-06-17 ati+eja: Omitir "id, " para tomar solo value
  doDelete(id: number | undefined): void {
    if (!id) {
      return;
    }
    this.isSaving = true;
    this.subscribeToSaveResponse(this.valueService.deleteByData(id, this.value!));
  }
*/
  doDeleteIdVal(): void {
    if (this.value) {
//      this.doDelete(this.value.id);// 2021-06-17 ati+eja: Omitir "id, " para tomar solo value
      this.isSaving = true;
      this.subscribeToSaveResponse(this.valueService.deleteByData(this.value.id!, this.value));
      }
  }

}
