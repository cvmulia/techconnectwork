package com.example.techconnect.quote_client_example.Clients;

import com.example.techconnect.quote_client_example.payloads.Quote;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class QuoteClient {
    public Quote requestQuote(){
        // create REST TEMPLATE
        RestTemplate restTemplate = new RestTemplate();

        // RESTtemplate.get
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        // gives a Quote object


        //return Quote Object
        return quote;
    }
}
