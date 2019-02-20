package com.viyaba.springboot.couchbase.learnings.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class DailyCloseDocument {

	@Id
	private Long id; 
	
	@Field
	private String currentDate;
	
	@Field
	private Double investedAmount;
	
	@Field
	private Double closingValue;
	
	@Field
	private Double closingPercentage;
}
