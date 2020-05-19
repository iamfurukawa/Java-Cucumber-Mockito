Feature: Calculate IMC
 
  Scenario: Abaixo do Peso
    Given the user called "Dario" with 60 kilos and 1.8F height
    When I calculate the IMC
    Then the result is "Abaixo do Peso"
    
  Scenario: Peso ideal
    Given the user called "Dan" with 65 kilos and 1.63F height
    When I calculate the IMC
    Then the result is "Peso ideal"
    
  Scenario: Acima do Peso
    Given the user called "Trent" with 75 kilos and 1.7F height
    When I calculate the IMC
    Then the result is "Acima do Peso"
    
  Scenario: Obesidade
    Given the user called "Mario" with 90 kilos and 1.72F height
    When I calculate the IMC
    Then the result is "Obesidade"
    
  Scenario: Obesidade Grave
    Given the user called "Gavin" with 130 kilos and 1.72F height
    When I calculate the IMC
    Then the result is "Obesidade Grave"
    
  Scenario: User Mocked
    Given a user mocked
    When I calculate the IMC for a user mocked
    Then assert the user mocked