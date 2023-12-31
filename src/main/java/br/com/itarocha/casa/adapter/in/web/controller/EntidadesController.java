package br.com.itarocha.casa.adapter.in.web.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/app/entidades")
public class EntidadesController {

	/*
	@Autowired
	private EntidadeService service;
	
	@GetMapping("{id}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		try {
			Optional<EntidadeEntity> model = service.find(id);
			if (model.isPresent()) {
				return new ResponseEntity<EntidadeEntity>(model.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("não encontrado", HttpStatus.NOT_FOUND);
			}
		} finally {
			//em.close();
		}
	}

	@GetMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> listar() {
		List<EntidadeEntity> lista = service.findAll();
		return new ResponseEntity<List<EntidadeEntity>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/consultar/{texto}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> consultar(@PathVariable("texto") String texto) {
		List<EntidadeEntity> lista = service.consultar(texto);
		return new ResponseEntity<List<EntidadeEntity>>(lista, HttpStatus.OK);
	}

	@PostMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> gravar(@RequestBody EntidadeEntity model) {
		
		if (model.getCnpj() != null) {
			model.setCnpj(model.getCnpj().replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("\\/", ""));
		}
		if (model.getEndereco() != null && model.getEndereco().getCep() != null) {
			model.getEndereco().setCep((model.getEndereco().getCep().replaceAll("\\-", "")));
		}
		
		ItaValidator<EntidadeEntity> v = new ItaValidator<EntidadeEntity>(model);
		v.validate();
		
		if (model.getCnpj() != null && model.getCnpj() != "") {
			if (!Validadores.isValidCNPJ(model.getCnpj())) {
				v.addError("cnpj", "CNPJ inválido");
			}
		}
		
		if (!v.hasErrors() ) {
			return new ResponseEntity<>(v.getErrors(), HttpStatus.BAD_REQUEST);
		}
		
		try {
			EntidadeEntity saved = null;
			saved = service.create(model);
		    return new ResponseEntity<EntidadeEntity>(saved, HttpStatus.OK);
		} catch (ValidationException e) {
			ResponseEntity<?> re = new ResponseEntity<>(e.getRe(), HttpStatus.BAD_REQUEST); 
			return re;
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
	 */
}