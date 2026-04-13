# O - Principi Obert/Tancat (OCP)

L'exercici definia els instruments amb un `String` i els detectava amb un `if`.
He modificat el codi de manera que existeix una interface `Instrument` comú per a tots els instruments i classes definint cada instrument.

Ara si es vol modificar el projecte afegint més instruments només s'han de crear classes per a cada tipus d'instrument.

He separat a més el `Main` de `InstrumentPlayer`.