
Feature: acessar o site register
  Eu como usuário quero acessar o site register para preencher o formulario


  Background: Acessar o site register
  Given dado que eu esteja no site "https://demo.automationtesting.in/Register.html" 
  
  Scenario: Automatizar o formulario 
    When preencho o formulario 
    And clico em submit
    Then deveria concluir o registro 
    
 Scenario: Preenchendo o campo Frame
    And clico em switch to
    When clico em Frame
    Then escrevo texto dentro do campo 
    
 Scenario: Preenchendo o campo data
    And clico em widgets
    And clico em DatePicker
    When preencho o campo DatePicker Disabled 
    Then preencho o campo DatePicker Enabled 
 
 Scenario: Movendo a barra
    And clico em widgets
    When clico em Slider
    Then movo a o cursor da barra ate a metade
    

    
    

    