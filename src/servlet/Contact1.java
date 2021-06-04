package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ContactBean;

/**
 * Servlet implementation class Contact1
 */
@WebServlet("/contact-1")
public class Contact1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String campany = request.getParameter("campany");
		String mail = request.getParameter("mail");
		String contents = request.getParameter("contents");
		String[] magazine = request.getParameterValues("magazine");
		String document = request.getParameter("document");
		
		if(name.equals("") || mail.equals("")||contents.equals("")) {
			url = "contact.jsp";
			request.setAttribute("message", "*は必須項目です。");
		}else {
			HttpSession session =request.getSession();
			
			ContactBean c =new ContactBean();
			c.setName(name);
			c.setCampany(campany);
			c.setMail(mail);
			c.setContents(contents);
			c.setMagazine(magazine);
			c.setDocument(document);
			
			session.setAttribute("c", c);
			
			url="contact-check.jsp";
			
		
	}
		
		
		RequestDispatcher rd =request.getRequestDispatcher(url);
		rd.forward(request, response);

}



	}

