#Kompozyt

Wzorzec projektowy, którego celem jest składanie obiektów w taki sposób aby klient widział
wiele z nich jako pojedyczny obiekt.

Wzorzec wyróżnia następujące elementy:
- Component - klasa abstrakcyjna / interfejs reprezentujący pojedyncze obiekty Leaf (Department)
- Leaf - typ prosty nie posiadający potomków (FinancialDepartment, SalesDeparment)
- Composite - przechowuje obiekty proste Leaf, implementuje zachowanie elementów które zawiera (HeadDepartment)
