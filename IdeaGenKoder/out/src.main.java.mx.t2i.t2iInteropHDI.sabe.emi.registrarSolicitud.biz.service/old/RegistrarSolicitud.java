package mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger; // import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Agente;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Asegurado;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Cobertura;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.ConductoCobro;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Contratante;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Endoso;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.biz.model.Recibo;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Asggmcc0;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Cobgmcc0;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Endogmc0;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Polgmcc0;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Polgmcc0Agente;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.model.Rbogmcc0;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.core.service.Polgmcc0CoreService;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.ReqRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespAsegurado;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespCobertura;
import mx.t2i.t2iInteropHDI.sabe.emi.registrarSolicitud.ws.model.RespRegistrarSolicitud;
import mx.t2i.t2iInteropHDI.util.UtilConstants;
import mx.t2i.tekhne.core.exceptions.ServiceException;
import mx.t2i.tekhne.core.exceptions.ServiceExceptionDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;
/**
 * Despachador (Dispatcher) del servicio para ConsultarAsegurado
 */

@Service
public class RegistrarSolicitudService {
	/** The logger. */
	private final Logger log = LoggerFactory.getLogger(RegistrarSolicitudService.class);

	@Autowired
	private Polgmcc0CoreService coreService;

	@Autowired
	private RespRegistrarSolicitud wsModel;

	/**
	 * Constructor default
	 */
	public RegistrarSolicitudService() {
		super();
	}

