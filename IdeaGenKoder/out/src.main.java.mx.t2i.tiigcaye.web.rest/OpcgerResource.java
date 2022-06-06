package mx.t2i.tiigcaye.web.rest;

import mx.t2i.core.util.LogBackUtil;
import mx.t2i.tiigcaye.service.OpcgerService;
/***
import mx.koder.runtime.exceptions.BadRequestAlertException;
import mx.t2i.tiigcaye.repository.OpcgerRepository;
import mx.t2i.tiigcaye.service.OpcgerQueryService;
import mx.t2i.tiigcaye.service.OpcgerService;
***/
import mx.t2i.tiigcaye.service.criteria.OpcgerCriteria;

import mx.t2i.tiigcaye.service.dto.OpcgerDTO;

import mx.koder.core.utils.web.HeaderUtil;
import mx.koder.core.utils.web.PaginationUtil;
import mx.koder.core.utils.web.ResponseUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

/**
 * REST controller for managing {@link mx.t2i.catalogos.domain.Opcger}.
 */
@RestController
@RequestMapping("/t2iSabeOpcger/restWs/") // 2021-07-23 ati: Base de URL. Ej: ":8007/api"  
public class OpcgerResource {
	private static final boolean isTraceable = LogBackUtil.addClassToTrace(OpcgerResource.class);

    private final Logger log = LoggerFactory.getLogger(OpcgerResource.class);

    private static final String ENTITY_NAME = "opcger";

    @Value("${app.clientApp.name}")
    private String applicationName;

    private final OpcgerService opcgerService;

    /***
    private final OpcgerRepository opcgerRepository;

    private final OpcgerQueryService opcgerQueryService;
***/
    public OpcgerResource(OpcgerService opcgerService) {
    	super();
    	if (isTraceable) { log.trace("Creando instancia sin atributos: "+this.toString()); }
        this.opcgerService = opcgerService;
    }
/***
    public OpcgerResource(OpcgerService opcgerService, OpcgerRepository opcgerRepository, OpcgerQueryService opcgerQueryService) {
        this.opcgerService = opcgerService;
        this.opcgerRepository = opcgerRepository;
        this.opcgerQueryService = opcgerQueryService;
    }
***/

    /**
     * {@code POST  /opcger} : Create a new opcger.
     *
     * @param opcgerDTO the opcgerDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new opcgerDTO, or with status {@code 400 (Bad Request)} if the opcger has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/opcger")
    public ResponseEntity<OpcgerDTO> createOpcger(@Valid @RequestBody OpcgerDTO opcgerDTO) throws URISyntaxException {
        log.debug("REST request to save Opcger : {}", opcgerDTO);

        if (opcgerDTO.getId() != null) {
///            throw new BadRequestAlertException("A new opcger cannot already have an ID", ENTITY_NAME, "idexists");
            throw new URISyntaxException("A new opcger cannot already have an ID|"+ ENTITY_NAME, "idexists");
        }

        OpcgerDTO result = opcgerService.save(opcgerDTO);

        // result.setId(1L); // DUMMY Id as if assigned from DB
        
        return ResponseEntity.created(new URI("/t2iSabeOpcger/restWs/" + "opcger?" + result.getId())) // 2021-07-23 ati: Para "buscar" el creado el URI, debe ser consistente con el URL del @RequestMapping. EN REALIDAD NO SE USA
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /opcger:id} : Updates an existing opcger.
     *
     * @param id the id of the opcgerDTO to save.
     * @param opcgerDTO the opcgerDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated opcgerDTO,
     * or with status {@code 400 (Bad Request)} if the opcgerDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the opcgerDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/opcger/{id}")
    public ResponseEntity<OpcgerDTO> updateOpcger(@PathVariable(value = "id", required = false) final Long id,@Valid @RequestBody OpcgerDTO opcgerDTO) throws URISyntaxException {
        log.debug("REST request to update id : {} Opcger : {}", id, opcgerDTO);
        if (opcgerDTO.getId() == null) {
///            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
            throw new URISyntaxException("Invalid id|"+ ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, opcgerDTO.getId())) {
///            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
            throw new URISyntaxException("Invalid ID|"+ ENTITY_NAME, "idinvalid");
        }
/***
        if (!opcgerRepository.existsById(id)) {
///            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
            throw new URISyntaxException("Entity not found|"+ ENTITY_NAME, "idnotfound");
        }
***/
        OpcgerDTO result = opcgerService.save(opcgerDTO);
        
