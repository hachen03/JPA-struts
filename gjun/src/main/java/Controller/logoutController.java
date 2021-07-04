package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public logoutController() {
        super();
    }

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                 HttpSession session=req.getSession();
                 session.removeAttribute("U");
                 resp.sendRedirect("index.jsp");
	}

}
