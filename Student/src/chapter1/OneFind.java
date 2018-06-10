package chapter1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OneFind extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		UserDao ud=new UserDao();
		String id=request.getParameter("id");
		User user=ud.find(id);
		if(id!=null){
			
			PrintWriter pw=response.getWriter();
			pw.print("这"+id+"ID的数据是："
					+"姓名"+user.getName()+"--"
					+"性别"+user.getSex()+"--"
					+"班级"+user.getGrade()
					+"</br>"
					+"<a href='/Student/onefind.jsp'>返回上一页</a>"
					+"</br>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
