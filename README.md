# Price-management
**Price management** es un proyecto basado en **Arquitectura Hexagonal** que se encarga de obtener la tarifa
que aplica a un producto de una cadena (**Zara**) entre unas fechas determinadas.

## ?? Caracter赤sticas del proyecto
### Formateo c車digo (Google-Java-Format)

Con los siguientes comandos formateamos el c車digo fuente, otorgando legibilidad y consistencia al c車digo.
```
mvn com.coveo:fmt-maven-plugin:format
mvn com.coveo:fmt-maven-plugin:check
```

### Gesti車n de calidad (Checkstyle)

Con el siguiente comando se ejecutar芍 el proceso de an芍lisis de c車digo Checkstyle que comprobar芍 si el c車digo fuente
cumple con las reglas de codificaci車n.
```
mvn checkstyle:checkstyle
```
>**NOTA:** Por problemas de incoherencias que puedan surgir, se recomienda primero aplicar el correspondiente formateo
> de c車digo antes de ejecutar el proceso de an芍lisis de c車digo **Checkstyle**.

### Documentaci車n de la API

Para ver la documentaci車n referente a la API de una manera m芍s c車moda necesitaremos copiar el siguiente documento
[api.yaml](src/main/resources/swagger/api.yaml) en el [Swagger Editor](https://editor.swagger.io/).

### API Testing
[Colecci車n de pruebas de Postman] Ver fichero "Price Management Collection.postman_collection.json".

### PIT Mutation Testing

Para poder generar el informe de **PITest** referente al proyecto ser芍 necesario hacerlo usando el siguiente comando:
```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

Esto generar芍 una carpeta (pit-reports) dentro del target del proyecto. Dicha carpeta a su vez tendr芍 un fichero
index.html que se podr芍 abrir en el navegador y explorar el informe de testing generado.

Ver fichero PiTest-report.png
## ? ?? Ejecuci車n ?y configuraci車n

Para ejecutar la aplicaci車n bien se puede hacer accediendo a la clase PriceManagementApplication o bien ejecutando
los siguientes comandos.

### Instalaci車n del artefacto en local.
```
mvn clean install
```

### Empaquetado el proyecto
```
mvn clean package
```

### Ejecuci車n del proyecto
```
mvn spring-boot:run
```

### Ejecuci車n del proyecto exceptuando tests
```
mvn clean package -DskipTests
```

### Ejecuci車n de tests
```
mvn test
```

###  Base de datos en memoria h2

La ejecuci車n de la API habilitar芍 una base de datos en memoria que se puede encontrar en
http://localhost:8080/h2-console.

`JDBC URL:`jdbc:h2:mem:pricesdb

`Username:` sa

`Password:`


