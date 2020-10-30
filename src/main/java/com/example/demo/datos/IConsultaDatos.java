package com.example.demo.datos;

import java.io.IOException;
import java.util.ArrayList;

public interface IConsultaDatos {

	ArrayList<String> consultaCoches(String nombre) throws IOException;

}