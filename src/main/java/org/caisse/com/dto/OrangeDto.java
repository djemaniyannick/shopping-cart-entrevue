package org.caisse.com.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrangeDto {
	
	private Double prix;
	private String description;
	private int qte;

}
