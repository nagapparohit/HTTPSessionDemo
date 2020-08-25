

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		HttpSession session = request.getSession(false);
		String userid = null;
		if(session == null) {
			out.println("<h1>No user id was found in this session</h1><br>");
			System.out.println("The session is null");
		}else {
			userid = (String) session.getAttribute("userid");
			System.out.println("The session is not null");
			out.println("<h1>user id obtained from session is "+userid+"</h1>");
		}
		
		/*
		 * System.out.println("The session is : "+session.toString()); 
		 * if(session !=
		 * null) { userid = (String) session.getAttribute("userid"); }
		 */
		/*
		 * if(userid==null){
		 * out.println("<h1>No user id was found in this session</h1><br>"); }else {
		 * out.println("<h1>user id obtained from session is "+userid+"</h1>"); }
		 */
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
