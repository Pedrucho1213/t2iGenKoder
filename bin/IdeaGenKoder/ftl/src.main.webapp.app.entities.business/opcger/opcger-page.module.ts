import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { SharedModule } from 'app/shared/shared.module';
import { AlertModule } from 'app/shared/alert/alert.module';

import { OpcgerListPageComponent } from './list/opcger-list-page.component';
import { OpcgerDetailDialogComponent } from './detail/opcger-detail-dialog.component';
import { OpcgerDetailPageComponent } from './detail/opcger-detail-page.component';
import { OpcgerUpdateDialogComponent } from './update/opcger-update-dialog.component';
import { OpcgerUpdatePageComponent } from './update/opcger-update-page.component';
import { OpcgerDeleteDialogComponent } from './delete/opcger-delete-dialog.component';
import { OpcgerDeletePageComponent } from './delete/opcger-delete-page.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    FlexLayoutModule,
    SharedModule,
    AlertModule,
  ],
  declarations: [
    OpcgerDeleteDialogComponent,
    OpcgerDeletePageComponent,
    OpcgerDetailDialogComponent,
    OpcgerDetailPageComponent,
    OpcgerListPageComponent,
    OpcgerUpdateDialogComponent,
    OpcgerUpdatePageComponent,
  ],
  entryComponents: [
    OpcgerDeleteDialogComponent,
    OpcgerDetailDialogComponent,
    OpcgerUpdateDialogComponent
  ],
  exports: [
    OpcgerDeletePageComponent,
    OpcgerDetailPageComponent,
    OpcgerListPageComponent,
    OpcgerUpdatePageComponent,
  ],
})
export class OpcgerPageModule {}
