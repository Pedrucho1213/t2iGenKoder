import { Component, Input, OnChanges, OnInit } from '@angular/core';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

import { MatDialog } from '@angular/material/dialog';

import { DatePipe } from '@angular/common';

import { TranslateService } from '@ngx-translate/core';
import { ToastrService } from 'ngx-toastr';

import { TableColumn } from 'app/shared/table/table-column.interface';
import { ButtonProperties } from 'app/shared/table/button-properties.model';
import { TableHeaderModel } from 'app/shared/table/table-header.model';

import { ITEMS_PER_PAGE, PAGE_SIZE_OPTION } from 'app/config/pagination.constants';

import { IOpcger, Opcger } from '../opcger.model';
import { OpcgerService } from '../service/opcger.service';
import { OpcgerDeleteDialogComponent } from '../delete/opcger-delete-dialog.component';
import { OpcgerDetailDialogComponent } from '../detail/opcger-detail-dialog.component';
import { OpcgerUpdateDialogComponent } from '../update/opcger-update-dialog.component';

@Component({
  selector: 'app-opcger-list',
  templateUrl: './opcger-list-page.component.html',
})
export class OpcgerListPageComponent implements OnInit, OnChanges {
  isLoading = false;

  @Input()
  keyId: number | undefined;

  list?: any[];
  listPage?: any[];

  @Input()
  hasEdit = false;

  @Input()
  hasView = false;

  @Input()
  hasNew = false;

  @Input()
  hasDelete = false;

  @Input()
  hasAssign = false;

  @Input()
  hasReadOnly = false;

  @Input()
  hasDownload = false;

  @Input()
  hasExport = false;

  @Input()
  ramsubramo: number | undefined;

  totalItems = 0;
  itemsPerPage = ITEMS_PER_PAGE;
  currentPage = 0;
  page!: number;
  pageSize!: number;
  pageSizeOptions = PAGE_SIZE_OPTION;
  predicate!: string;
  ascending!: boolean;

  columns!: TableColumn<any>[]; // 2021-06-29 ati: Para incrustar como sublista
  buttons!: ButtonProperties[];
  headerProperties!: TableHeaderModel;

  constructor(
    protected valueService: OpcgerService,
    private dialog: MatDialog,
    public translateService: TranslateService,
    private toastr: ToastrService
  ) {}

  ngOnInit(): void {
    this.ascending = true;
    this.predicate = 'id';
    this.loadPage();
    // this.registerChangeInList();
    this.setTableConfig();
  }

  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  ngOnChanges(changes: any): void {
    // Hack para regenerar los botones
    this.setTableConfig();
  }

  setTableConfig(): void {
    this.headerProperties = this.getHeaderProperties();
    this.columns = this.getColumns();
    this.buttons = this.getButtons();
  }

  loadPage(page?: any): void {
    this.isLoading = true;
    if (this.list) {
      // TODO Implementar paginacion para cuando sea una lista proporcionada
      this.listPage = [...this.list];
      return;
    }

    if (page?.pageSize && page?.pageSize !== this.itemsPerPage) {
      this.page = 0;
      this.itemsPerPage = page.pageSize;
    }
    // eslint-disable-next-line @typescript-eslint/prefer-optional-chain
    const pageToLoad: number = page && page.pageIndex !== undefined ? page.pageIndex : this.page ? this.page : 0;

    if (this.ramsubramo)
    {
      this.valueService
      .query({
        page: pageToLoad,
        size: this.itemsPerPage,
        sort: this.sort(),
        'ramsubramo.equals': this.ramsubramo,
      })
      .subscribe(
        (res: HttpResponse<any[]>) => {
          this.isLoading = false;
          this.onSuccess(res.body, res.headers, pageToLoad);
        },
        () => {
          this.isLoading = false;
          this.onError();
        }
      );
    }
    else
    {
      this.valueService
      .query({
        page: pageToLoad,
        size: this.itemsPerPage,
        sort: this.sort(),
      })
      .subscribe(
        (res: HttpResponse<any[]>) => {
          this.isLoading = false;
          this.onSuccess(res.body, res.headers, pageToLoad);
        },
        () => {
          this.isLoading = false;
          this.onError();
        }
      );
    }
  }

  sort(): string[] {
    const result = [this.predicate + ',' + (this.ascending ? 'asc' : 'desc')];
    if (this.predicate !== 'id') {
      result.push('id');
    }
    return result;
  }

  protected onSuccess(data: any[] | null, headers: HttpHeaders, page: number): void {
    this.totalItems = Number(headers.get('X-Total-Count'));
    this.page = page;
    this.listPage = data ?? [];
    this.currentPage = this.page;
  }

  protected onError(): void {
    this.currentPage = this.page || 0;
  }

