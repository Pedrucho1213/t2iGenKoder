package mx.t2i.tiigcaye.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mx.t2i.core.util.LogBackUtil;
import mx.t2i.core.util.UtilFechaCore;
import mx.t2i.sabe.opcger.biz.model.ResultOpcgerList;
import mx.t2i.sabe.opcger.core.model.Opcgerx0;
import mx.t2i.sabe.opcger.core.model.Opcgerx0VO;
import mx.t2i.sabe.opcger.core.service.Opcgerx0CoreService;
import mx.t2i.tiigcaye.service.criteria.OpcgerCriteria;
import mx.t2i.tiigcaye.service.dto.OpcgerDTO;

@Service
public class OpcgerService {
	private static final boolean isTraceable = LogBackUtil.addClassToTrace(OpcgerService.class);

	private static final Logger log = LoggerFactory.getLogger(OpcgerService.class);

///	private final OpcgerMapper opcgerMapper;

    @Autowired
    private Opcgerx0 coreModel;

    @Autowired
	private Opcgerx0CoreService opcgerx0CoreService;
	
///    public OpcgerService(OpcgerMapper opcgerMapper) {
    public OpcgerService() {
    	super();
    	if (isTraceable) { log.trace("Creando instancia sin atributos: "+this.toString()); }
///        this.opcgerMapper = opcgerMapper;
	}

    /**
     * Save a opcger.
     *
     * @param opcgerDTO the entity to save.
     * @return the persisted entity.
     */
    public OpcgerDTO save(OpcgerDTO opcgerDTO) {
        log.debug("Request to save opcgerDTO: {}", opcgerDTO);
/***        
        Opcger opcger = opcgerMapper.toEntity(opcgerDTO);
        opcger = opcgerRepository.save(opcger);
        return opcgerMapper.toDto(opcger);
***/        

////        Opcgerx0 coreModel = new Opcgerx0();
        coreModel.clear();

        coreModel.setRamsubramo(opcgerDTO.getRamsubramo());
        coreModel.setMoneda(opcgerDTO.getMoneda());
        coreModel.setNumnorma(opcgerDTO.getMoneda());
        coreModel.setFinivig(Date.from(opcgerDTO.getFinivig()));
        coreModel.setDescnorm(opcgerDTO.getDescnorm());
        coreModel.setOpcgerx0VO(convertOpcgerDTOItemToOpcgerx0VO(opcgerDTO));
        log.debug("coreModel: "+coreModel);

        Opcgerx0 coreModelResult = null;
        OpcgerDTO opcgerDTOResult = null;

        String msg = null;
        try 
        {
            Long id = opcgerDTO.getId();
			if (id == null)
			{
				coreModelResult = opcgerx0CoreService.insertCore(coreModel);
			}
			else
			{
				coreModelResult = opcgerx0CoreService.updateCore(coreModel);
			}
	        log.debug("coreModelResult: {}",coreModelResult);

			if (coreModelResult != null) {
				if (coreModelResult.getMessage() != null) {
		        	msg = "ADVERTENCIA: " + coreModelResult.getMessage();
		        	log.warn(msg);
		        	/// throw new RuntimeException(msg);
				}

  				opcgerDTOResult = convertOpcgerx0VOItemToOpcgerDTO(id, coreModelResult.getOpcgerx0VO()); // TODO: Asignar Id al nuevo?
            }        
        } 
        catch (Exception ex) 
        {
        	msg = "ERROR INTERNO: " + ex.getMessage();
        	log.error(msg, ex);
        	/// throw new RuntimeException(ex);
        }
        finally
        {
        	if (opcgerDTOResult == null) {
        		opcgerDTOResult = new OpcgerDTO();
        	}
        	if (msg != null) {
        		opcgerDTOResult.setMessage(msg);
        	}
        }

        log.trace("opcgerDTOResult: {}",opcgerDTOResult);
        return opcgerDTOResult;
    }

