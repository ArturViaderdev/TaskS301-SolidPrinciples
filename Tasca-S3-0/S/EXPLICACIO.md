## English

# S - Single Responsibility Principle (SRP)

The `User` class had **too many responsibilities**. Specifically, the responsibilities it had were:

- Save the user
- Register the user
- Check correct email
- Check correct password
- Send confirmation email
- Verify email confirmation


## Changes Made:

1. **Created a new class called `EmailVerify`** that receives an email in the constructor and has a method that verifies the email. If the email is incorrect, it throws an `IllegalArgumentException`.

The class receives the email in the constructor but also has a setter so the instance can be reused to verify another email.
2. **Created a new class called `PasswordVerify`** that receives a password in the constructor and has a method that verifies the password. If the password is incorrect, it throws an `IllegalArgumentException`.

The class receives the password in the constructor but also has a setter so the instance can be reused to verify another password.
3. **Created a new class called `ConfirmEmail`** that receives an email and has a method to send a registration confirmation email to the user, and another method that verifies if the user has confirmed the registration from the email.
4. **Created a `Register` class** that handles user registration. Now `User` only stores the data.

#Catalan

# S - Principi de Responsabilitat Única (SRP)

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

4 - He creat una classe `Register` que s'encarrega del registre del usuari. Ara usuari només guarda les dades.

