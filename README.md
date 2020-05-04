# patrones-intro-practica-v1

## 1 - La era Tesla

En la concesionaria tenemos un sistema que permite a los clientes elegir el modelo de auto que desean comprar e imprime su ficha técnica por pantalla.
Este sistema trabaja con diferentes tipos de motores (`motorEconomico`, `motorDeportivo`) que comparten características comunes así como su funcionamiento. Dependiendo el tipo de motor que se elija este ira acompañado de un tipo de transmisión  y combustible.

Desde California, Estados unidos. Tesla, Inc. nos envía su nuevo motor eléctrico para modernizar nuestros vehículos.
Se desea vincular al sistema una clase de tipo `motorEléctrico` con un funcionamiento diferente al de los demás, se debe adaptar la nueva clase sin que esto afecte la lógica inicial de la aplicación...

**IMPORTANTE**

El motor llega  ya ensamblado de fábrica, por lo cual, no podemos modificarlo ya que esto afecta la garantía del mismo y nuestro convenio con la empresa.


## 2 - Aves de invierno


Como a pepita le constaba volar a lugares fríos 
tuvimos que entrenar aves de invierno. Estas aves además de poder 
volar tienen la capacidad de conservar energía, lo hacen 
manteniendo su temperatura corporal, pero eso no es todo,
para adaptarse a las condiciones más extremas estas aves
pueden estar abrigadas y así conservar mejor su energía.

#### consigna

En nuestro Código tenemos la Clase aveDeInvierno,
en su metodo volar descuenta energía por cantidad de km volados no sin
antes conservar la mitad de su energía.
Por ejemplo si un  ave de invierno vuela 40 km a la energía se le descontara 
solamente 20. Recuerden que las Aves de invierno no hacen vuelos menores a 40 km
y no con menos de 40 puntos de energía.

1. Hacer que Manolita (nuestra ave de invierno) use bufanda; cuando un ave de invierno usa bufanda
puede conservar 5 puntos extras de energía.
Por ejemplo si Manolita voló 40 km a la Energia se le
descontara solamente 25. 

2. Crear a Fabricia que es otra ave de invierno, y hacer que use campera, 
cuando un ave de invierno usa campera conserva 10 puntos extra de energia.
Por ejemplo si Fabricia voló 40 km a la energía se le descontaran solamente
10 km. 

3. Hacer que Manolita ademas de usar bufanda, use campera, ahora si Manolita vuela 
por ejemplo 40 km solamente debería descontarse 5 a la energía. Impresionante no ?
((40/2) - 5 -10).

"No vale usar booleanos para saber si las aves tienen bufanda o campera"


## 3 - OTA: Online travel agency

Una agencia de turismo online esta desarrollando su nuevo sistema de reservas y cuanta con 3 proveedores de vuelos de los mas conocidos en el mercado:

* Sabre
* Amadeus
* Worldspan

Se entregan  ya implementadas las clases que se conectan con estos servicios, ustedes pueden modificarlas para agregarles mas disponibilidad de vuelos o corregir cualquier bug que se encuentre.

La clase Ota es la que modela el comportamiento de la agencia que busca o reserva vuelos. Ya se encuentran definidos estos métodos con sus tests correspondientes.

Ota decide utilizar equitativamente los 3 proveedores, para esto se cuenta con la clase DistribuidorDeTrafico, ya implementada, que nos dice el código de proveedor a utilizar.

Se solicita:

* implementar la Clase OTA para q utilice los 3 proveedores (y cualquier otro que pudiese aparecer)
* se puede modificar o cambiar cualquiera de las clases provistas salvo la signatura de los métodos de las clases Amadeus, Sabre y Worldspan.


## 3 - Pumper Nic

### Hamburguesas

Una nueva cadena de hamburguesas, `Pumper Nic`, esta desarrollando su software de facturación  para los distintos tipos de hamburguesas que manejan.

Las hamburguesas base vienen con un medallón y acompañadas de lechuga y tomate.

Tienen los siguientes precios:

* Hamburguesas de carne: $ 200
* Hamburguesas de Pollo: $ 150
* Hamburguesas de Lentejas: $ 220