  getColumns(): TableColumn<any>[] {
    const columns: TableColumn<any>[] = [];
    columns.push({ label: 'appMain.opcger.id', property: 'id', type: 'text', visible: false });

    columns.push({ label: 'appMain.opcger.ramsubramo', property: 'ramsubramo', type: 'text', visible: true });
    columns.push({ label: 'appMain.opcger.moneda', property: 'moneda', type: 'text', visible: false });
    columns.push({ label: 'appMain.opcger.moneda_i', property: 'moneda_i', type: 'text', visible: true });
    columns.push({ label: 'appMain.opcger.numnorma', property: 'numnorma', type: 'text', visible: true });
    columns.push({ label: 'appMain.opcger.finivig', property: 'finivig', type: 'pipe',
      pipe: DatePipe, pipeArgs: ['dd-MM-yyyy'], visible: true,
    });
    columns.push({ label: 'appMain.opcger.descnorm', property: 'descnorm', type: 'text', visible: true });

    columns.push({ label: 'table.actions', property: 'buttonsActions', type: 'button', visible: true });
    return columns;
  }

  getHeaderProperties(): TableHeaderModel {
    const headerProperties: TableHeaderModel = {
      header: true,
      search: true,
      filterColumns: true,
      refreshButton: true,
      addButton: this.hasNew,
      expMenu: this.hasExport,
      addTitle: 'appMain.opcger.home.createLabel',
    };
    return headerProperties;
  }

  getButtons(): ButtonProperties[] {
    const buttons: ButtonProperties[] = [];
    // console.log('View: ' + this.hasView);
    if (this.hasView) {
      buttons.push({ title: 'entity.detail.view', actionType: 'view', icon: 'read_more' });
    }
    if (this.hasReadOnly) {
      buttons.push({ title: 'entity.detail.view', actionType: 'readOnly', icon: 'chrome_reader_mode' });
    }
    if (this.hasEdit) {
      buttons.push({ title: 'entity.action.edit', actionType: 'update', icon: 'edit' });
    }
    if (this.hasAssign) {
      buttons.push({ title: 'entity.action.assign', actionType: 'assign', icon: 'archive' });
    }
    if (this.hasDownload) {
      buttons.push({ title: 'entity.action.download-file', actionType: 'download', icon: 'cloud_download' });
    }
    if (this.hasDelete) {
      buttons.push({ title: 'entity.action.delete', actionType: 'delete', icon: 'delete' });
    }

    return buttons;
  }

  buttonsEvents(event: any): void {
    // console.log(event?.row?.folio, event?.actionType);
    const value = event?.row;
    const id = value.id;

    switch (event?.actionType) {
      case 'delete':
        this.delete(value); // 2021-06-17 ati+eja: Omitir "id, " para tomar solo value
        break;
      case 'view':
        this.view(value); // 2021-06-25 ati: Cambiar "id" para tomar value
        break;
      case 'readOnly':
        this.view(value); // 2021-06-25 ati: Cambiar "id" para tomar value
        break;
      case 'update':
        this.update(value); // Pasar value (model en vez de Id)
        break;
      case 'create':
        this.newItem();
        break;
      default:
        break;
    }
  }

  newItem(): void {
    // this.router.navigate(['/opcger/new']);
    const params = { value: new Opcger(), title: 'appMain.opcger.home.createLabel' };
    const dialogRef = this.dialog.open(OpcgerUpdateDialogComponent, { data: params });
    dialogRef.updateSize('60%');
    dialogRef.afterClosed().subscribe((result: any) => {
      if (result === true) {
        this.loadPage();
        this.toastr.success(this.translateService.instant('entity.create.ok'));
      }
      if (result === false) {
        this.toastr.error(this.translateService.instant('entity.create.error'));
      }
    });
  }

  update(value: IOpcger): void {  // Pasar value (model) en vez de update(value: IOpcger): void
    // this.router.navigate(['/opcger', id, 'edit']);
    const params = { value, title: 'appMain.opcger.home.editLabel' };
    const dialogRef = this.dialog.open(OpcgerUpdateDialogComponent, { data: params });
    dialogRef.updateSize('60%');
    dialogRef.afterClosed().subscribe((result: any) => {
      if (result === true) {
        this.loadPage();
        this.toastr.success(this.translateService.instant('entity.update.ok'));
      }
      if (result === false) {
          this.toastr.error(this.translateService.instant('entity.update.error'));
      }
    });
  }

  view(value: IOpcger): void {  // Pasar value (model) en vez de view(id: number): void {
    // this.router.navigate(['/opcger', id, 'view']);
    const params = { value, title: 'appMain.opcger.home.viewLabel' };
    const dialogRef = this.dialog.open(OpcgerDetailDialogComponent, { data: params });
    dialogRef.updateSize('60%');
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    dialogRef.afterClosed().subscribe((result: any) => {
      //
    });
  }

  delete(value: any): void { // 2021-06-17 ati: Omitir id: number, para tomar solo value
    const params = {
//      id, // 2021-06-16 ati: Omitir para que tome parametros?
      value, // : value instanceof Opcger ? value : undefined, // 2021-06-17 ati+eja: Omitir "id, " para tomar solo value
      title: 'appMain.opcger.home.deleteLabel',
    };
    const dialogRef = this.dialog.open(OpcgerDeleteDialogComponent, { data: params });

    dialogRef.updateSize('60%');
    dialogRef.afterClosed().subscribe((result: any) => {
      if (result === true) {
//        this.loadPage();
        this.toastr.success(this.translateService.instant('entity.delete.ok'));
      }
      if (result === false) {
        this.toastr.error(this.translateService.instant('entity.delete.error'));
      }
      this.loadPage(); // 2021-06-17 ati+eja: Forzar refresh
    });
  }
}
