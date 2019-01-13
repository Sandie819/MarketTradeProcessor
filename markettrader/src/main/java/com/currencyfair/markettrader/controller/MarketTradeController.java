package com.currencyfair.markettrader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencyfair.markettrader.model.TradeMessage;
import com.currencyfair.markettrader.repository.TradeMessageRepository;

@RestController
@RequestMapping("api/v1/")
public class MarketTradeController {
 
	@Autowired 
	TradeMessageRepository tradeMessageRepository;
	
	@GetMapping("/allTrades")
	public List<TradeMessage> getTrades(){
		return tradeMessageRepository.findAll();
	}
	
	@PostMapping("/postTrade")
	public void createTrade(@RequestBody TradeMessage tradeMessage){
		tradeMessageRepository.save(tradeMessage);
	}
}
