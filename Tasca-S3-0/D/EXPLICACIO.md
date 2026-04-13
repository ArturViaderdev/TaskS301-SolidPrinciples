## English

# D - Dependency Inversion Principle (DIP)

The code was originally designed to work only with the **MySQL** database.

I created an interface called **`Database`** and now the **`Mysql`** class implements this interface.

I also created a **`SqLite`** class as a demonstration.

In the **PersonService**, I created a **`Database`** interface variable that can be any class implementing it. It's passed via the constructor.[^3]

I created a **`Main`** class to test the correct functionality.

## Catalan

# D - Principi d’Inversió de Dependències (DIP)

El codi estava previst per utilitzar-lo només amb la base de dades Mysql.

He creat un interface anomenat `Database` i la classe `Mysql` ara implementa aquesta interface.

També he creat una classe `SqLite` com a demostració.

En el Service Person he creat una variable de la interface `Database` que pot esser de qualsevol classe que la implementi. Se li envia en el constructor.

He creat un `Main` per a testejar el funcionament correcte.

