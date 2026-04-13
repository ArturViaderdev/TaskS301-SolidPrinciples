## English

# Interface Segregation Principle (ISP)

The exercise created a **washing machine** object and an **air conditioner** object from a common **`Machine`** interface.

There were methods that served **no purpose** for either class.

An air conditioner **cannot wash**.

A washing machine **cannot heat or cool**.

But both can be **turned on and off**.

I created a **`Machine`** interface that contains the definitions for the **on** and **off** methods.

I also created a **`TemperatureMachine`** interface with the definitions for the **heat** and **cool** methods.

And I created a **`Washer`** interface that allows washing.

Now the **air conditioner** implements **`Machine`** and **`TemperatureMachine`**.

And the **washing machine** implements **`Machine`** and **`Washer`**.

This way, **no class is forced to implement methods it doesn't need**.

## Catalan

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

