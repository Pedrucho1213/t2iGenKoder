import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { Authority } from 'app/config/authority.constants';

import { UserRouteAccessService } from 'app/core/auth/user-route-access.service';
import { OpcgerComponent } from '../list/opcger.component';
import { OpcgerDetailRouteComponent } from '../detail/opcger-detail-route.component';
// import { OpcgerUpdateRouteComponent } from '../update/opcger-update-route.component';
import { OpcgerRoutingResolveService } from './opcger-routing-resolve.service';

const opcgerRoute: Routes = [
  {
    path: '',
    component: OpcgerComponent,
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'appMain.opcger.home.title',
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: ':id/view',
    component: OpcgerDetailRouteComponent,
    resolve: {
      opcger: OpcgerRoutingResolveService,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'appMain.opcger.home.title',
      breadcrumb: {
        label: 'view',
      },
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: 'new',
    // component: OpcgerUpdateRouteComponent,
    component: OpcgerDetailRouteComponent,
    resolve: {
      opcger: OpcgerRoutingResolveService,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'appMain.opcger.home.title',
      breadcrumb: {
        label: 'new',
      },
    },
    canActivate: [UserRouteAccessService],
  },
  {
    path: ':id/edit',
    // component: OpcgerUpdateRouteComponent,
    component: OpcgerDetailRouteComponent,
    resolve: {
      opcger: OpcgerRoutingResolveService,
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'appMain.opcger.home.title',
      breadcrumb: {
        label: 'edit',
      },
    },
    canActivate: [UserRouteAccessService],
  },
];

@NgModule({
  imports: [RouterModule.forChild(opcgerRoute)],
  exports: [RouterModule],
})
export class OpcgerRoutingModule {}
