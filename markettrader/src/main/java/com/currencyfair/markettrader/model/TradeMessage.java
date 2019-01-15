package com.currencyfair.markettrader.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class TradeMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@NotNull(message="User ID cannot be missing or empty")
	private String userId;
	
	@Size(min=3, max=3, message="Currency From must be three characters")
	private String currencyFrom;
	
	@Size(min=3, max=3, message="Currency To must be three characters")
	private String currencyTo;
	
	@Range(min = 0l, message = "Sell amount cannot be negative")
	private BigDecimal amountSell;
	
	@Range(min = 0l, message = "Buy amount cannot be negative")
	private BigDecimal amountBuy;
	
	@Positive
	private double rate;
	
	@Past
	private Date timePlaced;
	
	@NotNull(message="Originating Country cannot be missing or empty")
	private String originatingCountry;
		
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public BigDecimal getAmountSell() {
		return amountSell;
	}
	public void setAmountSell(BigDecimal amountSell) {
		this.amountSell = amountSell;
	}
	public BigDecimal getAmountBuy() {
		return amountBuy;
	}
	public void setAmountBuy(BigDecimal amountBuy) {
		this.amountBuy = amountBuy;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}	
	
	public Date getTimePlaced() {
		return timePlaced;
	}
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MMM-yy HH:mm:ss")
	public void setTimePlaced(Date timePlaced) {
		this.timePlaced = timePlaced;
	}
	
	public String getOriginatingCountry() {
		return originatingCountry;
	}
	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
	
	@Override
	public String toString() {
		return "TradeMessage [userId=" + userId + ", currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo
				+ ", amountSell=" + amountSell + ", amountBuy=" + amountBuy + ", rate=" + rate + ", timePlaced="
				+ timePlaced +", originatingCountry=" + originatingCountry + "]";
	}
	
}
