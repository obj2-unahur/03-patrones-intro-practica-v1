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



