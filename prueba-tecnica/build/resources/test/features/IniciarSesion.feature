Feature: Iniciar sesion

  Como usuario
  Quiero acceder al sistema
  Para iniciar sesion


  Scenario: Iniciar sesion con correo y contrasena
    Given que el usuario ya se registro en el sistema
    When desee iniciar sesion
    And se encuentre en la pagina de autenticacion
    And ingrese el correo "dag@gmail.com"
    And ingrese la contrasena "12345"
    And de clic en el boton Sign in
    And las credenciales son validas
    Then el inicio de sesion es exitoso