package ${FTL_package};

import mx.t2i.core.util.LogBackUtil;
/***
import mx.koder.runtime.exceptions.BadRequestAlertException;
import mx.t2i.tiigcaye.repository.CatramosRepository;
import mx.t2i.tiigcaye.service.CatramosQueryService;
import mx.t2i.tiigcaye.service.CatramosService;
***/
import mx.t2i.tiigcaye.service.criteria.CatramosCriteria;
import mx.t2i.tiigcaye.service.dto.CatramosDTO;

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
 * REST controller for managing {@link mx.t2i.catalogos.domain.Catramos}.
 */
@RestController
@RequestMapping("/api")
public class ${FTL_CatClass} {
	private static final boolean isTraceable = LogBackUtil.addClassToTrace(${FTL_CatClass}.class);

    private final Logger log = LoggerFactory.getLogger(${FTL_CatClass}.class);

    private static final String ENTITY_NAME = "${FTL_cat}";

    @Value("${FTL_clientApp}")
    private String applicationName;
/***
    private final CatramosService catramosService;

    private final CatramosRepository catramosRepository;

    private final CatramosQueryService catramosQueryService;
***/
    public ${FTL_CatClass}() {
    	if (isTraceable) { log.trace("Creando instancia sin atributos: "+this.toString()); }
    }
/***
    public CatramosResource(CatramosService catramosService, CatramosRepository catramosRepository, CatramosQueryService catramosQueryService) {
        this.catramosService = catramosService;
        this.catramosRepository = catramosRepository;
        this.catramosQueryService = catramosQueryService;
    }
***/

