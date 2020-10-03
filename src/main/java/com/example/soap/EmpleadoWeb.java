package com.example.soap;


//import javax.jws.WebServelt;
import javax.servlet.annotation.WebServlet;
import javax.xml.*;

import com.example.demo.Empleado;


@WebServlet
public interface EmpleadoWeb {

	//@WebMethod
	public String readEMployee(Empleado empleado);
		//public Employee getEmployeeByDocumento(String emp_documento);
}
