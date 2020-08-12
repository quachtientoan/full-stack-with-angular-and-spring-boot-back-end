package com.bidv.rest.webservices.restfullwebservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Table(name = "MONEY_TRANFER_VIEW")
@Entity
@Immutable
public class MoneyTranferView {

		@Id
		private Integer id;

		@Column(name = "money_tranfer_date")
		private Date moneyTranferDate;

		@Column(name = "source_account_name")
		private String sourceAccountName;

		@Column(name = "recipient_account_name")
		private String recipientAccountName;

		@Column(name = "bank_name")
		private String bankName;

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

		public String getSourceAccountName() {
			return sourceAccountName;
		}

		public void setSourceAccountName(String sourceAccountName) {
			this.sourceAccountName = sourceAccountName;
		}

		public String getRecipientAccountName() {
			return recipientAccountName;
		}

		public void setRecipientAccountName(String recipientAccountName) {
			this.recipientAccountName = recipientAccountName;
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

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getPayer() {
			return payer;
		}

		public void setPayer(String payer) {
			this.payer = payer;
		}
		
		

}
