package br.com.itarocha.casa.adapter.in.web.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResultError> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        List<FieldValidationError> errors = e.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error -> new FieldValidationError(((FieldError) error).getField(), error.getDefaultMessage()))
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ResultError(errors));
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResultError> handleHttpMessageNotReadableException(HttpMessageNotReadableException e){
        List<FieldValidationError> errors = new ArrayList<>();
        errors.add(new FieldValidationError("*", "Conteúdo da requisição não pôde ser lido"));
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ResultError(errors));
    }

}
