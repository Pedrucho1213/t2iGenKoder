import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { SharedModule } from 'app/shared/shared.module';

import { OpcgerComponent } from './list/opcger.component';
import { OpcgerDetailRouteComponent } from './detail/opcger-detail-route.component';
import { OpcgerPageModule } from './opcger-page.module';
import { OpcgerRoutingModule } from './route/opcger-routing.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    FlexLayoutModule,
    SharedModule,
    OpcgerPageModule,
    OpcgerRoutingModule
  ],
  declarations: [
    OpcgerComponent,
    OpcgerDetailRouteComponent,
  ],
})
export class OpcgerModule {}
