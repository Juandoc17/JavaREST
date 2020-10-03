package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class maincontroller {
	
	public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
            return null;
        }
        return fechaDate;
    }
	
	
	@GetMapping
	public Empleado getEmpleado(@RequestParam (value="nombre") String NombreUrl,@RequestParam (value="apellido") String ApellidoUrl,
								@RequestParam (value="tipodedocumento") String TipoDeDocumentoUrl, @RequestParam (value="numerodedocuemnto") String NumeroDeDocumentoUrl,
								@RequestParam(value="fechadenacimiento") String FechaDeNacimientoUrl, @RequestParam (value="fechadevinculacion") String FechaDeVinculacionUrl,
								@RequestParam (value="cargo") String cargoUrl, @RequestParam(value="salario") Double SalarioUrl
								) {
		
		Empleado empleado = null;

		
		Date nacimiento=ParseFecha(FechaDeNacimientoUrl);
		Date vinculacion=ParseFecha(FechaDeVinculacionUrl);
		String trabajoactual = null;
		String edadactual = null;
		Period edad = null;
		
		if(nacimiento!=null && vinculacion!=null) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNac = LocalDate.parse(FechaDeNacimientoUrl, fmt);
			LocalDate fechaVinc = LocalDate.parse(FechaDeVinculacionUrl, fmt);
			LocalDate ahora = LocalDate.now();
			edad = Period.between(fechaNac, ahora);
			Period trabajando = Period.between(fechaVinc, ahora);
			trabajoactual = trabajando.getYears() + " años " + trabajando.getMonths() + " meses y " + trabajando.getDays()+ " días";
			edadactual = edad.getYears() + " años " + edad.getMonths() + " meses y " + edad.getDays()+ " días";
		}
	
			if(edadactual!=null && trabajoactual!=null && edad!=null) {
				if(edad.getYears()>=18) {
				if(NombreUrl.length()>0 && ApellidoUrl.length()>0 && TipoDeDocumentoUrl.length()>0 && NumeroDeDocumentoUrl.length()>0 && cargoUrl.length()>0 && SalarioUrl !=null) {
					empleado= new Empleado(NombreUrl,ApellidoUrl,TipoDeDocumentoUrl, NumeroDeDocumentoUrl, nacimiento, vinculacion, cargoUrl, SalarioUrl,trabajoactual,edadactual );
					System.out.println("EMpleado creado exitosamente!\n" + empleado.toString());
				}else {
					System.out.println("Faltan datos!");
				}
			}else {
				System.out.println("Eres menor de edad, tienes: " + edad.getYears());
			}
		}else {
			System.out.println("Error en el formato de las fechas, debe ser dd/MM/yyyy");
		}
		
		return(empleado);
	}
}
