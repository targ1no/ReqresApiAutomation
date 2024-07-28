Feature: Listagem de usuários

  Scenario: Listar todos os usuários
    When eu faço uma requisição para listar os usuários
    Then a resposta deve ter o status code 200
    And a resposta deve conter uma lista de usuários
