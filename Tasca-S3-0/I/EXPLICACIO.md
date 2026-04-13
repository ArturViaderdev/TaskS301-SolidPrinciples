# Principi de Segregació d'Interfícies (ISP)

L'exercici creava un objecte rentadora i un altre aire acondicionat a partir de una interface comú `Machine`.

Hi havia mètodes que no servíen per a res a les dues classes. 

Un aire acondicionat no pot rentar.

Una rentadora no pot fer calor i fred.

Però ambdos es poden encendre i apagar.

He creat una interface `Machine` que conté les definicions del mètodes per encendre i apagar.

També he creat una interface `TemperatureMachine` que te les definicions dels mètodes per a fer calor i fred.

I he creat una interface Washer que permet rentar.

Ara l'aire acondicionat implementa `Machine` i `TemperatureMacine`.

I la rentadora implementa `Machine` i `Washer`.

D'aquesta forma cap classe està obligada a implementar mètodes que no necessita.

