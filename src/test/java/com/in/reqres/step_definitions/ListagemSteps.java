package com.in.reqres.step_definitions;


import com.in.reqres.logic.ListagemLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class ListagemSteps {

    private Response response;
    private ListagemLogic listagemLogic = new ListagemLogic();

    @When("eu faço uma requisição para listar os usuários")
    public void eu_faco_uma_requisicao_para_listar_os_usuarios() {
        response = listagemLogic.listarUsuarios();
    }

    @Then("a resposta deve ter o status code {int}")
    public void a_resposta_deve_ter_o_status_code(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("a resposta deve conter uma lista de usuários")
    public void a_resposta_deve_conter_uma_lista_de_usuarios() {
        assertNotNull(response.jsonPath().getList("data"));
    }
}