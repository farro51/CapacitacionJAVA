package co.com.bancolombia.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.bancolombia.modelo.Producto;

public class ManualServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*resp.getWriter().append("<html>");
		resp.getWriter().append("<head>");
		resp.getWriter().append("<title>Servlet Manual</title>");
		resp.getWriter().append("</head>");
		resp.getWriter().append("<body>");
		resp.getWriter().append("<p>La fecha actual es: " + new Date() + "</p>");
		resp.getWriter().append("</body>");
		resp.getWriter().append("</html>");*/

		Producto p = new Producto("123456", "La era del hielo 2", 35000, new Date(), true);
		req.setAttribute("titulo", "La era del hielo");
		req.setAttribute("producto", p);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	

}
