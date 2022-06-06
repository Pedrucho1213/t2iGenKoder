import { Component, Inject, ViewChild } from '@angular/core';

import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { EventManager } from 'app/core/util/event-manager.service';

import { OpcgerDetailPageComponent } from './opcger-detail-page.component';

@Component({
  templateUrl: './opcger-detail-dialog.component.html',
})
export class OpcgerDetailDialogComponent {
  id?: number;
  title?: string;
  message?: string;
  value?: any;

  @ViewChild(OpcgerDetailPageComponent, { static: false })
  updateComponent?: OpcgerDetailPageComponent;

  constructor(public dialogRef: MatDialogRef<any>, @Inject(MAT_DIALOG_DATA) public data: any, protected eventManager: EventManager) {
    this.id = data.id;
    this.message = data.message;
    this.value = data.value;
    if (data.title) {
      this.title = data.title;
    } else {
      this.title = 'entity.action.detail';
    }
  }

  cancel(): void {
    this.dialogRef.close();
  }
}
