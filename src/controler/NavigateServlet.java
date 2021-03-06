package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.Info;

@WebServlet("/navigate")
public class NavigateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String toNavigateTo = request.getParameter("active_page");
		request.getSession().setAttribute(Info.CURRENT_PAGE_LABEL, toNavigateTo);
		response.sendRedirect("/gagmock");
	}

}
