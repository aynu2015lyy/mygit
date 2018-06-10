package chapter1;//查询全部信息实现类

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AllFind extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		UserDao ud=new UserDao();
        ArrayList<User> al=ud.findALL();
		
		for(int i=0;i<al.size();i++){
			PrintWriter pw=response.getWriter();
			pw.print("第"+(i+1)+"的数据是："
					+"学号"+al.get(i).getId()+"--"
					+"姓名"+al.get(i).getName()+"--"
					+"性别"+al.get(i).getSex()+"--"
					+"班级"+al.get(i).getGrade()+"</br>"
					);
		}
		PrintWriter pw=response.getWriter();
		pw.print("<a href='/Student/Search.jsp'>返回上一页</a>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
