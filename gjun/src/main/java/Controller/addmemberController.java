package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;

public class addmemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addmemberController() {
        super();
        
    }

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                  String Username=req.getParameter("username");
                  if(memberDao.queryUser(Username)!=0)
                  {
                	  resp.sendRedirect("addmemberError.jsp");
                  }
                  else
                  {
                	  String Name=req.getParameter("name");
                	  String Password=req.getParameter("password");
                	  member m=new member(Name,Username,Password);
                	  new memberDao().add(m);
                	  resp.sendRedirect("addmemberSuccess.jsp");
                  }
	}

}
