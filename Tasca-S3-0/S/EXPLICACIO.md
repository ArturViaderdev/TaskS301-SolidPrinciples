La classe user tenia masses responsabilitats. En concret les responsabilitats que tenia eren:
- Guardar el usuari
- Registrar el usuari.
- Comprovar email correcte.
- Comprovar password correcte.
- Enviar email de confirmació.
- Verificar la confirmació del email.

1- He creat una nova classe anomenada `EmailVerify` que rep un email en el constructor i te un mètode que verifica el email. Si el email és incorrecte crea una excepció del tipus `IllegalArgumentException`.

La classe rep el email en el constructor però també te un set de manera que es pot reutilitzar la instància per a verificar un altre email.

2 - He creat una nova classe anomenada `PasswordVerify` que rep un password en el constructor i te un mètode que verifica el password. Si el password és incorrecte crea una exepció del tipus `IllegalArgumentException`.

La classe rep el password en el constructor però també te un set de manera que es pot reutilitzar la instància per a verificar un altre password.

3 - He creat una nova classe anomenada `ConfirmEmail` que rep un email i te un mètode per enviar un mail de confirmació de registre al usuari i un altre mètode que verifica si l'usuari ha confirmat el registre des de el mail.