    /**
     * Partially update a opcger.
     *
     * @param opcgerDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<OpcgerDTO> partialUpdate(OpcgerDTO opcgerDTO) {
        log.debug("Request to partially update opcgerDTO : {}", opcgerDTO);
        
        OpcgerDTO existingOpcger = findOne(opcgerDTO.getId(), opcgerDTO).get(); 
/***
        return opcgerRepository
            .findById(opcgerDTO.getId())
            .map(
                existingOpcger -> {
***/
                    if (opcgerDTO.getRamsubramo() != null) {
                        existingOpcger.setRamsubramo(opcgerDTO.getRamsubramo());
                    }

                    if (opcgerDTO.getMoneda() != null) {
                        existingOpcger.setMoneda(opcgerDTO.getMoneda());
                    }

                    if (opcgerDTO.getNumnorma() != null) {
                        existingOpcger.setNumnorma(opcgerDTO.getNumnorma());
                    }

                    if (opcgerDTO.getFinivig() != null) {
                        existingOpcger.setFinivig(opcgerDTO.getFinivig());
                    }

                    if (opcgerDTO.getDescnorm() != null) {
                        existingOpcger.setDescnorm(opcgerDTO.getDescnorm());
                    }

                    if (opcgerDTO.getValor1() != null) {
                        existingOpcger.setValor1(opcgerDTO.getValor1());
                    }

                    if (opcgerDTO.getValor2() != null) {
                        existingOpcger.setValor2(opcgerDTO.getValor2());
                    }

                    if (opcgerDTO.getValor3() != null) {
                        existingOpcger.setValor3(opcgerDTO.getValor3());
                    }

                    if (opcgerDTO.getValor4() != null) {
                        existingOpcger.setValor4(opcgerDTO.getValor4());
                    }

                    if (opcgerDTO.getValor5() != null) {
                        existingOpcger.setValor5(opcgerDTO.getValor5());
                    }

                    if (opcgerDTO.getValor6() != null) {
                        existingOpcger.setValor6(opcgerDTO.getValor6());
                    }

                    if (opcgerDTO.getValor7() != null) {
                        existingOpcger.setValor7(opcgerDTO.getValor7());
                    }

                    if (opcgerDTO.getValor8() != null) {
                        existingOpcger.setValor8(opcgerDTO.getValor8());
                    }

                    if (opcgerDTO.getValor9() != null) {
                        existingOpcger.setValor9(opcgerDTO.getValor9());
                    }

                    if (opcgerDTO.getValor10() != null) {
                        existingOpcger.setValor10(opcgerDTO.getValor10());
                    }

                    if (opcgerDTO.getValor11() != null) {
                        existingOpcger.setValor11(opcgerDTO.getValor11());
                    }

                    if (opcgerDTO.getValor12() != null) {
                        existingOpcger.setValor12(opcgerDTO.getValor12());
                    }

                    if (opcgerDTO.getDescval1() != null) {
                        existingOpcger.setDescval1(opcgerDTO.getDescval1());
                    }

                    if (opcgerDTO.getDescval2() != null) {
                        existingOpcger.setDescval2(opcgerDTO.getDescval2());
                    }

                    if (opcgerDTO.getDescval3() != null) {
                        existingOpcger.setDescval3(opcgerDTO.getDescval3());
                    }

                    if (opcgerDTO.getDescval4() != null) {
                        existingOpcger.setDescval4(opcgerDTO.getDescval4());
                    }

                    if (opcgerDTO.getDescval5() != null) {
                        existingOpcger.setDescval5(opcgerDTO.getDescval5());
                    }

                    if (opcgerDTO.getDescval6() != null) {
                        existingOpcger.setDescval6(opcgerDTO.getDescval6());
                    }

                    if (opcgerDTO.getDescval7() != null) {
                        existingOpcger.setDescval7(opcgerDTO.getDescval7());
                    }

