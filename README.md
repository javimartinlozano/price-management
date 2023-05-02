# Price-management
**Price management** es un proyecto basado en **Arquitectura Hexagonal** que se encarga de obtener la tarifa
que aplica a un producto de una cadena (**Zara**) entre unas fechas determinadas.

## ?? Caracteristicas del proyecto
### Formateo codigo (Google-Java-Format)

Con los siguientes comandos formateamos el codigo fuente, otorgando legibilidad y consistencia al codigo.
```
mvn com.coveo:fmt-maven-plugin:format
mvn com.coveo:fmt-maven-plugin:check
```

### Gestion de calidad (Checkstyle)

Con el siguiente comando se ejecutara el proceso de analisis de codigo Checkstyle que comprobara si el codigo fuente
cumple con las reglas de codificacion.
```
mvn checkstyle:checkstyle
```
>**NOTA:** Por problemas de incoherencias que puedan surgir, se recomienda primero aplicar el correspondiente formateo
> de codigo antes de ejecutar el proceso de analisis de codigo **Checkstyle**. 

### Documentacion de la API

Para ver la documentacion referente a la API de una manera mas comoda necesitaremos copiar el siguiente documento
[api.yaml](src/main/resources/swagger/api.yaml) en el [Swagger Editor](https://editor.swagger.io/).

### API Testing
[Coleccion de pruebas de Postman] Ver fichero "Price Management Collection.postman_collection.json".

### PIT Mutation Testing

Para poder generar el informe de **PITest** referente al proyecto sera necesario hacerlo usando el siguiente comando:
```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

Esto generara una carpeta (pit-reports) dentro del target del proyecto. Dicha carpeta a su vez tendra un fichero
index.html que se podra abrir en el navegador y explorar el informe de testing generado.

Ver fichero PiTest-report.png
## ? ?? Ejecucion ?y configuracion

Para ejecutar la aplicacion bien se puede hacer accediendo a la clase PriceManagementApplication o bien ejecutando
los siguientes comandos.

### Instalacion del artefacto en local.
```
mvn clean install
```

### Empaquetado el proyecto
```
mvn clean package
```

### Ejecucion del proyecto
```
mvn spring-boot:run
```

### Ejecucion del proyecto exceptuando tests
```
mvn clean package -DskipTests
```

### Ejecucion de tests
```
mvn test
```

###  Base de datos en memoria h2

La ejecucion de la API habilitara una base de datos en memoria que se puede encontrar en
http://localhost:8080/h2-console.

`JDBC URL:`jdbc:h2:mem:pricesdb

`Username:` sa

`Password:`


