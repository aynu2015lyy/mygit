package chapter1;//ʵ�������Ϣ����

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Mains extends HttpServlet {
	


	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		UserDao ud=new UserDao();
		User user=new User();
		String id=new String(request.getParameter("id"));
		String name=new String(request.getParameter("name"));
		String sex=new String(request.getParameter("sex"));
		String grade=new String(request.getParameter("grade"));
		
		user.setId(id);
		user.setName(name);
		user.setSex(sex);
		user.setGrade(grade);
		
		boolean b=ud.insert(user);
		if(b){
			PrintWriter pw=response.getWriter();
			pw.print("��ӳɹ���"+"</br>"+"<a href='/Student/Add.jsp'>���������Ϣ</a>"+"</br>"
			
			+"<a href='/Student/Operation.jsp'>������ҳ��</a>");
		}else{
			PrintWriter pw=response.getWriter();
			pw.print("���ʧ�ܣ�"+"</br>"+"<a href='/Student/Add.jsp'>���������Ϣ</a>"+"</br>"
			
			+"<a href='/Student/Operation.jsp'>������ҳ��</a>");
		}	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
