package com.installuobras.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*Como es un proyecto war va a incluir esta clase el ServletInitializer
 el cual sirve para que se pueda desplegar en un servidor Tomcat, esta
 clase es como el Web.xml; es decir aca se configura el servletContext
 y el ContextLoaderListener*/

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HolaMundoJspApplication.class);
	}

}
