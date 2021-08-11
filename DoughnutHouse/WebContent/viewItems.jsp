<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.accenture.lkm.businessbean.*,java.util.*,com.accenture.lkm.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Doughnuts</h1>
<%
	DoughnutDaoImpl dao = new DoughnutDaoImpl();
	List<DoughnutBean> listBean = dao.getDonotList();
	List<String> listName = new ArrayList<>();
	for(DoughnutBean bean : listBean){
		out.println(bean.getDonutName());
		listName.add(bean.getDonutName());
	}
	session.setAttribute("list", listName);
%>
<form>
<select name="name">
<optgroup label=""></optgroup>
<option value="${list}">${list}</option>
</select>
<input type="submit"/>
</form>
</body>
</html>