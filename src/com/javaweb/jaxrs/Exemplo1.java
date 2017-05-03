package com.javaweb.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/*
 * Estudando requisições.
 * REST.
 * PATH (Caminho URL).
 * Métodos GET.
 */

//Util >> CTRL + SHIFT + O ~ Importa bibliotécas.


@Path("/exemplowsrs")
public class Exemplo1 {
	
	
	//Quando chamar pelo método GET irá executar o método exibir.
	@GET
	public String executaGET(){
		return "Chamou pelo metodo GET";
	}
	
	@POST
	public String executaPOST(){
		return "Chamou pelo metodo POST";
	}
	
}
