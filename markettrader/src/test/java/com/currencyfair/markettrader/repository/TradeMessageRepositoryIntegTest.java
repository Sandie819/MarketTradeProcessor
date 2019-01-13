package com.currencyfair.markettrader.repository;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.currencyfair.markettrader.model.TradeMessage;
import com.currencyfair.markettrader.repository.TradeMessageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeMessageRepositoryIntegTest {

	@Autowired
	TradeMessageRepository tradeMessageRepository;
	
	@Test
	public void testFindAllTrades() {
	
		List<TradeMessage> allTrades = tradeMessageRepository.findAll();
		
		assertThat(allTrades.size(), is(greaterThanOrEqualTo(0)));
	}
}
