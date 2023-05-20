package hk.handler_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hk.bin.emp_bo;
import hk.dao.login_dao;

/**
 * Servlet implementation class for_serach
 */
@WebServlet("/for_serach")
public class for_serach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public for_serach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		
		
		response.setContentType("Text/Html");
		
		PrintWriter pw=response.getWriter();
		
		pw.print("<center><br><br><br><center><form action=\"serching_only_1\" method=\"Get\">"
				+ "<tr><td><label for=\"\"><h3 id=\"aa\"> "
				+ "Enter the ID of Employee :</h3></lable></td>"
				+ "<td><input type=\"text\"Name=\"id\"id="
				+ "\"bb\" placeholder=\"Enter Id Searching...\"><br>"
				+ "<td><button type=\"submit\"id=\"but\">"
				+ "Serach...</button></td></tr>"
				+ " &nbsp&nbsp&nbsp");
				
		
		 pw.print("<Button><a href='home.html'>Back</a></Button>");
		   pw.print("<link rel=\"stylesheet\" href=\"CSS/insert.css\"></center>");
		
		
		   pw.close();
		
	}

}
