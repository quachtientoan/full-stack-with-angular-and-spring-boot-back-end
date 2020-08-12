package com.bidv.rest.webservices.restfullwebservices.model;

import java.util.Date;

public class MoneyTranferModel {

	private Integer id;
	
	private Date moneyTranferDate;
	
	private Integer sourceAccountId;
	
	private Integer recipientAccountId;
	
	private Integer receivingBank;
	
	private Integer amount;
	
	private String content;
	
	private String payer;
}
