<html>
<head>
	<title> JSP Page</title>
</head>
<body>
<!-Declaration tag-->
	<%!
		int a=50;
		int b=10;
		String name="ISTAR COLLEGE";
		public int doSum()
		{
			return a+b;
		}
		public String reverse()
		{
			StringBuffer br=new StringBuffer(name);
			return br.reverse.toString();
		}
	%>
//<!-Scriplet tag-->
	<%
		out.println("Value of a"+":"+a);
		out.println("<br>");
		out.println("Value of b"+":"+b);
		out.println("<br>");
		out.println("Sum of two Numbers is"+":"+doSum());
		out.println("<br>");
		out.println("Reverse of "+" "+name+" is "+reverse());
		
		<h1 style="color:red"> Sum is <%=doSum()%></h1>
		<h1><%=a%></h1>
		<h1><%=name%></h1>
	%>
</body>
</html>