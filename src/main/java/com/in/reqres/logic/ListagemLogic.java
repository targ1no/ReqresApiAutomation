package com.in.reqres.logic;

import com.in.reqres.utils.Endpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ListagemLogic {

    public Response listarUsuarios() {

        RestAssured.baseURI = Endpoints.BASE_URL.getUrl();
        return given()
                .when()
                .get(Endpoints.LIST_USERS.getUrl())
                .then()
                .extract()
                .response();
    }
}