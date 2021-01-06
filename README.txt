READ ME 

- Para el desarrollo de la tarea se utilizo java 11.0.9
- Se utilizo el hint acerca de las subsecuencias más largas y se investigo al respecto,
  con esto pudimos resolver el problema en tiempo O(Nlog(N)). El algoritmo funciona
  buscando el tamaño de la subsecuencia más larga, notamos que para entregar el resultado
  pedido necesitamos restar el tamaño del arreglo original - el tamaño de la subsequencia
  más larga, esto ocurre siempre dado que solo los elementos que no pertenecen a la subsec.
  son aquellos que deben ser movidos.


MAKE FILE

- Para compilar y ejecutar, escriba por consola "make all" y está listo para ingresar el input inmediatamente.
- Para eliminar los .class escriba en consola "make clean".
