package br.com.itarocha.casa.adapter.in.web.handle;

public class FieldValidationError {
	
	private String fieldName;
	private String errorMessage;

	public FieldValidationError(String fieldName, String errorMessage) {
		this.fieldName = fieldName;
		this.errorMessage = errorMessage;
	}
	
	public String getFieldName() {
		return fieldName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
