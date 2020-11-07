# Disponibilidad y Desempeño

# Pre-requisitos
  - Cuenta en AWS.
  -Apache Maven.

# Tutorial
 - Copiaremos la aplicación en nuestra maquina local con el siguiente comando
```sh
$ git clone https://github.com/jose-gome/AREP-Calculadora-estadistica.git
 ```
 - Ahora compilaremos y empaquetaremos con el siguiente comando
```sh
$ mvn package 
```
 - Seguiremos con crear una nueva intacia en aws para esto eligiremos la primera instacia que nos aparece:
![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso1.png)
 - Creamos una nueva imagen la cual utilizaremos en el futuro:
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso2.png)
 - Lenaremos lo campos del nombre y si deseamos una descripcion:
  ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso3.png)
 - Nos dirigimos a crear una nueva plantilla de lanzamiento:
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso5.png)
 - Llenamos lo datos que se muestra a continuacion:
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso6.png)
 - Elegimos la imagen ya creada y elgimos el tipo que sea de T2.micro
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso7.png)
 - Despues Configuramos las subredes que queremos:
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso10.png)
 - Si deseamos crearemos el balanceador de carga para nuestra aplicacion
 ![](https://github.com/jose-gome/AREP-Taller8/blob/main/Source/pasoApaso11.png)
 _una vez creado terminaremos nuestro despliegue y quedara funcionando seguna la configuracion del balanceadoe de carga
# Integracion Continua
[![CircleCI](https://circleci.com/gh/jose-gome/AREP-2020-1-Calculadora-estadistica.svg?style=svg)](https://circleci.com/gh/jose-gome/AREP-2020-1-Calculadora-estadistica)
# Construido con
  - [Maven](https://maven.apache.org/) - Dependency Management
  - [SPARK](http://sparkjava.com/) Framework para desarrollar aplicaciones web
 
# Autores
  - José Luis Gómez Camacho - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito
# Licencia
Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
