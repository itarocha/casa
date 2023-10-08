package br.com.itarocha.casa.adapter.in.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/app/destinacao_hospedagem")
@RequiredArgsConstructor
public class DestinacaoHospedagemController {

	/*
	private final DestinacaoHospedagemUseCase service;
	
	@GetMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<?> listar() {
	    return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}

	@PreAuthorize("hasAnyRole('ADMIN','ROOT')")
	@GetMapping("{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		try {
			DestinacaoHospedagem model = service.find(id);
			if (model != null) {
				return new ResponseEntity<>(model, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Destinação de Hospedagem não existe", HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@PreAuthorize("hasAnyRole('ADMIN','ROOT')")
	public ResponseEntity<?> gravar(@RequestBody @Valid @NotNull DestinacaoHospedagem model) { //DTO
		ItaValidator<DestinacaoHospedagem> v = new ItaValidator(model);
		v.validate();
		if (!v.hasErrors() ) {
			return new ResponseEntity<ResultError>(v.getErrors(), HttpStatus.BAD_REQUEST);
		}
		
		try {
		    return new ResponseEntity(service.create(model), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("{id}")
	@PreAuthorize("hasAnyRole('ADMIN','ROOT')")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		try {
			service.remove(id);
		    return new ResponseEntity("sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 }
	 */
}