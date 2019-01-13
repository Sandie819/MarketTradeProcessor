package com.currencyfair.markettrader.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TradeMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	private String userId;
	private String currencyFrom;
	private String currencyTo;
	private BigDecimal amountSell;
	private BigDecimal amountBuy;
	private double rate;
	private LocalDateTime timePlaced;
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
	public LocalDateTime getTimePlaced() {
		return timePlaced;
	}
	public void setTimePlaced(LocalDateTime timePlaced) {
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
