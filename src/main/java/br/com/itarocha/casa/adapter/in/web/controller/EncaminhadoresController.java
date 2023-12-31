package br.com.itarocha.casa.adapter.in.web.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/app/encaminhadores")
public class EncaminhadoresController {

	/*
	@Autowired
	private EncaminhadorService service;
	
	@GetMapping("{id}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		try {
			Optional<EncaminhadorEntity> model = service.find(id);
			if (model.isPresent()) {
				return new ResponseEntity<>(model.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("não encontrado", HttpStatus.NOT_FOUND);
			}
		} finally {
			//em.close();
		}
	}

	@GetMapping("/por_encaminhador/{id}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<List<EncaminhadorEntity>> listar(@PathVariable("id") Long entidadeId) {
		List<EncaminhadorEntity> lista = service.findAll(entidadeId);
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@PostMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> gravar(@RequestBody EncaminhadorEntity model) {
		ItaValidator<EncaminhadorEntity> v = new ItaValidator<EncaminhadorEntity>(model);
		v.validate();
		if (!v.hasErrors() ) {
			return new ResponseEntity<>(v.getErrors(), HttpStatus.BAD_REQUEST);
		}
		
		try {
			EncaminhadorEntity saved = null;
			saved = service.create(model);
		    return new ResponseEntity<EncaminhadorEntity>(saved, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("{id}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		try {
			service.remove(id);
			return new ResponseEntity<String>("sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 }
	
	@GetMapping("/lista/{id}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> getListaEncaminhadores(@PathVariable("id") Long entidadeId) {
		List<SelectValueVO> lista = service.listSelect(entidadeId);
		return new ResponseEntity<List<SelectValueVO>>(lista, HttpStatus.OK);
	}
	 */
}
