package br.com.itarocha.casa.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchRequest {
	private String fieldName;
	private String value;
	private String operator;
}
