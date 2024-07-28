package com.in.reqres.utils;

public enum Endpoints {
    BASE_URL("https://reqres.in/api"),
    LIST_USERS("/users"),
    CREATE_USER("/users"),
    UPDATE_USER("/users/{id}"),
    DELETE_USER("/users/{id}");

    private final String url;

    Endpoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}