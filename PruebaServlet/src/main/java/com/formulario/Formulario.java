package main.java.com.formulario;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Formulario")
public class Formulario extends HttpServlet{
	
	private static final long serialVersionUID = 8030983846978951143L;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = "";
		String apellido = "";
		String dni = "";
		
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("dni", dni);

        RequestDispatcher rd = request.getRequestDispatcher("/Formulario.jsp");  
        rd.forward(request, response);
				
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreResultado = request.getParameter("nombre");
		String apellidoResultado = request.getParameter("apellido");
		String dniResultado = request.getParameter("dni");
		
		System.out.println("Nombre: " + nombreResultado);
		System.out.println("Apellido: " + apellidoResultado);
		System.out.println("DNI: " + dniResultado);
		
		request.setAttribute("nombreResultado", nombreResultado);
        request.setAttribute("apellidoResultado", apellidoResultado);
        request.setAttribute("dniResultado", dniResultado);

        RequestDispatcher rd=request.getRequestDispatcher("/Resultado.jsp");  
        rd.forward(request, response);  
 
    }
	
}
