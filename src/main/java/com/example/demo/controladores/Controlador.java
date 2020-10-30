/**
 * 
 */
package com.example.demo.controladores;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.negocio.INegocio;

/**
 * @author 201909
 *
 */

@Controller
public class Controlador {
	@Autowired
	INegocio negocio;
	
	@RequestMapping("negocio")
	public String calculaNum(@RequestParam("nombre") String n, ModelMap model) throws IOException{
		
		Integer cochesTotal = negocio.numeroCoches(n);
		
		model.addAttribute("num", cochesTotal);
		
		return "coches";
		
	}
	
}
