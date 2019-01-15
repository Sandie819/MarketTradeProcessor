package com.currencyfair.markettrader.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author sandra.mulligan
 * 
 * <p>
 * Provides extra information to client on exception being thrown
 */
public class MarketTradeExceptionResponse {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;	
	private String message;
    private List<String> details;

	private MarketTradeExceptionResponse() {
		timestamp = LocalDateTime.now();
	}

	public MarketTradeExceptionResponse(String message, List<String> details) {
		this();
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}
}
