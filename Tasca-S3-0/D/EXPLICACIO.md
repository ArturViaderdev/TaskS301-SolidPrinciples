El codi estava previst per utilitzar-lo només amb la base de dades Mysql.

He creat un interface anomenat `Database` i la classe `Mysql` ara implementa aquesta interface.

També he creat una classe `SqLite` com a demostració.

En el Service Person he creat una variable de la interface `Database` que pot esser de qualsevol classe que la implementi. Se li envia en el constructor.

He creat un `Main` per a testejar el funcionament correcte.