Todas las hamburguesas se pueden pedir con mas de un medallón, es decir, pueden venir con 2, 3 y hasta 4 medallones del mismo tipo. El precio q se agrega por cada medallón es de $ 50.

Hay otros extras que se le pueden agregar a las hamburguesas:

* Queso Azul: $ 20
* Bacon: $ 50
* Huevo: $ 10
* Mollejas: $ 80
* Cebollas caramelizadas: $ 60

Se pide diseñar el modelo de clases que permita calcular el costo final de una hamburguesa teniendo el cuenta la cantidad de medallones y los extras.



### Papas fritas

Las papas fritas viene de 3 tamaños:

* chica: $ 10
* mediana: $ 15
* grande: $ 20

Y se les pueden agregar los siguientes extras:

* cheddar: $ 30
* bacon: $ 45
* salsa barbacoa: $ 20

Al igual que las hamburguesas, se pide diseñar el modelo de clases que permita calcular el costo final de una porcion de papas teniendo en cuenta los extras.


###  Menu

Los menus consisten en comprar una hamburguesas, una porcion de papas y una gaseosa cola.
El precio del menu consiste en:

costo = precio hamburguesas + precio papas + 40 pesos por la gaseosa - descuento por menu

El descuento por cada menu es del 20% de la suma entre el precio de la hamburguesa y las papas.


## 3 - Figuras


Se solicita modelar un conjunto de figuras geométricas a las cuales se les puede preguntar su:

* `Double area()`
* `String color()`
* `Boolean esRegular()`

Todas las figuras geométricas tienen un color definido. Las figuras permiten ser pintadas y así cambia de color.

* `pintar(Color: color)`

Se considera que un figura es igual a otra si el tipo,area y color son igual.

### Figuras Básicas :

#### Circulo
Tiene como atributo `radio` de tipo `Integer`. El area se calcula:

* `area`: Pi * Radio ^ 2

y es una figura `regular`.

#### Semicirculo
Tiene los mismos atributos que circulo pero su `area` se calculan distinto:

* `area`: es la mitad de la superficie del circulo

No es una figura `regular`.

#### Triángulo
Tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* `area`: base * altura / 2

y es una figura `regular`.


#### Rectángulo
Tambien tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* `area`: base * altura

y es una figura `regular`.


### Pruebas

1. Crear un circulo de radio `10` y color `amarillo` y verificar que su area es aproximadamente `314,16`.
2. Crear un Semicirculo de radio `10` y color `verde` y verificar que su area es aproximadamente `157,08`.
3. Crear un Triangulo de base `10` y altura `20` y de color `azúl` y verificar que su area es `100`.
4. Crear un Rectangulo de base `10` y altura `20` y  color `violeta` y verificar que su area es `200`.
5. Crear otro Rectangulo de base `10` y altura `20` y  color `violeta` y verificar que es igual al creado en el punto anterior.
6. Pintar de color `verde` alguno de los rectangulos ya creado y verficiar que ya no son iguales.
7. Ordenar **programaticamente** por su area las figuras creadas de menos a mayor y verificar q la mas pequeña es el triángulo y la mas grande es el circulo.

### Figuras agujereadas

Mas allá de las figuras básicas es posible tener figuras `agujereadas`. Tienen básicamente los mismos atributos que las figuras básicas pero cambia la forma en la que se calcula el area.
El area de una figura agujereada es un tercio del area de la figura original, por ejemplo:

* Area del Rectángulo agujereado = base * altura / 3

Se solicita poder tener una figura agujereada  por cada figura básica existente.

### Extra Extra !!

#### Ordenamientos alternativos

Incorporar al diseño la posibilidad de ordenar las figuras por criterios alternativos al area. Por ejemplo, es deseable poder ordenar las figuras por los siguientes criterios:

- Por color. Siendo el orden de los colores arbitrario y definido por ustedes. Lo importante es que se respete el orden definido por uds.

- Por tipo (primero regular y luego irregular) y luego por area.

#### Validaciones

Se solicita impedir q se pueda instaciar figurar con dimensiones `inválidas`, por ejemplo, un cuadrado de altura negativa o un triangulo de base 0.
En estos casos se debe arrojar una excepción notificando de tal condición.

Realizar los tests necesarios para verificar ambos extrás.



