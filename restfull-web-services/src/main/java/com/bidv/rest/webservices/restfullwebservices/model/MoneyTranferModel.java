package com.bidv.rest.webservices.restfullwebservices.model;

import java.util.Date;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;

public class MoneyTranferModel {

	private Integer id;

	private Date moneyTranferDate;

	private SourceAccountEntity sourceAccountEntity;

	private RecipientAccountEntity recipientAccountEntity;

	private BankEntity bankEntity;

	private Integer amount;

	private String content;

	private String payer;
	
	private String moneyTranferDateStr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	


	public MoneyTranferModel() {
		super();
	}

	public SourceAccountEntity getSourceAccountEntity() {
		return sourceAccountEntity;
	}

	public void setSourceAccountEntity(SourceAccountEntity sourceAccountEntity) {
		this.sourceAccountEntity = sourceAccountEntity;
	}

	public RecipientAccountEntity getRecipientAccountEntity() {
		return recipientAccountEntity;
	}

	public void setRecipientAccountEntity(RecipientAccountEntity recipientAccountEntity) {
		this.recipientAccountEntity = recipientAccountEntity;
	}

	public BankEntity getBankEntity() {
		return bankEntity;
	}

	public void setBankEntity(BankEntity bankEntity) {
		this.bankEntity = bankEntity;
	}

	public Date getMoneyTranferDate() {
		return moneyTranferDate;
	}

	public void setMoneyTranferDate(Date moneyTranferDate) {
		this.moneyTranferDate = moneyTranferDate;
	}

	public String getMoneyTranferDateStr() {
		return moneyTranferDateStr;
	}

	public void setMoneyTranferDateStr(String moneyTranferDateStr) {
		this.moneyTranferDateStr = moneyTranferDateStr;
	}

	public MoneyTranferModel(Integer id, Date moneyTranferDate, SourceAccountEntity sourceAccountEntity,
			RecipientAccountEntity recipientAccountEntity, BankEntity bankEntity, Integer amount, String content,
			String payer, String moneyTranferDateStr) {
		super();
		this.id = id;
		this.moneyTranferDate = moneyTranferDate;
		this.sourceAccountEntity = sourceAccountEntity;
		this.recipientAccountEntity = recipientAccountEntity;
		this.bankEntity = bankEntity;
		this.amount = amount;
		this.content = content;
		this.payer = payer;
		this.moneyTranferDateStr = moneyTranferDateStr;
	}

	
	
	

}
