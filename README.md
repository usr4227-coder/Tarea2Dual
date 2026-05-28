# README

Este proyecto desarrolla un sistema de investigadores especializados utilizando herencia, polimorfismo, sobrecarga de métodos, interfaces y control de excepciones. Cada investigador realiza un tipo de trabajo distinto y además se evalúa su estado salarial según los criterios definidos en cada clase.

## Investigador

Investigador es una clase abstracta que contiene los atributos comunes (nombre, especialidad y sueldo). Define el método estadoDelSueldo(), que cada clase concreta implementa según sus propias reglas.

## Matemático

El Matemático trabaja con una matriz de enteros. Puede multiplicarla por un número o sumarle otra matriz del mismo tamaño. Ambos métodos incluyen control de errores mediante bloques try/catch para evitar operaciones no válidas, como multiplicar por números negativos o recibir matrices incompatibles.

## Biólogo

El Biólogo gestiona una lista de especímenes. Su método trabajar() ordena la lista y elimina el último elemento. En trabajoDual() se invierte el orden de la lista. Ambos métodos incorporan control de errores para manejar listas vacías o nulas.

## Químico

El Químico aumenta su nivel de toxicidad cada vez que trabaja. En el trabajo dual utiliza la lista del biólogo, ordenándola por longitud y eliminando el elemento más largo. También incluye control de errores para evitar fallos cuando la lista no es válida.

## Aplicación principal

En la clase App se crean los tres investigadores y se ejecutan sus métodos principales y duales. Después se fuerzan situaciones que provocan errores para comprobar el funcionamiento de los bloques try/catch. Finalmente, se muestran los resultados obtenidos: la matriz del matemático, la lista del biólogo, el nivel de toxicidad del químico y el estado del sueldo de cada uno.

## Conclusión

El proyecto demuestra el uso conjunto de herencia, polimorfismo, interfaces, colecciones, matrices y control de excepciones. Cada clase gestiona sus propios errores y la aplicación principal permite verificar que el comportamiento es correcto incluso en situaciones no válidas.
