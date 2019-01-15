package com.currencyfair.markettrader.exception;

/**
 * @author sandra.mulligan
 * 
 * <p>
 * Handle Trade Message Exceptions thrown by rest controller
 */
public class TradeMessageException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public TradeMessageException(String message) {
        super(message);
    }
}