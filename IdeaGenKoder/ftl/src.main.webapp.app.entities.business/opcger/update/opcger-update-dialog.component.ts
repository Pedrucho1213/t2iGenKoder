import { Component, Inject, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EventManager } from 'app/core/util/event-manager.service';

import { OpcgerUpdatePageComponent } from './opcger-update-page.component';

@Component({
  templateUrl: './opcger-update-dialog.component.html',
})
export class OpcgerUpdateDialogComponent {
  id?: number;
  title?: string;
  message?: string;
  value?: any;
  isSaving = false;

  parentForm = this.fb.group({});

  @ViewChild(OpcgerUpdatePageComponent, { static: false })
  updateComponent?: OpcgerUpdatePageComponent;

  constructor(
    public dialogRef: MatDialogRef<any>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    protected eventManager: EventManager,
    private fb: FormBuilder
  ) {
    this.id = data.id;
    this.title = data.title;
    this.message = data.message;
    this.value = data.value;
  }

  auxSave(error?: boolean): void {
    this.dialogRef.close(error);
    this.eventManager.broadcast('opcgerListModification');
  }

  close(): void {
    this.dialogRef.close();
  }

  formChange(name: string, form: FormGroup): void {
    this.parentForm.setControl(name, form);
  }

  getUpdatedValue(value: any): void {
    this.value = value;
  }
}
