package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.memberDao;

public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		HttpSession session=request.getSession();
		
		if(memberDao.queryUser(Username, Password)!=0)
		{
			
			session.setAttribute("U", Username);
			response.sendRedirect("porder/loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("loginError.jsp");
		}
		
	}

}
