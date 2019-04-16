package com.installuobras.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/*Le colocamos la notacion @Controller para indicarle que es el 
 * controlador e importamos para que no marque error*/
@Controller
public class IndexController {

	/*En lugar del GetMapping puedes usar tambien el RequestMapping
	 que sirve tanto para get como para post, pero luego tienes que
	 especificar*/
	@GetMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("titulo", "Hola Enmanuel");
		return "index";//Hacemos que retorne el nombre de la vista
	}
}