	/**
	 * Obtener Respuesta del core service
	 *
	 * @return RespRegistrarSolicitud- response
	 * @throws ServiceException
	 */
	public RespRegistrarSolicitud registrarSolicitud(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respuesta = null;

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("DUMMY")) {
			respuesta = registrarSolicitudDummy( reqRegistrarSolicitud );
		} else if (contrat.contentEquals("ERROR")) {
			respuesta = registrarSolicitudDummyError( reqRegistrarSolicitud );
		} else if (contrat.contentEquals("EXCEPTION")) {
			respuesta = registrarSolicitudDummyException( reqRegistrarSolicitud );
		} else {
			respuesta = registrarSolicitudDesdeCore( reqRegistrarSolicitud );
		}
		return respuesta;
	}

	public RespRegistrarSolicitud registrarSolicitudDesdeCore(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respuesta = new RespRegistrarSolicitud();

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		respuesta.setStatusCode(+1);
		respuesta.setMessage("CORE SERVICE NOT IMPLEMMENTED YET");

/***
		Polgmcc0 coreRequest = new Polgmcc0();
		coreRequest.getPolgmcc0Poliza().setRamsubramo(ramsubramo);

		try {
			Polgmcc0 respCorePolgmcc0 = coreService.getCore(coreRequest);
			respuesta.setMessage(respCorePolgmcc0.getMessage());
			log.debug("respuesta.getMessage(): ["+respuesta.getMessage()+"]");

			transformCoreModelToWsModel(respCorePolgmcc0, respuesta);

			respuesta.setMessage(respCorePolgmcc0.getMessage());
			if ((respuesta.getMessage() != null) && (! respuesta.equals("")))
			{
				respuesta.setStatusCode(-1);
			}
			log.debug("respuesta: "+respuesta);
		} catch (Exception ex) {
			String msg = UtilConstants.MSG_ERR_CORE;
			log.error(msg+": " + ex.getMessage());
			// 2021-03-10 ati: En lugar de levantar Exception responder con statusCode=1 de manera controlada
///			throw ServiceExceptionDetails.buildServiceException("-1", msg, new String[] { msg });
			respuesta.setMessage(msg);
			respuesta.setStatusCode(-1); // 2021-03-11 ati+lra+czg: Acordamos mandar -1 como en caso de Error como se dijo al definir
		}
***/
		return respuesta;
	}

	protected void transformCoreModelToWsModel(Polgmcc0 coreModel, RespRegistrarSolicitud wsModel)
			throws ServiceException {
/***
		wsModel.getPoliza().setRamsubramo( coreModel.getPolgmcc0Poliza().getRamsubramo() );
		wsModel.getPoliza().setNumPoliza( coreModel.getPolgmcc0Poliza().getNpoliza() );
		wsModel.getPoliza().setNumSubgrupo( coreModel.getPolgmcc0Poliza().getNsubgpo() );
		wsModel.getPoliza().setNdepend( coreModel.getPolgmcc0Poliza().getNaseg() );
		wsModel.getPoliza().setAnioVigencia( coreModel.getPolgmcc0Poliza().getAavig() );
		wsModel.getPoliza().setTipoProducto( coreModel.getPolgmcc0Poliza().getTpproducto() );
		wsModel.getPoliza().setFechaEmision( coreModel.getPolgmcc0Poliza().getFemipol() );
		wsModel.getPoliza().setInicioVigenciaAseg( coreModel.getPolgmcc0Poliza().getFinivig() );
		wsModel.getPoliza().setFinVigenciaAseg( coreModel.getPolgmcc0Poliza().getFtervig() );
		wsModel.getPoliza().setStatusAsegurado( coreModel.getPolgmcc0Poliza().getStpoliza_i() );
		wsModel.getPoliza().setFechaStatusAseg( coreModel.getPolgmcc0Poliza().getFstat() );
		wsModel.getPoliza().setCausaCancelacion( coreModel.getPolgmcc0Poliza().getCausacan() );
		wsModel.getPoliza().setDescrMonedaI( coreModel.getPolgmcc0Poliza().getMoneda_i() );
		wsModel.getPoliza().setIdFormaPago( coreModel.getPolgmcc0Poliza().getNesqfpago() );
		wsModel.getPoliza().setDescrFormaPago( coreModel.getPolgmcc0Poliza().getDescfpago() );
		wsModel.getPoliza().setPrimaInicial( coreModel.getPolgmcc0Poliza().getPmaisfp() );
		wsModel.getPoliza().setPrimaSubsecuente( coreModel.getPolgmcc0Poliza().getPmassfp() );
		wsModel.getPoliza().setPrima( coreModel.getPolgmcc0Poliza().getPrima() );
		wsModel.getPoliza().setRecargo( coreModel.getPolgmcc0Poliza().getRecargo() );
		wsModel.getPoliza().setGastoExpedicion( coreModel.getPolgmcc0Poliza().getGexp() );
		wsModel.getPoliza().setImpuesto( coreModel.getPolgmcc0Poliza().getImpto() );
		wsModel.getPoliza().setPrimaTotal( coreModel.getPolgmcc0Poliza().getPrimatot() );
		wsModel.getPoliza().setNumPolizaOrigen( coreModel.getPolgmcc0Poliza().getNpolorg() );
		wsModel.getPoliza().setNumPolizaRenov( coreModel.getPolgmcc0Poliza().getRenovpol() );
		wsModel.getPoliza().setIdProducto( coreModel.getPolgmcc0Poliza().getIdproducto() );
		wsModel.getPoliza().setDescrRamo( coreModel.getPolgmcc0Poliza().getNombramo() );
		wsModel.getPoliza().setOficina( coreModel.getPolgmcc0Poliza().getOfnapol() );
		wsModel.getPoliza().setLineaNegocio( coreModel.getPolgmcc0Poliza().getLnegocio() );

		List<Polgmcc0Agente> coreAgenteList = coreModel.getPolgmcc0Agentes();
		for (Polgmcc0Agente polgmcc0Agente : coreAgenteList)
		{
			Agente agente = new Agente();

			agente.setIdAgente( polgmcc0Agente.getNagente() );
			agente.setNombreAgente( polgmcc0Agente.getNombagte() );
			agente.setPorcPartc( polgmcc0Agente.getPorcpart() );

			wsModel.getAgentes().add(agente);
		}

		wsModel.getContratante().setNombreContratante( coreModel.getPolgmcc0Contratante().getContrat() );
		wsModel.getContratante().setTipoPersona( coreModel.getPolgmcc0Contratante().getCvcontrat_i() );
		wsModel.getContratante().setRfcContratante( coreModel.getPolgmcc0Contratante().getRfc() );
		wsModel.getContratante().seteMail( coreModel.getPolgmcc0Contratante().getEmail() ); // 2021-03-05 ati: Atributo definido en wsModel como eMail en vez de email
		wsModel.getContratante().setCalle( coreModel.getPolgmcc0Contratante().getCalle() );
		wsModel.getContratante().setNumExt( coreModel.getPolgmcc0Contratante().getNumext() );
		wsModel.getContratante().setNumInt( coreModel.getPolgmcc0Contratante().getNumint() );
		wsModel.getContratante().setColonia( coreModel.getPolgmcc0Contratante().getColonia() );
		wsModel.getContratante().setPoblacion( coreModel.getPolgmcc0Contratante().getPoblacion() );
		wsModel.getContratante().setCodigoPostal( coreModel.getPolgmcc0Contratante().getCodpost() );
		wsModel.getContratante().setCveEstado( coreModel.getPolgmcc0Contratante().getEdo() );
		wsModel.getContratante().setEstado( coreModel.getPolgmcc0Contratante().getEdo_i() );
		wsModel.getContratante().setReferencia( coreModel.getPolgmcc0Contratante().getReferencia() );

		wsModel.getConductoCobro().setTitularCuenta( coreModel.getPolgmcc0ConductoCobro().getTitcuenta() );
		wsModel.getConductoCobro().setNumCuenta( coreModel.getPolgmcc0ConductoCobro().getCvetarj() );
		wsModel.getConductoCobro().setCveBanco( coreModel.getPolgmcc0ConductoCobro().getCvtdc() );
		wsModel.getConductoCobro().setSucursal( coreModel.getPolgmcc0ConductoCobro().getSucursal() );
		wsModel.getConductoCobro().setTipoCondCobro( coreModel.getPolgmcc0ConductoCobro().getTpconcob_i() );
		wsModel.getConductoCobro().setTipoCuenta( coreModel.getPolgmcc0ConductoCobro().getTpcuenta() );
		wsModel.getConductoCobro().setFuncionario( coreModel.getPolgmcc0ConductoCobro().getFuncionari() );
		wsModel.getConductoCobro().setAaVencimiento( coreModel.getPolgmcc0ConductoCobro().getAavto() );
		wsModel.getConductoCobro().setMmVencimiento( coreModel.getPolgmcc0ConductoCobro().getMmvto() );
		wsModel.getConductoCobro().setTipoTarjeta( coreModel.getPolgmcc0ConductoCobro().getTpcuenta_i() );

		List<Asggmcc0> asggmcc0List = coreModel.getAsggmcc0List();
		for (Asggmcc0 asggmcc0 : asggmcc0List)
		{
			Asegurado asegurado = new Asegurado();

			asegurado.setNumCertificado( asggmcc0.getNaseg() );
			asegurado.setNumDependiente( asggmcc0.getNdepend() );
			asegurado.setNombreAsegurado( asggmcc0.getNombre() );
			asegurado.setFechaNacimiento( asggmcc0.getFnac() );
			asegurado.setSexo( asggmcc0.getCvsexo_i() );
			asegurado.setParentesco( asggmcc0.getCvparent_i() );
			asegurado.setAntiguedad( asggmcc0.getAntigseg() );
			asegurado.setEdadReal( asggmcc0.getEdadreal() );
			asegurado.setEdadCalculo( asggmcc0.getEdadcalc() );

			wsModel.getAsegurados().add(asegurado);
		}

		List<Rbogmcc0> rbogmcc0List = coreModel.getRbogmcc0List();
		for (Rbogmcc0 rbogmcc0 : rbogmcc0List)
		{
			Recibo recibo = new Recibo();

			recibo.setFolioRecibo( rbogmcc0.getFoliorbo() );
			recibo.setFechaEmisionRbo( rbogmcc0.getFemirbo() );
			recibo.setFPago( rbogmcc0.getFpago() );
			recibo.setIdTipoRecibo( rbogmcc0.getTprbo() );
			recibo.setIdStatusRecibo( rbogmcc0.getStrbo() );
			recibo.setFStatusRecibo( rbogmcc0.getFstat() );
			recibo.setDescrStatusRecibo( rbogmcc0.getStrbo_i() );
			recibo.setImporte( rbogmcc0.getPma() );
			recibo.setRecargoRecibo( rbogmcc0.getRgo() );
			recibo.setGastoExpedicionRbo( rbogmcc0.getGexp() );
			recibo.setInicioVigenciaRecibo( rbogmcc0.getFinivig() );
			recibo.setFinVigenciaRecibo( rbogmcc0.getFtervig() );
			recibo.setPrimaTotalRecibo( rbogmcc0.getPmatotal() );
			recibo.setComisionAgente( rbogmcc0.getComag() );
			recibo.setImpuestoRecibo( rbogmcc0.getImpto() );

			wsModel.getRecibos().add(recibo);
		}

		List<Endogmc0> endogmc0List = coreModel.getEndogmc0List();
		for (Endogmc0 endogmc0 : endogmc0List)
		{
			Endoso endoso = new Endoso();

			endoso.setFolioEndoso( endogmc0.getFolendoso() );
			endoso.setNumEndoso( endogmc0.getNendoso() );
			endoso.setIdStatusEndoso( endogmc0.getStendoso() );
			endoso.setFStatusEndoso( endogmc0.getFstat() );
			endoso.setIdTipoEndoso( endogmc0.getTpendoso() );
			endoso.setDescrTipoEndoso( endogmc0.getTpendoso_i() );
			endoso.setIdCveMovimiento( endogmc0.getMovendoso() );
			endoso.setDescrCveMovto( endogmc0.getMovendoso_i() );

			wsModel.getEndosos().add(endoso);
		}

		// 2021-03-08 ati: Como el WS solo pide de 1 asegurado a la vez, cargar las coberturas a c/u conforme a su NumDependiente
		for (Asegurado asegurado : wsModel.getAsegurados())
		{
			for (Cobgmcc0 cobgmcc0 : coreModel.getCobgmcc0List()) {
				if (cobgmcc0.getNdepend() == asegurado.getNumDependiente())
				{
					Cobertura cobertura = new Cobertura();

					cobertura.setIdCveCobertura( cobgmcc0.getCvcob() );
					cobertura.setIdCveCobAdicional( cobgmcc0.getCvcobadi() );
					cobertura.setNombreCobertura( cobgmcc0.getNombrecob() );
					cobertura.setLimiteMaximo( cobgmcc0.getLimitemax() );
					cobertura.setDeducibleCob( cobgmcc0.getDeducible() );
					cobertura.setPrimaCob( cobgmcc0.getPmaanual() );
					cobertura.setExtraPrima( cobgmcc0.getEpmaanual() );
					cobertura.setEdadCalculoCob( cobgmcc0.getEdadcalc() );
					cobertura.setPlazoSeguro( cobgmcc0.getPzoseg() );
					cobertura.setPlazoPago( cobgmcc0.getPzopago() );
					cobertura.setSumaAsegurada( cobgmcc0.getSa() );
					cobertura.setCoaseguro( cobgmcc0.getCoaseguro() );
					cobertura.setInicioVigenciaCob( cobgmcc0.getFinivig() );
					cobertura.setFinVigenciaCob( cobgmcc0.getFtervig() );
					cobertura.setNivelHospitalario( cobgmcc0.getNivelhosp() );
					cobertura.setDescrNivelHosp( cobgmcc0.getNivelhosp_i() );
					cobertura.setZonaHospital( cobgmcc0.getZonahosp() );
					cobertura.setDescrZonaHospital( cobgmcc0.getZonahosp_i() );
					cobertura.setTipoDeducible( cobgmcc0.getTpdeduc() );
					cobertura.setDescrTipoDeduc( cobgmcc0.getTpdeduc_i() );

					asegurado.getCoberturas().add(cobertura);
				}
			}

		}
***/
		wsModel.setMessage(coreModel.getMessage());
	}

	protected void transformWsModelToCoreModel(RespRegistrarSolicitud wsModel, Polgmcc0 coreModel)
			throws ServiceException {
/***
		coreModel.getPolgmcc0Poliza().setRamsubramo( wsModel.getPoliza().getRamsubramo() );
		coreModel.getPolgmcc0Poliza().setNpoliza( wsModel.getPoliza().getNumPoliza() );
		coreModel.getPolgmcc0Poliza().setNsubgpo( wsModel.getPoliza().getNumSubgrupo() );
		coreModel.getPolgmcc0Poliza().setNaseg( wsModel.getPoliza().getNdepend() );
		coreModel.getPolgmcc0Poliza().setAavig( wsModel.getPoliza().getAnioVigencia() );
		coreModel.getPolgmcc0Poliza().setTpproducto( wsModel.getPoliza().getTipoProducto() );
		coreModel.getPolgmcc0Poliza().setFemipol( wsModel.getPoliza().getFechaEmision() );
		coreModel.getPolgmcc0Poliza().setFinivig( wsModel.getPoliza().getInicioVigenciaAseg() );
		coreModel.getPolgmcc0Poliza().setFtervig( wsModel.getPoliza().getFinVigenciaAseg() );
		coreModel.getPolgmcc0Poliza().setStpoliza_i( wsModel.getPoliza().getStatusAsegurado() );
		coreModel.getPolgmcc0Poliza().setFstat( wsModel.getPoliza().getFechaStatusAseg() );
		coreModel.getPolgmcc0Poliza().setCausacan( wsModel.getPoliza().getCausaCancelacion() );
		coreModel.getPolgmcc0Poliza().setMoneda_i( wsModel.getPoliza().getDescrMonedaI() );
		coreModel.getPolgmcc0Poliza().setNesqfpago( wsModel.getPoliza().getIdFormaPago() );
		coreModel.getPolgmcc0Poliza().setDescfpago( wsModel.getPoliza().getDescrFormaPago() );
		coreModel.getPolgmcc0Poliza().setPmaisfp( wsModel.getPoliza().getPrimaInicial() );
		coreModel.getPolgmcc0Poliza().setPmassfp( wsModel.getPoliza().getPrimaSubsecuente() );
		coreModel.getPolgmcc0Poliza().setPrima( wsModel.getPoliza().getPrima() );
		coreModel.getPolgmcc0Poliza().setRecargo( wsModel.getPoliza().getRecargo() );
		coreModel.getPolgmcc0Poliza().setGexp( wsModel.getPoliza().getGastoExpedicion() );
		coreModel.getPolgmcc0Poliza().setImpto( wsModel.getPoliza().getImpuesto() );
		coreModel.getPolgmcc0Poliza().setPrimatot( wsModel.getPoliza().getPrimaTotal() );
		coreModel.getPolgmcc0Poliza().setNpolorg( wsModel.getPoliza().getNumPolizaOrigen() );
		coreModel.getPolgmcc0Poliza().setRenovpol( wsModel.getPoliza().getNumPolizaRenov() );
		coreModel.getPolgmcc0Poliza().setIdproducto( wsModel.getPoliza().getIdProducto() );
		coreModel.getPolgmcc0Poliza().setNombramo( wsModel.getPoliza().getDescrRamo() );
		coreModel.getPolgmcc0Poliza().setOfnapol( wsModel.getPoliza().getOficina() );
		coreModel.getPolgmcc0Poliza().setLnegocio( wsModel.getPoliza().getLineaNegocio() );

		List<Agente> agentes = wsModel.getAgentes();
		for (Agente agente : agentes) {
			Polgmcc0Agente polgmcc0Agente = new Polgmcc0Agente();
			coreModel.getPolgmcc0Agentes().add(polgmcc0Agente);

			polgmcc0Agente.setNagente( agente.getIdAgente() );
			polgmcc0Agente.setNombagte( agente.getNombreAgente() );
			polgmcc0Agente.setPorcpart( agente.getPorcPartc() );
		}

		coreModel.getPolgmcc0Contratante().setContrat( wsModel.getContratante().getNombreContratante() );
		coreModel.getPolgmcc0Contratante().setCvcontrat_i( wsModel.getContratante().getTipoPersona() );
		coreModel.getPolgmcc0Contratante().setRfc( wsModel.getContratante().getRfcContratante() );
		coreModel.getPolgmcc0Contratante().setEmail( wsModel.getContratante().geteMail() ); // 2021-03-05 ati: Atributo definido como eMail en vez de email
		coreModel.getPolgmcc0Contratante().setCalle( wsModel.getContratante().getCalle() );
		coreModel.getPolgmcc0Contratante().setNumext( wsModel.getContratante().getNumExt() );
		coreModel.getPolgmcc0Contratante().setNumint( wsModel.getContratante().getNumInt() );
		coreModel.getPolgmcc0Contratante().setColonia( wsModel.getContratante().getColonia() );
		coreModel.getPolgmcc0Contratante().setPoblacion( wsModel.getContratante().getPoblacion() );
		coreModel.getPolgmcc0Contratante().setCodpost( wsModel.getContratante().getCodigoPostal() );
		coreModel.getPolgmcc0Contratante().setEdo( wsModel.getContratante().getCveEstado() );
		coreModel.getPolgmcc0Contratante().setEdo_i( wsModel.getContratante().getEstado() );
		coreModel.getPolgmcc0Contratante().setReferencia( wsModel.getContratante().getReferencia() );

		coreModel.getPolgmcc0ConductoCobro().setTitcuenta( wsModel.getConductoCobro().getTitularCuenta() );
		coreModel.getPolgmcc0ConductoCobro().setCvetarj( wsModel.getConductoCobro().getNumCuenta() );
		coreModel.getPolgmcc0ConductoCobro().setCvtdc( wsModel.getConductoCobro().getCveBanco() );
		coreModel.getPolgmcc0ConductoCobro().setSucursal( wsModel.getConductoCobro().getSucursal() );
		coreModel.getPolgmcc0ConductoCobro().setTpconcob_i( wsModel.getConductoCobro().getTipoCondCobro() );
		coreModel.getPolgmcc0ConductoCobro().setTpcuenta( wsModel.getConductoCobro().getTipoCuenta() );
		coreModel.getPolgmcc0ConductoCobro().setFuncionari( wsModel.getConductoCobro().getFuncionario() );
		coreModel.getPolgmcc0ConductoCobro().setAavto( wsModel.getConductoCobro().getAaVencimiento() );
		coreModel.getPolgmcc0ConductoCobro().setMmvto( wsModel.getConductoCobro().getMmVencimiento() );
		coreModel.getPolgmcc0ConductoCobro().setTpcuenta_i( wsModel.getConductoCobro().getTipoTarjeta() );

		List<Asegurado> asegurados = wsModel.getAsegurados();
		for (Asegurado asegurado : asegurados)
		{
			Asggmcc0 asggmcc0 = new Asggmcc0();
			coreModel.getAsggmcc0List().add(asggmcc0);

			asggmcc0.setNaseg( asegurado.getNumCertificado() );
			asggmcc0.setNdepend( asegurado.getNumDependiente() );
			asggmcc0.setNombre( asegurado.getNombreAsegurado() );
			asggmcc0.setFnac( asegurado.getFechaNacimiento() );
			asggmcc0.setCvsexo_i( asegurado.getSexo() );
			asggmcc0.setCvparent_i( asegurado.getParentesco() );
			asggmcc0.setAntigseg( asegurado.getAntiguedad() );
			asggmcc0.setEdadreal( asegurado.getEdadReal() );
			asggmcc0.setEdadcalc( asegurado.getEdadCalculo() );
		}

		List<Recibo> recibos = wsModel.getRecibos();
		for (Recibo recibo : recibos) {

			Rbogmcc0 rbogmcc0 = new Rbogmcc0();
			coreModel.getRbogmcc0List().add(rbogmcc0);

			rbogmcc0.setFoliorbo( recibo.getFolioRecibo() );
			rbogmcc0.setFemirbo( recibo.getFechaEmisionRbo() );
			rbogmcc0.setFpago( recibo.getFPago() );
			rbogmcc0.setTprbo( recibo.getIdTipoRecibo() );
			rbogmcc0.setStrbo( recibo.getIdStatusRecibo() );
			rbogmcc0.setFstat( recibo.getFStatusRecibo() );
			rbogmcc0.setStrbo_i( recibo.getDescrStatusRecibo() );
			rbogmcc0.setPma( recibo.getImporte() );
			rbogmcc0.setRgo( recibo.getRecargoRecibo() );
			rbogmcc0.setGexp( recibo.getGastoExpedicionRbo() );
			rbogmcc0.setFinivig( recibo.getInicioVigenciaRecibo() );
			rbogmcc0.setFtervig( recibo.getFinVigenciaRecibo() );
			rbogmcc0.setPmatotal( recibo.getPrimaTotalRecibo() );
			rbogmcc0.setComag( recibo.getComisionAgente() );
			rbogmcc0.setImpto( recibo.getImpuestoRecibo() );
		}

		List<Endoso> endosos = wsModel.getEndosos();
		for (Endoso endoso : endosos) {

			Endogmc0 endogmc0 = new Endogmc0();
			coreModel.getEndogmc0List().add(endogmc0);

			endogmc0.setFolendoso( endoso.getFolioEndoso() );
			endogmc0.setNendoso( endoso.getNumEndoso() );
			endogmc0.setStendoso( endoso.getIdStatusEndoso() );
			endogmc0.setFstat( endoso.getFStatusEndoso() );
			endogmc0.setTpendoso( endoso.getIdTipoEndoso() );
			endogmc0.setTpendoso_i( endoso.getDescrTipoEndoso() );
			endogmc0.setMovendoso( endoso.getIdCveMovimiento() );
			endogmc0.setMovendoso_i( endoso.getDescrCveMovto() );
		}
***/
		coreModel.setMessage(wsModel.getMessage());

	}

	public RespRegistrarSolicitud registrarSolicitudDummy(ReqRegistrarSolicitud reqRegistrarSolicitud) throws ServiceException
	{
//		RespRegistrarSolicitud wsModel = new RespRegistrarSolicitud();

		wsModel.getRespCliente().setNumcliente( 123 );
		wsModel.getRespCliente().setStatusCode( 0 );
		wsModel.getRespCliente().setMessage(new String( "" ));

		wsModel.getRespPoliza().setRamsubramo(new String( "1010" ));
		wsModel.getRespPoliza().setNpoliza(  1234 );
		wsModel.getRespPoliza().setStatusCode( 0 );
		wsModel.getRespPoliza().setMessage(new String( "" ));

		RespAsegurado respAsegurado = new RespAsegurado();
		respAsegurado.setCoberturas( new ArrayList<RespCobertura>() );// Asignar instancia porque no aplica @Autowired
		respAsegurado.setRamsubramo( "1010" );
		respAsegurado.setNpoliza( 1234 );
		respAsegurado.setNdepend( 0 );
		wsModel.getRespPoliza().getAsegurados().add(respAsegurado);

		RespCobertura respCobertura = new RespCobertura();
		respCobertura.setRamsubramo( "1010/ " );
		respCobertura.setNpoliza( 1234 );
		respCobertura.setNdepend( 0 );
		respCobertura.setTipoadic( 0 );
		respAsegurado.getCoberturas().add(respCobertura);

		RespAsegurado respAsegurado1 = new RespAsegurado();
		respAsegurado1.setCoberturas( new ArrayList<RespCobertura>() );// Asignar instancia porque no aplica @Autowired
		respAsegurado1.setRamsubramo( "1010" );
		respAsegurado1.setNpoliza( 1234 );
		respAsegurado1.setNdepend( 1 );
		wsModel.getRespPoliza().getAsegurados().add(respAsegurado1);

		RespCobertura respCobertura1 = new RespCobertura();
		respCobertura1.setRamsubramo( "1010" );
		respCobertura1.setNpoliza( 1234 );
		respCobertura1.setNdepend( 0 );
		respCobertura1.setTipoadic( 1 );
		respAsegurado1.getCoberturas().add(respCobertura1);

/***
		wsModel.getCliente().setCvperson(new Integer( 0 ));
		wsModel.getCliente().setContrat(new String( "MR. DUMMY" ));
		wsModel.getCliente().setAppat(new String( "FAKE" ));
		wsModel.getCliente().setApmat(new String( "" ));
		wsModel.getCliente().setNombre(new String( "DUMMY" ));
		wsModel.getCliente().setEdocivil(new Integer( 0 ));
		wsModel.getCliente().setCvsexo(new Integer( 0 ));
		wsModel.getCliente().setFnac(new Date( ));
		wsModel.getCliente().setCalle(new String( "CALLE DE LA AMARGURA" ));
		wsModel.getCliente().setNumext(new String( "666" ));
		wsModel.getCliente().setNumint(new String( "H" ));
		wsModel.getCliente().setColonia(new String( "HILLS OF HELLS" ));
		wsModel.getCliente().setCvemunpo(new Integer( 1 ));
		wsModel.getCliente().setPoblacion(new String( "HABS" ));
		wsModel.getCliente().setEdo(new Integer( 9 ));
		wsModel.getCliente().setCodpost(new Integer( 01000));
		wsModel.getCliente().setTelefono(new String( "5555555555" ));
		wsModel.getCliente().setEmail(new String( "dummy@fake.com" ));
		wsModel.getCliente().setCurp(new String( "CURP010101MDFAEI0" ));
		wsModel.getCliente().setRfcsiglas(new String( "RFC" ));
		wsModel.getCliente().setRfcfecha(new String( "010101" ));
		wsModel.getCliente().setRfchomon(new String( "ABC" ));
		wsModel.getCliente().setTpidentif(new Integer( 0 ));
		wsModel.getCliente().setNdocident(new String( "123456789" ));
		wsModel.getCliente().setCvcompdom(new Integer( 0 ));
		wsModel.getCliente().setPaisnac(new Integer( 23 ));
		wsModel.getCliente().setNacionld(new Integer( 52 ));
		wsModel.getCliente().setOcup(new String( "EMPLEADO" ));
		wsModel.getCliente().setActividfui(new Integer( 1 ));
		wsModel.getCliente().setActfuitext(new String( "Actfuitext" ));
		wsModel.getCliente().setActfteingr(new String( "Actfteingr" ));
		wsModel.getCliente().setCargopolit(new Integer( 0 ));
		wsModel.getCliente().setPerspolexp(new Integer( 0 ));
		wsModel.getCliente().setNombrycgo(new String( "" ));
		wsModel.getCliente().setActeco(new Integer( "COMERCIO" ));
		wsModel.getCliente().setApodlegal(new String( "EL MISMO" ));
		wsModel.getCliente().setCvegiro(new Integer( 0 ));
		wsModel.getCliente().setTpregimn(new Integer( 605 ));
		wsModel.getCliente().setEstatura(new Double( 180 ));
		wsModel.getCliente().setPeso(new Double( 80 ));
		wsModel.getCliente().setUsoCfdi(new String( 1 ));
***/

/***
		wsModel.getPoliza().setRamsubramo(ramsubramo); // Integer
		wsModel.getPoliza().setNumPoliza(numPoliza); // Integer
		wsModel.getPoliza().setNumSubgrupo(numSubgrupo); // Integer
		wsModel.getPoliza().setNdepend(ndepend); // String
		wsModel.getPoliza().setAnioVigencia(1070); // Integer
		wsModel.getPoliza().setTipoProducto(1); // Integer
		wsModel.getPoliza().setFechaEmision(new Date()); // Date
		wsModel.getPoliza().setInicioVigenciaAseg(new Date()); // Date
		wsModel.getPoliza().setFinVigenciaAseg(new Date()); // Date
		wsModel.getPoliza().setNdepend("VIGOR"); // String
		wsModel.getPoliza().setFechaStatusAseg(new Date()); // Date
		wsModel.getPoliza().setCausaCancelacion("causaCancelacion"); // String
		wsModel.getPoliza().setDescrMonedaI("MXN"); // String
		wsModel.getPoliza().setIdFormaPago(1); // Integer
		wsModel.getPoliza().setDescrFormaPago("ANUAL"); // String
		wsModel.getPoliza().setPrimaInicial(100.00); // Double
		wsModel.getPoliza().setPrimaSubsecuente(100.00); // Double
		wsModel.getPoliza().setPrima(990.00); // Double
		wsModel.getPoliza().setRecargo(0.00); // Double
		wsModel.getPoliza().setGastoExpedicion(10.00); // Double
		wsModel.getPoliza().setImpuesto(160.00); // Double
		wsModel.getPoliza().setPrimaTotal(1160.00); // Double
		wsModel.getPoliza().setNumPolizaOrigen(1001); // Integer
		wsModel.getPoliza().setNumPolizaRenov(1002); // Integer
		wsModel.getPoliza().setIdProducto(2020); // Integer
		wsModel.getPoliza().setDescrRamo("TRADICIONAL"); // String
		wsModel.getPoliza().setOficina("POLANCO"); // String
		wsModel.getPoliza().setLineaNegocio(1); // Integer

		List<Agente> agentes = wsModel.getAgentes(); // new ArrayList<Agente>();//(Arrays.asList(new Agente()));
		for (int i = 0; i < 2; i++) {
			Agente agente = new Agente();
			agente.setIdAgente(1233 + i);
			agente.setNombreAgente("NOMBRE AGENTE #" + (i + 1));
			agente.setPorcPartc(50.00);
			agentes.add(agente);
		}

		Contratante contratante = wsModel.getContratante();// new Contratante();
		contratante.setNombreContratante("Nombre Contratante"); // String
		contratante.setTipoPersona("F"); // String
		contratante.setRfcContratante("ABC700101BCA"); // String
		contratante.seteMail("emilio@eMail.com"); // String
		contratante.setCalle("Calle de la Amargura"); // String
		contratante.setNumExt("666"); // String
		contratante.setNumInt("-1"); // String
		contratante.setColonia("Sanborns"); // String
		contratante.setPoblacion("Miguel Hidalgo"); // String
		contratante.setCodigoPostal(11666); // Integer
		contratante.setCveEstado(9); // Integer
		contratante.setEstado("CDMX"); // String
		contratante.setReferencia("referencia"); // String

		ConductoCobro conductoCobro = wsModel.getConductoCobro(); // new Polgmcc0ConductoCobro();
		conductoCobro.setTitularCuenta("Titular Cuenta"); // String
		conductoCobro.setNumCuenta("numCuenta"); // String
		conductoCobro.setCveBanco(044); // Integer
		conductoCobro.setSucursal("POLANCO"); // String
		conductoCobro.setTipoCondCobro("1"); // String
		conductoCobro.setTipoCuenta(3); // Integer
		conductoCobro.setFuncionario("Funcionario"); // String
		conductoCobro.setAaVencimiento(21); // Integer
		conductoCobro.setMmVencimiento("MAR"); // String
		conductoCobro.setTipoTarjeta("DEBITO"); // String

		List<Asegurado> asegurados = wsModel.getAsegurados();// new ArrayList<Asegurado>();//(Arrays.asList(new Asegurado()));
		for (int i = 0; i < 2; i++) {
			Asegurado asegurado = new Asegurado();
			asegurado.setNumCertificado("0000" + (i + 1)); // String
			asegurado.setNumDependiente(i + 1); // Integer
			asegurado.setNombreAsegurado("Nombre Asegurado #" + (i + 1)); // String
			asegurado.setFechaNacimiento(new Date()); // Date
			asegurado.setSexo("M"); // String
			asegurado.setParentesco("parentesco"); // String
			asegurado.setAntiguedad(5); // Integer
			asegurado.setEdadReal(45); // Integer
			asegurado.setEdadCalculo(42); // Integer

			List<Cobertura> coberturas = new ArrayList<Cobertura>();// (Arrays.asList(new Asegurado()));
			asegurado.setCoberturas(coberturas); // Object[ ]
			for (int j = 0; j < 2; j++) {
				Cobertura cobertura = new Cobertura();
				cobertura.setIdCveCobertura(j + 1); // Integer
				cobertura.setIdCveCobAdicional(j); // Integer
				cobertura.setNombreCobertura("nombreCobertura"); // String
				cobertura.setLimiteMaximo(1000000); // Integer
				cobertura.setDeducibleCob(1000.00); // Double
				cobertura.setPrimaCob(100.00); // Double
				cobertura.setExtraPrima(0.00); // Double
				cobertura.setEdadCalculoCob(42); // Integer
				cobertura.setPlazoSeguro(99); // Integer
				cobertura.setPlazoPago(70); // Integer
				cobertura.setSumaAsegurada(1000000.00); // Double
				cobertura.setCoaseguro(3000.00); // Double
				cobertura.setInicioVigenciaCob(new Date()); // Date
				cobertura.setFinVigenciaCob(new Date()); // Date
				cobertura.setNivelHospitalario(5); // Integer
				cobertura.setDescrNivelHosp("NIVEL HOSP 5"); // String
				cobertura.setZonaHospital(7); // Integer
				cobertura.setDescrZonaHospital("DescrZonaHospital"); // String
				cobertura.setTipoDeducible(2); // Integer
				cobertura.setDescrTipoDeduc("DescrTipoDeduc"); // String
				coberturas.add(cobertura);
			}

			asegurados.add(asegurado);
		}

		List<Recibo> recibos = wsModel.getRecibos();// new ArrayL//ist<Recibo>();//(Arrays.asList(new Recibo()));
		for (int i = 0; i < 2; i++) {
			Recibo recibo = new Recibo();
			recibo.setFolioRecibo(100435); // Integer
			recibo.setFechaEmisionRbo(new Date()); // Date
			recibo.setFPago(new Date());
			recibo.setIdTipoRecibo(1); // Integer
			recibo.setIdStatusRecibo(3); // Integer
			recibo.setFStatusRecibo(new Date()); // Date
			recibo.setDescrStatusRecibo("VIGOR"); // String
			recibo.setImporte(100.0); // Double
			recibo.setRecargoRecibo(0.00); // Double
			recibo.setGastoExpedicionRbo(0.00); // Double
			recibo.setInicioVigenciaRecibo(new Date()); // Date
			recibo.setFinVigenciaRecibo(new Date()); // Date
			recibo.setPrimaTotalRecibo(116.00); // Double
			recibo.setComisionAgente(10.00); // Double
			recibo.setImpuestoRecibo(16.00); // Double
			recibos.add(recibo);
		}

		List<Endoso> endosos = wsModel.getEndosos();// new ArrayList<Endoso>();//(Arrays.asList(new Endoso()));
		for (int i = 0; i < 2; i++) {
			Endoso endoso = new Endoso();
			endoso.setFolioEndoso(100 + 1); // Integer
			endoso.setNumEndoso(i + 1); // Integer
			endoso.setIdStatusEndoso(3); // Integer
			endoso.setFStatusEndoso("2021-02-19"); // String
			endoso.setIdTipoEndoso(2); // Integer
			endoso.setDescrTipoEndoso("descrTipoEndoso"); // String
			endoso.setIdCveMovimiento(7); // Integer
			endoso.setDescrCveMovto("descrCveMovto"); // String
			endosos.add(endoso);
		}
***/
		return wsModel;
	}

	public RespRegistrarSolicitud registrarSolicitudDummyError(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respRegistrarSolicitud = new RespRegistrarSolicitud();

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("ERROR")) {
			String msg = UtilConstants.PREFIJO_ERROR_CORE + " consultarAseguradoDummyError 'desde CORE'";
			log.warn(msg);
			respRegistrarSolicitud.setStatusCode(-1);
			respRegistrarSolicitud.setMessage(msg);
		}
		return respRegistrarSolicitud;
	}

	public RespRegistrarSolicitud registrarSolicitudDummyException(ReqRegistrarSolicitud reqRegistrarSolicitud)
			throws ServiceException {
		RespRegistrarSolicitud respRegistrarSolicitud = new RespRegistrarSolicitud();

		String contrat = reqRegistrarSolicitud.getCliente().getContrat();

		if (contrat.contentEquals("EXCEPTION")) {
			String msg = "consultarAseguradoDummyException";
			log.warn(msg);
			throw ServiceExceptionDetails.buildServiceException("FaultCode: " + "-1", "FaultTitle: " + msg,
					new String[] { "FaultMessages[]: " + msg });
		}
		return respRegistrarSolicitud;
	}
}
