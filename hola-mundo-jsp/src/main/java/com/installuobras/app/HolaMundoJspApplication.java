package com.installuobras.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Como ves lo que hace es agregarle el "Application" al final, esta clase
 es la mas importante, ya que aca es donde arranca Spring Boot  
 * */
/*La etiqueta "SpringBootApplication" si vas a su definicion, contiene
 * otras etiquetas como.
 * SpringBootConfiguration: Marca la clase como clase de configuracion
 * EnableAutoConfiguration: Habilita la config. automatica en el pom.xml
 * ComponentScan: Sirve para encontrar todas las clases que estan en el
 * package principal en este caso com.installuobras.app
 * */
@SpringBootApplication
public class HolaMundoJspApplication {
	/*En el archivo application.properties  se configuran las vistas, 
	 las conexiones a BD,etc. 
	 * En prefix (prefijo) le colocamos la ruta en donde estan las vistas
	 * (tu creas la carpeta WEB-INF/views) y 
	 * con suffix le decimos en que acaban las vistas*/
	public static void main(String[] args) {
		SpringApplication.run(HolaMundoJspApplication.class, args);
	}
}
