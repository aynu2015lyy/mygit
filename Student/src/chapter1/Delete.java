package chapter1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Delete extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		UserDao ud=new UserDao();
		String id=request.getParameter("id");
		if(id!=null){
			ud.delete(id);
			PrintWriter pw=response.getWriter();
			pw.print("删除成功！"+"</br>"
					+"<a href='/Student/Delete.jsp'>返回上一页</a>"
					+"</br>");
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
