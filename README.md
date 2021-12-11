# Principios Solid
Acrónimos:
- **S:** Single responsibility principle.
- **O:** Open / Closed principle.
- **L:** Liskov substitution principle.
- **I:** Interface segregation principle.
- **D:** Dependency inversion principle.

## Single responsibility principle

Este consta en mantener una funcionalidad por clase, para ello se usa el ejemplo de la cohesión, si cada clase tiene una única responsabilidad, esta será más fácil de mantener.

La cohesión se refiere al grado en el que el contenido de un módulo está relacionado entre sí, si un módulo agrupa funcionalidad muy dispersa su  cohesión es baja, mientras que si un módulo tiene una única responsabilidad, su cohesión es alta.

Al tener una alta cohesión podremos hacer sistemas con más mantenibilidad y reusabilidad.

*"Una clase debe tener sólo una razón para cambiar. - __Robert C. Martin__"*.

## Open/closed principle

*"Nuestras entidades (clases, módulos, funciones, etc) deben ser abiertas para la extensión pero cerradas para la modificación. - __Bertrand Meyer__"*.

En otras palabras, nuestro sistema debe ser extensible, pero esta extensibilidad se debe conseguir sin modificar el código existente ya que puede causar errores y deberíamos ejecutar las pruebas nuevamente.