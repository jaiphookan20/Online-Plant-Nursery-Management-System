package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTO {

	
	private Integer planterId;
	private Integer plantId;
	private Integer seedId;
	private String transactionMode;
	private Integer userid;
	
	
	
}
