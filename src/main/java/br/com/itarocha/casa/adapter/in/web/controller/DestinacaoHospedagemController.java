package br.com.itarocha.casa.adapter.in.web.controller;

import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;
import br.com.itarocha.casa.core.ports.in.DestinacaoHospedagemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/app/destinacao_hospedagem")
@RequiredArgsConstructor
public class DestinacaoHospedagemController {

	private final DestinacaoHospedagemUseCase service;
	
	@GetMapping
	//@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<List<DestinacaoHospedagem>> listar() {
	    return ResponseEntity.ok(service.findAll());
	}

	//@PreAuthorize("hasAnyRole('ADMIN','ROOT')")
	@GetMapping("{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		Optional<DestinacaoHospedagem> opt = service.find(id);
		if (opt.isPresent()) {
			return ResponseEntity.ok(opt.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//@PreAuthorize("hasAnyRole('ADMIN','ROOT')")
	public ResponseEntity<?> gravar(@RequestBody @Valid /*@NotNull*/ DestinacaoHospedagem model) { //DTO
		/*
		ItaValidator<DestinacaoHospedagem> v = new ItaValidator(model);
		v.validate();
		if (!v.hasErrors() ) {
			return new ResponseEntity<ResultError>(v.getErrors(), HttpStatus.BAD_REQUEST);
		}
		*/
		try {
		    return new ResponseEntity(service.create(model), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
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