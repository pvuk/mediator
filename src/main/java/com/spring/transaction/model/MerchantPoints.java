package com.spring.transaction.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "MERCHANT_POINTS")
public class MerchantPoints {
	
	@Id
	private String merchantPointsId;
	
	@NotEmpty(message = "Point Value is required field")
	private long eachPointValue;
	
	private long pointsOnEvery;
	
	//10x
	private String rewardsOnMerchantCategory;
}