                    if (opcgerDTO.getDescval8() != null) {
                        existingOpcger.setDescval8(opcgerDTO.getDescval8());
                    }

                    if (opcgerDTO.getDescval9() != null) {
                        existingOpcger.setDescval9(opcgerDTO.getDescval9());
                    }

                    if (opcgerDTO.getDescval10() != null) {
                        existingOpcger.setDescval10(opcgerDTO.getDescval10());
                    }

                    if (opcgerDTO.getDescval11() != null) {
                        existingOpcger.setDescval11(opcgerDTO.getDescval11());
                    }

                    if (opcgerDTO.getDescval12() != null) {
                        existingOpcger.setDescval12(opcgerDTO.getDescval12());
                    }
                    /***

                    return existingOpcger;
                }
            )
            .map(opcgerRepository::save)
            .map(opcgerMapper::toDto);
***/
        Long id = existingOpcger.getId();
///        Opcgerx0 coreModel = new Opcgerx0();
        coreModel.clear();

        coreModel.setRamsubramo(existingOpcger.getRamsubramo());
        coreModel.setMoneda(existingOpcger.getMoneda());
        coreModel.setNumnorma(existingOpcger.getMoneda());
        coreModel.setFinivig(Date.from(existingOpcger.getFinivig()));
        coreModel.setDescnorm(opcgerDTO.getDescnorm());
        coreModel.setOpcgerx0VO(convertOpcgerDTOItemToOpcgerx0VO(existingOpcger));
        log.debug("coreModel: "+coreModel);

        Opcgerx0 coreModelResult = null;
        OpcgerDTO opcgerDTOResult = null;

        String msg = null;
        try 
        {
			coreModelResult = opcgerx0CoreService.updateCore(coreModel);
	        log.debug("coreModelResult: {}",coreModelResult);

	        if (coreModelResult != null) {
				if (coreModelResult.getMessage() != null) {
		        	msg = "ADVERTENCIA: " + coreModelResult.getMessage();
		        	log.warn(msg);
		        	/// throw new RuntimeException(msg);
				}

  				opcgerDTOResult = convertOpcgerx0VOItemToOpcgerDTO(id, coreModelResult.getOpcgerx0VO());
            }        

	        if (coreModelResult.getMessage() != null) {
	        	msg = "ADVERTENCIA: " + coreModelResult.getMessage();
	        	log.warn(msg);
	        	/// throw new RuntimeException(msg);
			}
        } 
        catch (Exception ex) 
        {
        	msg = "ERROR INTERNO: " + ex.getMessage();
        	log.error(msg, ex);
        	/// throw new RuntimeException(ex);
        }	
        finally
        {
        	if (opcgerDTOResult == null) {
        		opcgerDTOResult = new OpcgerDTO();
        	}
        	if (msg != null) {
        		opcgerDTOResult.setMessage(msg);
        	}
        }

