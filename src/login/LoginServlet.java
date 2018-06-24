package login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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

		request.setCharacterEncoding("UTF-8");
		String staffID=request.getParameter("StaffID");
		String password=request.getParameter("Password");
		String staffName = null;
		List<LoginBean> loginList = new ArrayList<LoginBean>();

		if(staffID.isEmpty() || password.isEmpty()){
			request.setAttribute("error", "IDまたはパスワードが入力されていません");
			RequestDispatcher disp = request.getRequestDispatcher("/jsp/login.jsp");
			disp.forward(request,response);
		}else {

			LoginDB login = new LoginDB();
			try {
				loginList = login.selectUser(staffID,password);


				if(loginList != null) {
					request.setAttribute("StaffID",staffID);
					request.setAttribute("Password", password);
					request.setAttribute("StaffName",staffName);
					RequestDispatcher disp = request.getRequestDispatcher("/jsp/menu.jsp");
					disp.forward(request,response);
				}else {
					request.setAttribute("error", "IDまたはパスワードが違います");
					RequestDispatcher disp = request.getRequestDispatcher("/jsp/login.jsp");
					disp.forward(request,response);
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}

	}

}
