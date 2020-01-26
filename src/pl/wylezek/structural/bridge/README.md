#Most
Wzorzec projektowy który oddziela abstrakcję od jej implementacji, dzięki czemu można modyfikować te dwa elementy
niezależnie od siebie. We wzorze preferowana jest kompozycja zamiast dziedziczenia. Szczegóły implemenstacji 
są przekazywane z hierarchii do innego obiektu z osobą hierarchią. 

Stosowanie:
- Jeżeli chcemy uniknąć trwałego powiązania abstrakcji i jej implementacji.
- Jeżeli zmiany w implementacji abstrakcji nie powinny mieć wpływu na klienta. 