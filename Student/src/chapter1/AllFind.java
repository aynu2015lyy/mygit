package chapter1;//��ѯȫ����Ϣʵ����

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
			pw.print("��"+(i+1)+"�������ǣ�"
					+"ѧ��"+al.get(i).getId()+"--"
					+"����"+al.get(i).getName()+"--"
					+"�Ա�"+al.get(i).getSex()+"--"
					+"�༶"+al.get(i).getGrade()+"</br>"
					);
		}
		PrintWriter pw=response.getWriter();
		pw.print("<a href='/Student/Search.jsp'>������һҳ</a>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
