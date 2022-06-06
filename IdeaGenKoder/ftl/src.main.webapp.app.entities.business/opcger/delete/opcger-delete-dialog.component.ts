import { Component, Inject, ViewChild } from '@angular/core';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { EventManager } from 'app/core/util/event-manager.service';

import { OpcgerDeletePageComponent } from './opcger-delete-page.component';

@Component({
  templateUrl: './opcger-delete-dialog.component.html',
})
export class OpcgerDeleteDialogComponent {
  id?: number;
  title?: string;
  message?: string;
  value?: any;
  // parentForm: FormGroup;

  @ViewChild(OpcgerDeletePageComponent, { static: false })
  updateComponent?: OpcgerDeletePageComponent;

  constructor(
    public dialogRef: MatDialogRef<any>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    protected eventManager: EventManager,
    private fb: FormBuilder
  ) {
    this.id = data.id;
    this.message = data.message;
    this.value = data.value;
    if (data.title) {
      this.title = data.title;
    } else {
      this.title = 'entity.delete.title';
    }

    // this.parentForm = this.fb.group({});
  }

  auxSave(error?: boolean): void {
    this.dialogRef.close(error);
    this.eventManager.broadcast('opcgerListModification');
  }

  cancel(): void {
    this.dialogRef.close();
  }
}