    /**
     * {@code POST  /catramos} : Create a new catramos.
     *
     * @param catramosDTO the catramosDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new catramosDTO, or with status {@code 400 (Bad Request)} if the catramos has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/${FTL_cat}")
    public ResponseEntity<${FTL_CatDTO}> create${FTL_Cat}(@Valid @RequestBody ${FTL_CatDTO} ${FTL_catDTO}) throws URISyntaxException {
        log.debug("REST request to save Catramos : {}", ${FTL_catDTO});

        if (${FTL_catDTO}.getId() != null) {
///            throw new BadRequestAlertException("A new catramos cannot already have an ID", ENTITY_NAME, "idexists");
            throw new URISyntaxException("A new catramos cannot already have an ID|"+ ENTITY_NAME, "idexists");
        }

///        CatramosDTO result = catramosService.save(catramosDTO);
        ${FTL_CatDTO} result = ${FTL_catDTO};
        result.setId(1L); // DUMMY Id as if assigned from DB
        return ResponseEntity.created(new URI("/api/${FTL_cat}/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);

    }

    /**
     * {@code PUT  /catramos:id} : Updates an existing catramos.
     *
     * @param id the id of the catramosDTO to save.
     * @param catramosDTO the catramosDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated catramosDTO,
     * or with status {@code 400 (Bad Request)} if the catramosDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the catramosDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/${FTL_cat}/{id}")
    public ResponseEntity<${FTL_CatDTO}> update${FTL_Cat}(@PathVariable(value = "id", required = false) final Long id,@Valid @RequestBody CatramosDTO catramosDTO) throws URISyntaxException {
        log.debug("REST request to update Catramos : {}", ${FTL_catDTO});
        if (${FTL_catDTO}.getId() == null) {
///            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
            throw new URISyntaxException("Invalid id|"+ ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ${FTL_catDTO}.getId())) {
///            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
            throw new URISyntaxException("Invalid ID|"+ ENTITY_NAME, "idinvalid");
        }
/***
        if (!catramosRepository.existsById(id)) {
///            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
            throw new URISyntaxException("Entity not found|"+ ENTITY_NAME, "idnotfound");
        }
        CatramosDTO result = catramosService.save(catramosDTO);
***/
        ${FTL_CatDTO} result = ${FTL_catDTO};
        return ResponseEntity.ok()
//            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, catramosDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /catramos/:id} : Partial updates given fields of an existing catramos, field will ignore if it is null
     *
     * @param id the id of the catramosDTO to save.
     * @param catramosDTO the catramosDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated catramosDTO,
     * or with status {@code 400 (Bad Request)} if the catramosDTO is not valid,
     * or with status {@code 404 (Not Found)} if the catramosDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the catramosDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/catramos/{id}" /*,consumes = "application/merge-patch+json"*/)
    public ResponseEntity<CatramosDTO> partialUpdateCatramos(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody CatramosDTO catramosDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update Catramos partially : {}, {}", id, catramosDTO);
        if (${FTL_catDTO}.getId() == null) {
///            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
            throw new URISyntaxException("Invalid id|"+ ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, ${FTL_catDTO}.getId())) {
///            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
            throw new URISyntaxException("Invalid ID|"+ ENTITY_NAME, "idinvalid");
        }
/***
        if (!catramosRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }
        Optional<CatramosDTO> result = catramosService.partialUpdate(catramosDTO);

***/
        Optional<${FTL_CatDTO}> result = Optional.of(newDummy${FTL_CatDTO}(id));
        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, catramosDTO.getId().toString())
        );
    }

    /**
     * {@code GET  /catramos} : get all the catramoss.
     *
     * @param pageable the pagination information.
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of catramoss in body.
     */
    @GetMapping("/${FTL_cat}")
    public ResponseEntity<List<CatramosDTO>> getAllCatramoss(${FTL_Cat}Criteria criteria, Pageable pageable) {
        log.debug("REST request to get Catramoss by criteria: {}", criteria);
/***
        Page<CatramosDTO> page = catramosQueryService.findByCriteria(criteria, pageable);
***/
        long dummyCount = 20;
        List<CatramosDTO> content = new ArrayList<>();
        for (long i=0; i < dummyCount; i++)
        {
        	content.add(newDummyCatramosDTO(i+1));
        }
        Page<CatramosDTO> page = new PageImpl<CatramosDTO>(content, PageRequest.of(1, 10, Sort.by("id")), dummyCount);

        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /catramos/count} : count all the catramoss.
     *
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the count in body.
     */
    @GetMapping("/catramos/count")
    public ResponseEntity<Long> countCatramoss(${FTL_Cat}Criteria criteria) {
        log.debug("REST request to count Catramoss by criteria: {}", criteria);

///        return ResponseEntity.ok().body(catramosQueryService.countByCriteria(criteria));
        return ResponseEntity.ok().body(3L); // DUMMY COUNT
    }

    /**
     * {@code GET  /catramos/:id} : get the "id" catramos.
     *
     * @param id the id of the catramosDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the catramosDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/catramos/{id}")
    public ResponseEntity<CatramosDTO> getCatramos(@PathVariable Long id) {
        log.debug("REST request to get Catramos : {}", id);
/***
     	Optional<CatramosDTO> catramosDTO = catramosService.findOne(id);
        return ResponseUtil.wrapOrNotFound(catramosDTO);
***/
        CatramosDTO catramosDTO = newDummyCatramosDTO(id);
        ResponseEntity<CatramosDTO> result = new ResponseEntity<CatramosDTO>(catramosDTO, HttpStatus.OK);
        return result;
    }

    /**
     * {@code DELETE  /catramos/:id} : delete the "id" catramos.
     *
     * @param id the id of the catramosDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/catramos/{id}")
    public ResponseEntity<Void> deleteCatramos(@PathVariable Long id) {
        log.debug("REST request to delete Catramos : {}", id);

///        catramosService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }

    private ${FTL_CatDTO} newDummy${FTL_CatDTO}(Long id)
    {
    	${FTL_CatDTO} ${FTL_catDTO} = new ${FTL_CatDTO}();
    	${FTL_catDTO}.setId(id);
    	${FTL_catDTO}.setRamsubramo(110011);
        ${FTL_catDTO}.setNombrel("DUMMY Nombre largo #"+id);
        ${FTL_catDTO}.setNombrec("DUMMY Nombre corto #"+id);
        ${FTL_catDTO}.setNombrem("DUMMY Nombre medio #"+id);
    	${FTL_catDTO}.setContab(1);
    	${FTL_catDTO}.setCvnpolini(null);
    	${FTL_catDTO}.setUltnpoliza(1000);
    	${FTL_catDTO}.setCvnpolren(null);
    	${FTL_catDTO}.setContab(1);

    	${FTL_catDTO}.setStramsram(1);

        ${FTL_catDTO}.setFstat(Instant.now());
/***
{
   "id": 2,
   "ramsubramo": 11012,
   "nombrel": "VIDA INDIVIDUAL DXN ",
   "nombrec": "VIDA IND DXN ",
   "nombrem": "VIDINDDXN ",
   "contab": 1,
   "cvnpolini": 2,
   "ultnpoliza": 1005,
   "cvnpolren": 0,
   "cvnendoso": 1,
   "ultnendoso1": 0,
   "ultnendoso2": 0,
   "ultnendoso3": 3,
   "tiporamo": 2,
   "cvcobp": 1,
   "pzmaxcp": 1,
   "pzmabcp": 3,
   "critgexp": 2,
   "nesqgexp": 0,
   "cvcontcob": 1,
   "critdesc": 2,
   "nesqdesc": 0,
   "critcomp": 2,
   "nesqcomp": 0,
   "tiporenov": 1,
   "diascpzo1": 365,
   "diascpzo2": 0,
   "diascpzo3": 0,
   "diascpzo4": 0,
   "diascpzo5": 0,
   "diascpzo6": 0,
   "diascpzo7": 0,
   "diascpzo8": 0,
   "diascpzo9": 0,
   "diascpzo10": 0,
   "diascpzo11": 0,
   "diascpzo12": 0,
   "diascpzo13": 0,
   "diascpzo14": 0,
   "diascpzo15": 0,
   "diascpzo16": 0,
   "diascpzo17": 0,
   "diascpzo18": 0,
   "diascpzo19": 0,
   "diascpzo20": 0,
   "diascpzo21": 0,
   "diascpzo22": 0,
   "diascpzo23": 0,
   "diascpzo24": 0,
   "diascpzo25": 0,
   "diascpzo26": 0,
   "diascpzo27": 0,
   "diascpzo28": 0,
   "diascpzo29": 0,
   "diascpzo30": 0,
   "diascpzo31": 0,
   "diascpzo32": 0,
   "diascpzo33": 0,
   "diascpzo34": 0,
   "diascpzo35": 0,
   "diascpzo36": 0,
   "diascpzo37": 0,
   "diascpzo38": 0,
   "diascpzo39": 0,
   "diascpzo40": 0,
   "diascpzo41": 0,
   "diascpzo42": 0,
   "diascpzo43": 0,
   "diascpzo44": 0,
   "diascpzo45": 0,
   "diascpzo46": 0,
   "diascpzo47": 0,
   "diascpzo48": 0,
   "diascpzo49": 0,
   "diascpzo50": 0,
   "porccpzo1": 100,
   "porccpzo2": 0,
   "porccpzo3": 0,
   "porccpzo4": 0,
   "porccpzo5": 0,
   "porccpzo6": 0,
   "porccpzo7": 0,
   "porccpzo8": 0,
   "porccpzo9": 0,
   "porccpzo10": 0,
   "porccpzo11": 0,
   "porccpzo12": 0,
   "porccpzo13": 0,
   "porccpzo14": 0,
   "porccpzo15": 0,
   "porccpzo16": 0,
   "porccpzo17": 0,
   "porccpzo18": 0,
   "porccpzo19": 0,
   "porccpzo20": 0,
   "porccpzo21": 0,
   "porccpzo22": 0,
   "porccpzo23": 0,
   "porccpzo24": 0,
   "porccpzo25": 0,
   "porccpzo26": 0,
   "porccpzo27": 0,
   "porccpzo28": 0,
   "porccpzo29": 0,
   "porccpzo30": 0,
   "porccpzo31": 0,
   "porccpzo32": 0,
   "porccpzo33": 0,
   "porccpzo34": 0,
   "porccpzo35": 0,
   "porccpzo36": 0,
   "porccpzo37": 0,
   "porccpzo38": 0,
   "porccpzo39": 0,
   "porccpzo40": 0,
   "porccpzo41": 0,
   "porccpzo42": 0,
   "porccpzo43": 0,
   "porccpzo44": 0,
   "porccpzo45": 0,
   "porccpzo46": 0,
   "porccpzo47": 0,
   "porccpzo48": 0,
   "porccpzo49": 0,
   "porccpzo50": 0,
   "rsrcomb1": 0,
   "rsrcomb2": 0,
   "rsrcomb3": 0,
   "rsrcomb4": 0,
   "rsrcomb5": 0,
   "rsrcomb6": 0,
   "rsrcomb7": 0,
   "rsrcomb8": 0,
   "rsrcomb9": 0,
   "rsrcomb10": 0,
   "rsrcomb11": 0,
   "rsrcomb12": 0,
   "ultnestudi": 0,
   "limnaseg1": 10,
   "limnaseg2": 25,
   "limnaseg3": 50,
   "limnaseg4": 100,
   "limnaseg5": 150,
   "limnaseg6": 200,
   "limnaseg7": 300,
   "limnaseg8": 400,
   "limnaseg9": 9999999,
   "limnaseg10": 0,
   "limnaseg11": 0,
   "limnaseg12": 0,
   "limnaseg13": 0,
   "limnaseg14": 0,
   "limnaseg15": 0,
   "limnaseg16": 0,
   "limnaseg17": 0,
   "limnaseg18": 0,
   "limnaseg19": 0,
   "limnaseg20": 0,
   "factsa1": 15,
   "factsa2": 25,
   "factsa3": 50,
   "factsa4": 50,
   "factsa5": 50,
   "factsa6": 100,
   "factsa7": 100,
   "factsa8": 100,
   "factsa9": 999,
   "factsa10": 0,
   "factsa11": 0,
   "factsa12": 0,
   "factsa13": 0,
   "factsa14": 0,
   "factsa15": 0,
   "factsa16": 0,
   "factsa17": 0,
   "factsa18": 0,
   "factsa19": 0,
   "factsa20": 0,
   "tmaxsa1": 2000000,
   "tmaxsa2": 2000000,
   "tmaxsa3": 2000000,
   "tmaxsa4": 2000000,
   "tmaxsa5": 2000000,
   "tmaxsa6": 2000000,
   "tmaxsa7": 2000000,
   "tmaxsa8": 2000000,
   "tmaxsa9": 2000000,
   "tmaxsa10": 0,
   "tmaxsa11": 0,
   "tmaxsa12": 0,
   "tmaxsa13": 0,
   "tmaxsa14": 0,
   "tmaxsa15": 0,
   "tmaxsa16": 0,
   "tmaxsa17": 0,
   "tmaxsa18": 0,
   "tmaxsa19": 0,
   "tmaxsa20": 0,
   "varsasem1": 0,
   "varsasem2": 0,
   "cvtmaxsa": 0,
   "reqaseg1": 1,
   "reqaseg2": 2,
   "reqaseg3": 3,
   "reqaseg4": 4,
   "reqaseg5": 5,
   "reqaseg6": 6,
   "reqaseg7": 7,
   "reqaseg8": 8,
   "reqaseg9": 9,
   "reqaseg10": 10,
   "reqaseg11": 11,
   "reqaseg12": 12,
   "reqaseg13": 13,
   "reqaseg14": 14,
   "reqaseg15": 15,
   "stramsram": 1,
   "fstat": "2012-12-31T00:00:00Z"
}***/
    	return ${FTL_catDTO};
    }

}