        log.trace("opcgerDTOResult: {}",opcgerDTOResult);
        return Optional.of(opcgerDTOResult);
    }

    /**
     * Get all the opcgers.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
//    @Transactional(readOnly = true) // Aplica para BD
    public Page<OpcgerDTO> findAll(OpcgerCriteria criteria, Pageable pageable) {
        log.debug("Request to get all Opcgers: criteria:"+criteria.toString()+" pageable:"+pageable);
///        return opcgerRepository.findAll(pageable).map(opcgerMapper::toDto);
///        return newDummyPageOpcgerDTOList(criteria, pageable);
      ///            Opcgerx0 coreModel = new Opcgerx0();

        Page<OpcgerDTO> page = null;
        int start = 0;
        int end = 0;

        List<OpcgerDTO> opcgerDTOList = listAll(criteria); 
        
		if (opcgerDTOList.size() > 0) 
		{ 
		    start = (int)pageable.getOffset();
		    end = Math.min((start + pageable.getPageSize()), opcgerDTOList.size());
		}
	    page = new PageImpl<>(opcgerDTOList.subList(start, end), pageable, opcgerDTOList.size());

		return page;
    }

    public ResultOpcgerList retrieveResultOpcgerList(OpcgerCriteria opcgerCriteria)
    {
    	ResultOpcgerList result = new ResultOpcgerList();
    	
		result.setOpcgerDTOList(listAll(opcgerCriteria));

    	return result;
    }

    public List<OpcgerDTO> listAll(OpcgerCriteria criteria) {
        coreModel.clear();

        if (criteria.getRamsubramo() != null) { coreModel.setRamsubramo(Integer.valueOf(criteria.getRamsubramo().getEquals())); }
        if (criteria.getMoneda() != null) { coreModel.setMoneda(Integer.valueOf(criteria.getMoneda().getEquals())); }
        if (criteria.getNumnorma() != null) { coreModel.setNumnorma(Integer.valueOf(criteria.getNumnorma().getEquals())); }
        if (criteria.getFinivig() != null) { coreModel.setFinivig(Date.from(criteria.getFinivig().getEquals())); }
        if (criteria.getFinivig() != null) { coreModel.setFinivig(Date.from(criteria.getFinivig().getEquals())); }
        if (criteria.getDescnorm() != null) { coreModel.setDescnorm(new String(criteria.getDescnorm().getEquals())); }
        log.debug("coreModel: "+coreModel);
    	
        List<OpcgerDTO> opcgerDTOList = new ArrayList<OpcgerDTO>();
        List<Opcgerx0VO> opcgerx0VOList = null;
        
        String msg = null;
        try 
        {
            opcgerx0VOList = opcgerx0CoreService.getCoreList(coreModel);
            log.trace("Respuesta de opcgerx0CoreService.getCoreList: opcgerx0VOList: "+opcgerx0VOList);
    		
            if (opcgerx0VOList != null) {
    	        for (int i = 0; i < opcgerx0VOList.size(); i++) {
    				OpcgerDTO opcgerDTO = convertOpcgerx0VOItemToOpcgerDTO(Long.valueOf(i), opcgerx0VOList.get(i)); // TODO: Asignar Id al nuevo
    				opcgerDTOList.add(opcgerDTO);
    			}

    	        if (opcgerx0VOList.size() > 0) {
		            Opcgerx0VO coreModelResult = opcgerx0VOList.get(0); 
		            if (coreModelResult.getMessage() != null) {
			        	msg = "ADVERTENCIA: " + coreModelResult.getMessage();
			        	log.warn(msg);
			        	/// throw new RuntimeException(msg);
					}
    	        }
            }        
        } 
        catch (Exception ex) 
        {
        	msg = "ERROR INTERNO: " + ex.getMessage();
        	log.error(msg, ex);
        	/// throw new RuntimeException(ex);
        }
        finally
        {
        	if (msg != null) {
        		throw new RuntimeException(msg);
        	}
        }

        return opcgerDTOList;
    }

    /**
     * Get one opcger by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
//  @Transactional(readOnly = true) // Aplica para BD
    public Optional<OpcgerDTO> findOne(Long id, final OpcgerDTO opcgerDTO) {
        log.debug("Request to get 1 Opcger : id: {} opcgerDTO: {}", id, opcgerDTO);
///        return opcgerRepository.findById(id).map(opcgerMapper::toDto);
///		OpcgerDTO opcgerDTO = newDummyOpcgerDTO(id);

///		OpcgerDTO opcgerDTO = null;
///       Opcgerx0 coreModel = new Opcgerx0();
        coreModel.clear();

        coreModel.setRamsubramo(opcgerDTO.getRamsubramo());
        coreModel.setMoneda(opcgerDTO.getMoneda());
        coreModel.setNumnorma(opcgerDTO.getNumnorma());
        coreModel.setFinivig(Date.from(opcgerDTO.getFinivig()));
        coreModel.setDescnorm(opcgerDTO.getDescnorm());
///        coreModel.setOpcgerx0VO(convertOpcgerDTOItemToOpcgerx0VO(id, opcgerDTO));
        log.debug("coreModel: "+coreModel);
        
		Opcgerx0 coreModelResult = null;
		OpcgerDTO opcgerDTOResult = null;
		
		try 
        {
			coreModelResult = opcgerx0CoreService.getCore(coreModel);
	        log.debug("coreModelResult: {}",coreModelResult);
    		
			if (coreModelResult.getMessage() != null) {
	        	String msg = "ADVERTENCIA: " + coreModelResult.getMessage();
	        	log.warn(msg);
	        	throw new RuntimeException(msg);
			}

			if (coreModelResult != null) {
            	opcgerDTOResult = convertOpcgerx0VOItemToOpcgerDTO( id, coreModelResult.getOpcgerx0VO() );
            }        
        } 
        catch (Exception ex) 
        {
        	String msg = "ERROR INTERNO: " + ex.getMessage();
        	log.error(msg, ex);
        	throw new RuntimeException(ex);
        }	

		log.trace("opcgerDTOResult: {}",opcgerDTOResult);
        return  Optional.of(opcgerDTOResult);
    }

    /**
     * Delete the opcger by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id, final OpcgerDTO opcgerDTO) {
        log.debug("Request to delete Opcger : id: {} opcgerDTO: {}", id, opcgerDTO);
///        opcgerRepository.deleteById(id);

///        Opcgerx0 coreModel = new Opcgerx0();
        coreModel.clear();

        coreModel.setRamsubramo(opcgerDTO.getRamsubramo());
        coreModel.setMoneda(opcgerDTO.getMoneda());
        coreModel.setNumnorma(opcgerDTO.getNumnorma());
        coreModel.setFinivig(Date.from(opcgerDTO.getFinivig()));
        coreModel.setDescnorm(opcgerDTO.getDescnorm());
        log.debug("coreModel: "+coreModel);

        Opcgerx0 coreModelResult = null;
		OpcgerDTO opcgerDTOResult = null;

        try 
        {
			coreModelResult = opcgerx0CoreService.deleteCore(coreModel);
	        log.debug("coreModelResult: {}",coreModelResult);
    		
            if (coreModelResult != null) {
  				opcgerDTOResult = convertOpcgerx0VOItemToOpcgerDTO(id, coreModelResult.getOpcgerx0VO());
            }        
			if (coreModelResult.getMessage() != null) {
	        	String msg = "ADVERTENCIA: " + coreModelResult.getMessage();
	        	log.warn(msg);
	        	throw new RuntimeException(msg);
			}
        } 
        catch (Exception ex) 
        {
        	String msg = "ERROR INTERNO: " + ex.getMessage();
        	log.error(msg, ex);
        	throw new RuntimeException(ex);
        }	

        log.trace("opcgerDTOResult: {}",opcgerDTOResult);
    }

    private OpcgerDTO convertOpcgerx0VOItemToOpcgerDTO(Long id, final Opcgerx0VO opcgerx0VO)
    {
    	OpcgerDTO opcgerDTOResult = new OpcgerDTO();
    	if (id != null) opcgerDTOResult.setId(Long.valueOf(id));
    	opcgerDTOResult.setRamsubramo(opcgerx0VO.getRamsubramo());
        opcgerDTOResult.setMoneda(opcgerx0VO.getMoneda());
        opcgerDTOResult.setNumnorma(opcgerx0VO.getNumnorma());
        opcgerDTOResult.setFinivig(opcgerx0VO.getFinivig().toInstant());
        opcgerDTOResult.setDescnorm(opcgerx0VO.getDescnorm());
        opcgerDTOResult.setValor1(opcgerx0VO.getValor01());
        opcgerDTOResult.setValor2(opcgerx0VO.getValor02());
        opcgerDTOResult.setValor3(opcgerx0VO.getValor03());
        opcgerDTOResult.setValor4(opcgerx0VO.getValor04());
        opcgerDTOResult.setValor5(opcgerx0VO.getValor05());
        opcgerDTOResult.setValor6(opcgerx0VO.getValor06());
        opcgerDTOResult.setValor7(opcgerx0VO.getValor07());
        opcgerDTOResult.setValor8(opcgerx0VO.getValor08());
        opcgerDTOResult.setValor9(opcgerx0VO.getValor09());
        opcgerDTOResult.setValor10(opcgerx0VO.getValor10());
        opcgerDTOResult.setValor11(opcgerx0VO.getValor11());
        opcgerDTOResult.setValor12(opcgerx0VO.getValor12());
        opcgerDTOResult.setDescval1(opcgerx0VO.getDescval01());
        opcgerDTOResult.setDescval2(opcgerx0VO.getDescval02());
        opcgerDTOResult.setDescval3(opcgerx0VO.getDescval03());
        opcgerDTOResult.setDescval4(opcgerx0VO.getDescval04());
        opcgerDTOResult.setDescval5(opcgerx0VO.getDescval05());
        opcgerDTOResult.setDescval6(opcgerx0VO.getDescval06());
        opcgerDTOResult.setDescval7(opcgerx0VO.getDescval07());
        opcgerDTOResult.setDescval8(opcgerx0VO.getDescval08());
        opcgerDTOResult.setDescval9(opcgerx0VO.getDescval09());
        opcgerDTOResult.setDescval10(opcgerx0VO.getDescval10());
        opcgerDTOResult.setDescval11(opcgerx0VO.getDescval11());
        opcgerDTOResult.setDescval12(opcgerx0VO.getDescval12());
        opcgerDTOResult.setNombrel(opcgerx0VO.getNombrel());
        opcgerDTOResult.setMoneda_i(opcgerx0VO.getMoneda_i());

        opcgerDTOResult.setMessage(opcgerx0VO.getMessage());
        log.trace("opcgerDTOResult: {}",opcgerDTOResult);
        return opcgerDTOResult;
    }

    private Opcgerx0VO convertOpcgerDTOItemToOpcgerx0VO(final OpcgerDTO opcgerDTO)
    {
    	Opcgerx0VO opcgerx0VO = new Opcgerx0VO();
    	opcgerx0VO.setRamsubramo(opcgerDTO.getRamsubramo());
        opcgerx0VO.setMoneda(opcgerDTO.getMoneda());
        opcgerx0VO.setNumnorma(opcgerDTO.getNumnorma());
        opcgerx0VO.setFinivig(Date.from(opcgerDTO.getFinivig()));
        opcgerx0VO.setDescnorm(opcgerDTO.getDescnorm());
        opcgerx0VO.setValor01(opcgerDTO.getValor1());
        opcgerx0VO.setValor02(opcgerDTO.getValor2());
        opcgerx0VO.setValor03(opcgerDTO.getValor3());
        opcgerx0VO.setValor04(opcgerDTO.getValor4());
        opcgerx0VO.setValor05(opcgerDTO.getValor5());
        opcgerx0VO.setValor06(opcgerDTO.getValor6());
        opcgerx0VO.setValor07(opcgerDTO.getValor7());
        opcgerx0VO.setValor08(opcgerDTO.getValor8());
        opcgerx0VO.setValor09(opcgerDTO.getValor9());
        opcgerx0VO.setValor10(opcgerDTO.getValor10());
        opcgerx0VO.setValor11(opcgerDTO.getValor11());
        opcgerx0VO.setValor12(opcgerDTO.getValor12());
        opcgerx0VO.setDescval01(opcgerDTO.getDescval1());
        opcgerx0VO.setDescval02(opcgerDTO.getDescval2());
        opcgerx0VO.setDescval03(opcgerDTO.getDescval3());
        opcgerx0VO.setDescval04(opcgerDTO.getDescval4());
        opcgerx0VO.setDescval05(opcgerDTO.getDescval5());
        opcgerx0VO.setDescval06(opcgerDTO.getDescval6());
        opcgerx0VO.setDescval07(opcgerDTO.getDescval7());
        opcgerx0VO.setDescval08(opcgerDTO.getDescval8());
        opcgerx0VO.setDescval09(opcgerDTO.getDescval9());
        opcgerx0VO.setDescval10(opcgerDTO.getDescval10());
        opcgerx0VO.setDescval11(opcgerDTO.getDescval11());
        opcgerx0VO.setDescval12(opcgerDTO.getDescval12());
        opcgerx0VO.setNombrel(opcgerDTO.getNombrel());
        opcgerx0VO.setMoneda_i(opcgerDTO.getMoneda_i());

        opcgerx0VO.setMessage(opcgerDTO.getMessage());
        log.trace("opcgerx0VO: {}",opcgerx0VO);
        return opcgerx0VO;
    }

    public static OpcgerDTO newDummyOpcgerDTO(Long id)
    {
    	OpcgerDTO opcgerDTO = new OpcgerDTO();
    	opcgerDTO.setId(id);
    	opcgerDTO.setRamsubramo(110011);
        opcgerDTO.setMoneda(1);
        opcgerDTO.setNumnorma(1);
        opcgerDTO.setFinivig(Instant.now());
        opcgerDTO.setDescnorm("Descripcion DUMMY #" + id);
        opcgerDTO.setValor1(1.0d);
        opcgerDTO.setValor2(2.0d);
        opcgerDTO.setValor3(3.0d);
        opcgerDTO.setValor4(4.0d);
        opcgerDTO.setValor5(5.0d);
        opcgerDTO.setValor6(6.0d);
        opcgerDTO.setValor7(7.0d);
        opcgerDTO.setValor8(8.0d);
        opcgerDTO.setValor9(9.0d);
        opcgerDTO.setValor10(10.0d);
        opcgerDTO.setValor11(11.0d);
        opcgerDTO.setValor12(12.0d);
        opcgerDTO.setDescval1("Descval1");
        opcgerDTO.setDescval2("Descval2");
        opcgerDTO.setDescval3("Descval3");
        opcgerDTO.setDescval4("Descval4");
        opcgerDTO.setDescval5("Descval5");
        opcgerDTO.setDescval6("Descval6");
        opcgerDTO.setDescval7("Descval7");
        opcgerDTO.setDescval8("Descval8");
        opcgerDTO.setDescval9("Descval9");
        opcgerDTO.setDescval10("Descval10");
        opcgerDTO.setDescval11("Descval11");
        opcgerDTO.setDescval12("Descval12");
        opcgerDTO.setNombrel("NOMBRE DE RAMO DUMMMY");
        opcgerDTO.setMoneda_i("NACIONAL");
        return opcgerDTO;
    }

    public static Page<OpcgerDTO> newDummyPageOpcgerDTOList(OpcgerCriteria criteria, Pageable pageable)
    {
        log.debug("REST request to get Opcgers by criteria: {} pageable: {}", criteria.toString(), pageable.toString());
        List<OpcgerDTO> content = newDummyOpcgerDTOList(criteria);
        Page<OpcgerDTO> page = new PageImpl<OpcgerDTO>(content, PageRequest.of(1, 10, Sort.by("id")), content.size());

        return page;
    }

    public static List<OpcgerDTO> newDummyOpcgerDTOList(OpcgerCriteria criteria)
    {
        log.debug("REST request to get Opcgers by criteria: {}", criteria.toString());

        long dummyCount = 30;
        List<OpcgerDTO> list = new ArrayList<>();
        for (long i=0; i < dummyCount; i++)
        {
        	list.add(newDummyOpcgerDTO(i+1));
        }

        return list;
    }
    
}
