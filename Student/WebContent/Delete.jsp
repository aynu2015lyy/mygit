<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Student/dee" method="post">				
												<table border="0" align="center" cellpadding="2" cellspacing="0">
													<tr align="center">
														<td height="30" colspan="2" style="border-bottom: 1px dotted #cccccc">
															<strong style="font-size: 14px;">按学号删除信息</strong>
														</td>
													</tr>
													<tr>
														<td height="30" nowrap>
															<font color="000F60"><strong>学号：</strong> </font>
														</td>
														<td>
															<input type="text" name="id"  style="width: 160px;"/>
														</td>
													</tr>																														
													<tr>
														<td height="30">
														</td>
														<td>
                                                             <input type="submit" value="提交">
														</td>
													</tr>
													<tr>
														<td height="30" nowrap>
															  <a href='/Student/Operation.jsp'>返回上一页</a>
														</td>											
													</tr>	
													<tr>
														<td height="30" nowrap>
															  <a href='/Student/login.jsp'>退出登录</a>
														</td>
													</tr>												
												</table>											
											</form>
</body>
</html>