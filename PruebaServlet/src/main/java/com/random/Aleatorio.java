package main.java.com.random;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aleatorio")
public class Aleatorio extends HttpServlet {
	
	private static final long serialVersionUID = -7975080741211257461L;
	
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		
		String numeroAleatorio = GenerarNumeroAleatorio();
		
        request.setAttribute("numeroAleatorio", numeroAleatorio);
        
        RequestDispatcher rd=request.getRequestDispatcher("/Aleatorio.jsp");  
        rd.forward(request, response);  
 
    }
	
	public String GenerarNumeroAleatorio ()
	{
		String resultado = null;
		Random generadorAleatorio = new Random();
	    
		int randomInt = generadorAleatorio.nextInt(300);
		resultado=String.valueOf(randomInt);
		
		return resultado;

	}

}
