package com.bidv.rest.webservices.restfullwebservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "MONEY_TRANFER")
@Entity
public class MoneyTranferEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "money_tranfer_date")
	private Date moneyTranferDate;

	@Column(name = "source_account_id")
	private Integer sourceAccountId;

	@Column(name = "recipient_account_id")
	private Integer recipientAccountId;

	@Column(name = "bank_id")
	private Integer receivingBank;

	private Integer amount;
	
	private String content;

	private String payer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoneyTranferDate() {
		return moneyTranferDate;
	}

	public void setMoneyTranferDate(Date moneyTranferDate) {
		this.moneyTranferDate = moneyTranferDate;
	}

	public Integer getSourceAccountId() {
		return sourceAccountId;
	}

	public void setSourceAccountId(Integer sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}

	public Integer getRecipientAccountId() {
		return recipientAccountId;
	}

	public void setRecipientAccountId(Integer recipientAccountId) {
		this.recipientAccountId = recipientAccountId;
	}

	public Integer getReceivingBank() {
		return receivingBank;
	}

	public void setReceivingBank(Integer receivingBank) {
		this.receivingBank = receivingBank;
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

}
