Feature: Registro de la información para un nuevo usuario
  Como usuario natural
  Necesito que el sistema permita el registro
  Para realizar compras

  Background: Datos
    Given que el usuario se encuentra en la plataforma

  Scenario: Registro de usuario exitoso
    When digita los campos con la información requerida y da clic en el botón Guardar
    Then Válido el mensaje "TU CUENTA YA ESTÁ CREADA"


