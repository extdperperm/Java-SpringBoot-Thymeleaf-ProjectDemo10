######################################################################################################################
#                                                                                                                    #
#                                          TSpringBootProjectDemo10                                                  #
#                                                                                                                    #
#                                         Autor: Daniel Pérez Pérez                                                  #
#                                            Fecha: 27/11/2023                                                       #
######################################################################################################################
----------------------------------------------------------------------------------------------------------------------
DESCRIPCIÓN
----------------------------------------------------------------------------------------------------------------------
Ejemplo de implementación de un ORM tipo JPA-Hibernate. Mapeo de modelo con tablas en base de datos.

----------------------------------------------------------------------------------------------------------------------
ESPECIFICACIÓN TÉCNICA DE DESARROLLO UTILIZADO
----------------------------------------------------------------------------------------------------------------------
Entorno de Desarrollo: Spring Boot Suite, versión: 4
Servidor de referencia: Apache Tomcat, versión: 10
Jdk: OpenJdk, versión: 17.1
Gestor de proyecto: Maven, versión: 4.0

----------------------------------------------------------------------------------------------------------------------
DEPENDENCIAS
----------------------------------------------------------------------------------------------------------------------
Spring Boot Framework: versión 3.1.0 
       - spring-boot-starter-web
       - spring-boot-starter-tomcat
       - spring-boot-starter-test
       - spring-boot-starter-data-jpa
       - mysql-connector-j
              
----------------------------------------------------------------------------------------------------------------------
RECOMENDACIÓN PARA ABRIR EL PROYECTO EN EL IDE: Spring Boot Suite
----------------------------------------------------------------------------------------------------------------------
0º. Importe en su base de datos MySql el script data-stockdb.sql que creará la base de datos de pruebas de esta demo.
1º. Copie el directorio TSpringBootProjectDemo10 en el directorio de su espacio de trabajo.
2º. Desde el IDE (Spring Boot Suite), importe el proyecto haciendo click en File -> Open Projects from File System 
3º. En Import source, haciendo click en el botón "Directory..." seleccione la carpeta que contiene el proyecto.
4º. Haga click en Finish
5º. Se recomienda realizar un Maven Update (Click derecho sobre el proyecto Maven -> Update Project...)
6º. Recompilar (salvo que tenga activado compilación automática).
7º. Ejecutar, por ejemplo haciendo click derecho sobre el proyecto -> Run As -> Java Application
