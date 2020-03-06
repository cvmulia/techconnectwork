package com.example.techconnect.quote_client_example;

import com.example.techconnect.quote_client_example.Clients.QuoteClient;
import com.example.techconnect.quote_client_example.payloads.Quote;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuoteClientExampleApplicationTests {

	@Autowired
	QuoteClient quoteClient;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetRequestFromQuoteApi(){
		Quote quote = quoteClient.requestQuote();
		System.out.println(quote.getValue().getQuote());
	}
}
