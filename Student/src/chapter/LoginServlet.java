package chapter;
//设置账号密码的界面

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		//用户名为“lyy”,密码为：111
		if(("lyy").equals(username)&&("111").equals(password)){
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/Student/Operation.jsp");
		}else{
			pw.write("用户名密码错误，登录失败");
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
