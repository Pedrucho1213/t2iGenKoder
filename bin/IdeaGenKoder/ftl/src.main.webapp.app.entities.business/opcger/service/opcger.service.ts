import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { isPresent } from 'app/core/util/operators';
import { ApplicationConfigService } from 'app/core/util/application-config.service';
import { createRequestOption } from 'app/core/request/request-util';
import { convertDate } from 'app/core/util/date.service';
import { map } from 'rxjs/operators';
import { IOpcger, getOpcgerIdentifier } from '../opcger.model';

export type EntityResponseType = HttpResponse<IOpcger>;
export type EntityArrayResponseType = HttpResponse<IOpcger[]>;

@Injectable({ providedIn: 'root' })
export class OpcgerService {
  public resourceUrl = this.applicationConfigService.getEndpointFor('api/opcger');

  constructor(protected http: HttpClient, private applicationConfigService: ApplicationConfigService) {}

  create(opcger: IOpcger): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(opcger);
    return this.http.post<IOpcger>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    ;
  }

  update(opcger: IOpcger): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(opcger);
    return this.http.put<IOpcger>(`${this.resourceUrl}/${getOpcgerIdentifier(copy) as number}`, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    ;
  }

  partialUpdate(opcger: IOpcger): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(opcger);
    return this.http.patch<IOpcger>(`${this.resourceUrl}/${getOpcgerIdentifier(copy) as number}`, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    ;
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IOpcger>(`${this.resourceUrl}/${id}`, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)))
    ;
  }

  findByData(id: number, opcger: IOpcger): Observable<EntityResponseType> { // TODO: Recibir param en BackEnd
    return this.http.get<IOpcger>(`${this.resourceUrl}/${id}?ramsubramo=${opcger.ramsubramo!}&moneda=${opcger.moneda!}&numnorma=${opcger.numnorma!}&finivig=${opcger.finivig!.toISOString()}`, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)))
    ;
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IOpcger[]>(this.resourceUrl, { params: options, observe: 'response' })
      .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
    ;
  }

  deleteOLD(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  deleteByData(id: number, opcger: IOpcger): Observable<EntityResponseType> { // TODO: Recibir param en BackEnd
    return this.http.delete(`${this.resourceUrl}/${id}?ramsubramo=${opcger.ramsubramo!}&moneda=${opcger.moneda!}&numnorma=${opcger.numnorma!}&finivig=${opcger.finivig!.toISOString()}`, { observe: 'response' });
  }

  addToCollectionIfMissing(opcgerCollection: IOpcger[], ...opcgersToCheck: (IOpcger | null | undefined)[]): IOpcger[] {
    const opcgers: IOpcger[] = opcgersToCheck.filter(isPresent);
    if (opcgers.length > 0) {
      const opcgerCollectionIdentifiers = opcgerCollection.map(opcgerItem => getOpcgerIdentifier(opcgerItem)!);
      const opcgersToAdd = opcgers.filter(opcgerItem => {
        const opcgerIdentifier = getOpcgerIdentifier(opcgerItem);
        if (opcgerIdentifier == null || opcgerCollectionIdentifiers.includes(opcgerIdentifier)) {
          return false;
        }
        opcgerCollectionIdentifiers.push(opcgerIdentifier);
        return true;
      });
      return [...opcgersToAdd, ...opcgerCollection];
    }
    return opcgerCollection;
  }

  protected convertDateFromClient(opcger: IOpcger): IOpcger {
    return Object.assign({}, opcger, {
      finivig: convertDate(opcger.finivig),
    });
  }

  protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
    if (res.body) {
      res.body.finivig = convertDate(res.body.finivig); // 2021-06-17 ati: TODO: No parece necesario
    }
    return res;
  }

  protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
    if (res.body) {
      res.body.forEach((opcger: IOpcger) => {
        opcger.finivig = convertDate(opcger.finivig);
      });
    }
    return res;
  }
}
