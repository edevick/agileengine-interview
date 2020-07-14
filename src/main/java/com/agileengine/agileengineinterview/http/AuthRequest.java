package com.agileengine.agileengineinterview.http;

public class AuthRequest {

    private String apiKey;

    public AuthRequest(final String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(final String apiKey) {
        this.apiKey = apiKey;
    }
}
