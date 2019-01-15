package com.currencyfair.markettrader.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.currencyfair.markettrader.exception.MarketTradeRestException;
import com.currencyfair.markettrader.exception.TradeMessageException;
import com.currencyfair.markettrader.model.TradeMessage;
import com.currencyfair.markettrader.repository.TradeMessageRepository;

/**
 * @author sandra.mulligan
 * 
 * <p>
 * Rest Controller to handle trade message requests
 */
@RestController
@RequestMapping("api/v1/")
public class MarketTradeController {

	private static final Logger logger = LoggerFactory.getLogger(MarketTradeController.class);

	@Autowired 
	private TradeMessageRepository tradeMessageRepository;

	@GetMapping("/allTrades")
	public List<TradeMessage> getTrades(){
		logger.debug("Getting all trades");
		return tradeMessageRepository.findAll();
	}

	@PostMapping("/postTrade")
	public void createTrade(@Valid @RequestBody TradeMessage tradeMessage) throws TradeMessageException {
		tradeMessageRepository.save(tradeMessage);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(TradeMessageException.class)
	@ResponseBody
	public MarketTradeRestException handleTradeMessageException(TradeMessageException ex) {
		return new MarketTradeRestException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex.getCause());
	}
}
