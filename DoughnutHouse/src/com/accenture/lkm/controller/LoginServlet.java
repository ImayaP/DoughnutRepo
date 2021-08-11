package com.accenture.lkm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.lkm.businessbean.DoughnutBean;
import com.accenture.lkm.businessbean.LoginBean;
import com.accenture.lkm.service.DoughnutService;
import com.accenture.lkm.utility.DoughnutFactory;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DoughnutService service = DoughnutFactory.getDoughtnutService();
		LoginBean loginBean = new LoginBean();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if((userName==null || userName.length()==0 || userName=="") && (password==null || password.length()==0 || password=="")){
				out.println("Username & password is mandatory");
				request.getRequestDispatcher("login.jsp").include(request, response);
		}
		else
		{
			loginBean.setUserName(userName);
			loginBean.setPassword(password);
			boolean flag = service.validateUser(loginBean);
			if(flag) {
				HttpSession session = request.getSession();
				session.setAttribute("userSession", loginBean);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else {
				out.println("Invalid Credentials");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		}
		

	}
}
