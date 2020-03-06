package com.example.techconnect.quote_client_example.payloads;

public class Value {
    private int id;
    private String quote;

    public Value(int id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Value(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
