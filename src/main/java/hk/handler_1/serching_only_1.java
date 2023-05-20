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
 * Servlet implementation class serching_only_1
 */
@WebServlet("/serching_only_1")
public class serching_only_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serching_only_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String id=request.getParameter("id");
		
		pw.print("<body style=\"background-image: url(\"../images/1111.webp\"><div <center><h1><i>Empoyee Details</i></center>");
		
		pw.print("<table border='4' width =1500px>");
		
		pw.print("<tr><th><h3><i>Employee id</i></h3></th>"
				+ "<th><h3><i>Name</i></h3></th>"
				+ "<th><h3><i>E-mail</i></h3></th>"
				+ "<th><h3><i>Phone no</i></h3></th>"
				+ "<th><h3><i>Date of Joining</i></h3></th>"
				+ "<th><h3><i>Date of Birth</i></h3></th>"
				+ "<th><h3><i>Adhar Id</i></h3></th>");
		
		List<emp_bo> on=login_dao.search(id);
		
		for(emp_bo el:on)
		{
		pw.print("<tr><td>"+el.getId()+"</td><td>"
		+el.getName()+"</td><td>"+el.getEmail()
		+"</td><td>"+el.getPhone()+"</td><td>"
		+el.getDoj()+"</td><td>"+el.getDob()
		+"</td><td>"+el.getAdhar()+"</td></tr>");
		}
		
		pw.print("</table></body>");
		
		 pw.print("<Button><a href='for_serach'>Back</a></Button>");
		   pw.print("<link rel=\"stylesheet\" href=\"CSS/insert.css\">");
		
		
	}
	
	
}
