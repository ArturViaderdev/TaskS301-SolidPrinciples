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

