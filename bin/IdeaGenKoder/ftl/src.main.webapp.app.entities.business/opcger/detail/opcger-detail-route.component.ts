import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
// import { Observable } from 'rxjs';

import { IOpcger } from '../opcger.model';

@Component({
  templateUrl: './opcger-detail-route.component.html',
})
export class OpcgerDetailRouteComponent implements OnInit {
  value?: IOpcger;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ value }) => {
      this.value = value;
    });
    // TODO Convertir correctamente
    // this.value = this.activatedRoute.data;
  }

  previousState(): void {
    window.history.back();
  }
}
