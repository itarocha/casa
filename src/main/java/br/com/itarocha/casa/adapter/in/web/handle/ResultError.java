package br.com.itarocha.casa.adapter.in.web.handle;

import java.util.ArrayList;
import java.util.List;

public class ResultError {
	
	private List<FieldValidationError> errors;

	public ResultError() {
		this.errors = new ArrayList<>();
	}

	public ResultError(List<FieldValidationError> errors) {
		this.errors = errors;
	}

	public List<FieldValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<FieldValidationError> errors) {
		this.errors = errors;
	}
	
	public ResultError addError(String fieldName, String message) {
		this.errors.add(new FieldValidationError(fieldName, message));
		return this;
	}
}
