/**
 * 
 */
package com.example.demo.negocio;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.datos.ConsultaDatos;
import com.example.demo.datos.IConsultaDatos;



/**
 * @author rodri
 *
 */

@Component
public class Negocio implements INegocio {
	@Autowired
	IConsultaDatos cd;
	
	@Override
	public Integer numeroCoches(String nombre) throws IOException {
		int numCoches = 0;
		//IConsultaDatos cd = new ConsultaDatos();
		ArrayList <String> listaNombres = new ArrayList <String> (cd.consultaCoches(nombre));
		for(int i = 0; i < listaNombres.size();i++) {
			if(listaNombres.get(i).equals(nombre)) {
				numCoches++;
			}
		}
		return numCoches;	
	}
}
