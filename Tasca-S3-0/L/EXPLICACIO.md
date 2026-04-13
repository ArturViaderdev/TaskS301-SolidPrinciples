## English

# Liskov Substitution Principle (LSP)

In the exercise there are two classes that are **characters**.

A **ghost** cannot take damage but **can attack**.

A **warrior** can take damage and **can also attack**.

If a ghost took damage, it could **cause an error**.

I created a **`DamageStrategy`** interface that defines the **take damage** method.

Then I created two classes: **`DamageStrategyAllowed`** and **`DamageStrategyNotAllowed`**.

In **`Character`**, I created a **`DamageStrategy`** type variable that is received in the constructor.

When the **take damage** method is called, it calls the **`DamageStrategy`** one.

When creating a ghost, I pass **`DamageStrategyNotAllowed`** to the super constructor, **avoiding the error**.

## Catalan

# Principi de Substitució de Liskov (LSP)

En l'exercici hi han dos classes que són personatges.

Un fantasma no pot rebre dany però si pot atacar.

Un guerrer si pot rebre dany i també pot atacar.

Si un fantasma rebía dany es podía produir error.

He creat una interficie `DamageStrategy` que defineix el mètode de tenir dany.

Després he creat dues classes `DamageStrategyAllowed` i `DamageStrategyNotAllowed`.

A `Character` he creat una variable del tipud `DamageStrategy`que es rep en el constructor.

Quan es cridi el mètode de tenir dany és crida al de `DamageStrategy`.

Al crear un fantasma li passo al super `DamageStrategyNotAllowed`i s'evita l'error.

