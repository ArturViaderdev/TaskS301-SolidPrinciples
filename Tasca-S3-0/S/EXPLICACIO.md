La classe user tenia masses responsabilitats. En concret les responsabilitats que tenia eren:
- Guardar el usuari
- Registrar el usuari.
- Comprovar email correcte.
- Comprovar password correcte.
- Enviar email de confirmació.
- Verificar la confirmació del email.

1- He creat una nova classe anomenada `EmailVerify` que te rep un email en el constructor i te un mètode que verifica el email. Si el email és incorrecte crea una excepció del tipus `IllegalArgumentException`.