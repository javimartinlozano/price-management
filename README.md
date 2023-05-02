# Price-management
**Price management** es un proyecto basado en **Arquitectura Hexagonal** que se encarga de obtener la tarifa
que aplica a un producto de una cadena (**Zara**) entre unas fechas determinadas.

## ?? Caracter��sticas del proyecto
### Formateo c��digo (Google-Java-Format)

Con los siguientes comandos formateamos el c��digo fuente, otorgando legibilidad y consistencia al c��digo.
```
mvn com.coveo:fmt-maven-plugin:format
mvn com.coveo:fmt-maven-plugin:check
```

### Gesti��n de calidad (Checkstyle)

Con el siguiente comando se ejecutar�� el proceso de an��lisis de c��digo Checkstyle que comprobar�� si el c��digo fuente
cumple con las reglas de codificaci��n.
```
mvn checkstyle:checkstyle
```
>**NOTA:** Por problemas de incoherencias que puedan surgir, se recomienda primero aplicar el correspondiente formateo
> de c��digo antes de ejecutar el proceso de an��lisis de c��digo **Checkstyle**.

### Documentaci��n de la API

Para ver la documentaci��n referente a la API de una manera m��s c��moda necesitaremos copiar el siguiente documento
[api.yaml](src/main/resources/swagger/api.yaml) en el [Swagger Editor](https://editor.swagger.io/).

### API Testing
[Colecci��n de pruebas de Postman] Ver fichero "Price Management Collection.postman_collection.json".

### PIT Mutation Testing

Para poder generar el informe de **PITest** referente al proyecto ser�� necesario hacerlo usando el siguiente comando:
```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

Esto generar�� una carpeta (pit-reports) dentro del target del proyecto. Dicha carpeta a su vez tendr�� un fichero
index.html que se podr�� abrir en el navegador y explorar el informe de testing generado.

Ver fichero PiTest-report.png
## ? ?? Ejecuci��n ?y configuraci��n

Para ejecutar la aplicaci��n bien se puede hacer accediendo a la clase PriceManagementApplication o bien ejecutando
los siguientes comandos.

### Instalaci��n del artefacto en local.
```
mvn clean install
```

### Empaquetado el proyecto
```
mvn clean package
```

### Ejecuci��n del proyecto
```
mvn spring-boot:run
```

### Ejecuci��n del proyecto exceptuando tests
```
mvn clean package -DskipTests
```

### Ejecuci��n de tests
```
mvn test
```

###  Base de datos en memoria h2

La ejecuci��n de la API habilitar�� una base de datos en memoria que se puede encontrar en
http://localhost:8080/h2-console.

`JDBC URL:`jdbc:h2:mem:pricesdb

`Username:` sa

`Password:`


