import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Router } from '@angular/router';
import { Observable, of, EMPTY } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

import { IOpcger, Opcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';

@Injectable({ providedIn: 'root' })
export class OpcgerRoutingResolveService implements Resolve<IOpcger> {
  constructor(
    protected service: OpcgerService, 
    protected router: Router
  ) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IOpcger> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        mergeMap((result: HttpResponse<Opcger>) => {
          if (result.body) {
            return of(result.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new Opcger());
  }
}
