Feature: Iniciar sesion

  Como usuario
  Quiero acceder al sistema
  Para iniciar sesion


  Scenario: Iniciar sesion con correo y contrasena
    Given el usuario desea iniciar sesion
    When de clic sobre el botón Sign in
    And ingrese el correo electronico "dag@gmail.com"
    And ingrese la contrasena "12345"
    And de clic en el boton Sign in
    Then el inicio de sesion es exitoso

