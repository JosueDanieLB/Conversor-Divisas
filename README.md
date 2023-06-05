<h1 align="center"> Conversor de divisas con API integrada </h1>

Este es un proyecto para el challenge "Conversor de divisas" de Alura One, el cual fue construido usando Spring Boot. Para este proyecto se tomó como funcionalidad base lo solicitado en las condiciones del mismo, el cual consiste básicamente en un sistema para convertir distintas divisas tomando como base el peso mexicano. Para este proyecto se utilizaron las siguientes divisas:
* Dolar estadounidense
* Euro
* Libra esterlina
* Yen japonés
* Won sur coreano

Además, se utilizó la funcionalidad de conversor de temperaturas proprocionadas por el equipo de Alura One, el cual consiste en un sistema para convertir entre si distintos sistemas de temperatura, los cuales son:
* Celsius
* Fahrenheit
* Kelvin

Con el fin de entregar un proyecto un poco más elaborado, se añadieron algunas funciones adicionales, las cuales se enlistan a continuación:

## :hammer:Funcionalidades adicionales

- `API`: Se integró la API de OpenExchange para que el usuario del sistema tenga los valores mas actualizados de las divisas al momento de la conversión.
- `Se añadió la conversión de temperatura entre Fahrenheit y Kelvin`: En el proyecto original no estaba considerada la conversión entre grados Fahrenheit y Kelvin, por lo que para esta versión se añadió dicha conversión.
- `Conversiones formuladas`: Las conversiones de temperatura se hacen utilizando fórmulas precisas, a diferencia del proyecto original que no tenía consideradas algunas fórmulas dentro del esquema de conversión de algunos sistemas de temperatura.
- `Corrección de errores`: El sistema de conversión de temperatura tenía algunos errores, principalmente al convertir Kelvin a Celsius, ya que el código llamaba algunos métodos que se repetían, por lo que el resultado no era el esperado, además de que proporcionada respuestas no solicitadas.

<h4 align="center">:construction: Proyecto en mejora :construction:</h4>

Dentro de las mejoras que se van a realizar al proyecto se encuentran:
* Herramienta para que el usuario escriba las divisas con las que quiere hacer las conversiones, independientemente de que no estén contempladas en el listado de conversión.
* Mejora de la interfaz visual, para hacerla más dinámica.
* Implementar base de datos para almacenar el histórico de consultas del usuario, así como para tener un historial del valor de las divisas a lo largo del tiempo.
* Añadir gráficas de información histórica.