        if (result.getMessage() != null) {
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, result.getMessage()))
                    .body(result);
        }

        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, opcgerDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /opcger/:id} : Partial updates given fields of an existing opcger, field will ignore if it is null
     *
     * @param id the id of the opcgerDTO to save.
     * @param opcgerDTO the opcgerDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated opcgerDTO,
     * or with status {@code 400 (Bad Request)} if the opcgerDTO is not valid,
     * or with status {@code 404 (Not Found)} if the opcgerDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the opcgerDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/opcger/{id}" /*,consumes = "application/merge-patch+json"*/)
    public ResponseEntity<OpcgerDTO> partialUpdateOpcger(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody OpcgerDTO opcgerDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update id: {} Opcger: {}", id, opcgerDTO);
        if (opcgerDTO.getId() == null) {
///            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
            throw new URISyntaxException("Invalid id|"+ ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, opcgerDTO.getId())) {
///            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
            throw new URISyntaxException("Invalid ID|"+ ENTITY_NAME, "idinvalid");
        }
/***
        if (!opcgerRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }
***/
        Optional<OpcgerDTO> result = opcgerService.partialUpdate(opcgerDTO);

        if (result.get().getMessage() != null) {
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, result.get().getMessage()))
                    .body(result.get());
        }

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, opcgerDTO.getId().toString())
        );
    }

    /**
     * {@code GET  /opcger} : get all the opcgers.
     *
     * @param pageable the pagination information.
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of opcgers in body.
     */
    @GetMapping("/opcger")
    public ResponseEntity<List<OpcgerDTO>> getAll(OpcgerCriteria criteria, Pageable pageable) {
        log.debug("REST request to getAll. criteria: {} pageable: {}", criteria.toString(), pageable.toString());

///     Page<OpcgerDTO> page = opcgerQueryService.findByCriteria(criteria, pageable);
        Page<OpcgerDTO> page = opcgerService.findAll(criteria, pageable);

        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /opcger/count} : count all the opcgers.
     *
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the count in body.
     */
    @GetMapping("/opcger/count")
    public ResponseEntity<Long> getCount(OpcgerCriteria criteria) {
        log.debug("REST request to count Opcgers by criteria: {}", criteria);

///     return ResponseEntity.ok().body(opcgerQueryService.countByCriteria(criteria));
        return ResponseEntity.ok().body(3L); // DUMMY COUNT
    }

    /**
     * {@code GET  /opcger/:id} : get the "id" opcger.
     *
     * @param id the id of the opcgerDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the opcgerDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/opcger/{id}")
    public ResponseEntity<OpcgerDTO> getOpcger(@PathVariable Long id, @RequestParam Integer ramsubramo, @RequestParam Integer moneda, @RequestParam Integer numnorma, @RequestParam Instant finivig) {
        log.debug("REST request to get Opcger : {}", id);
/***
        OpcgerDTO opcgerDTO = newDummyOpcgerDTO(id);
        ResponseEntity<OpcgerDTO> result = new ResponseEntity<OpcgerDTO>(opcgerDTO, HttpStatus.OK);
        return result;
***/

        OpcgerDTO opcgerDTO = new OpcgerDTO();
        opcgerDTO.setId(id);
        opcgerDTO.setRamsubramo(ramsubramo);
        opcgerDTO.setMoneda(moneda);
        opcgerDTO.setNumnorma(numnorma);
        opcgerDTO.setFinivig(finivig);
        
        Optional<OpcgerDTO> result = opcgerService.findOne(id, opcgerDTO);

        if (result.get().getMessage() != null) {
            return ResponseEntity.badRequest()
                    .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, result.get().getMessage()))
                    .body(result.get());
        }

        return ResponseUtil.wrapOrNotFound(result);
    }

    /**
     * {@code DELETE  /opcger/:id} : delete the "id" opcger.
     *
     * @param id the id of the opcgerDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/opcger/{id}")
    public ResponseEntity<Void> deleteOpcger(@PathVariable Long id, @RequestParam Integer ramsubramo, @RequestParam Integer moneda, @RequestParam Integer numnorma, @RequestParam Instant finivig) {
        log.debug("REST request to delete Opcger : {}", id);

///        opcgerService.delete(id);

        OpcgerDTO opcgerDTO = new OpcgerDTO();
        opcgerDTO.setId(id);
        opcgerDTO.setRamsubramo(ramsubramo);
        opcgerDTO.setMoneda(moneda);
        opcgerDTO.setNumnorma(numnorma);
        opcgerDTO.setFinivig(finivig);

        opcgerService.delete(id, opcgerDTO);
        OpcgerDTO result = opcgerDTO;

        if (opcgerDTO.getMessage() != null) {
            return ResponseEntity.noContent()
                    .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, result.getMessage()))
                    .build();
///            return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, opcgerDTO.getMessage())).build();
        }

        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }

}
