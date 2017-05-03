package com.javaweb.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javaweb.model.ProfessorModel;


@Path("/professores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresFacade {
	static List<ProfessorModel> listaProfessores = new ArrayList<ProfessorModel>();
	static{
		listaProfessores.add(new ProfessorModel(1,"Paulo J. Cagol", "cagoljose@gmail.com", "46 999999999"));
	}
	@GET
	public List<ProfessorModel> getProfessores(){
		return listaProfessores;
	}
}
