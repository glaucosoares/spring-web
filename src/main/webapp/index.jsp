<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script language="JavaScript" src="cjajax.js"></script>
<%@ taglib uri="sotectl" prefix="ac"%>

<script type="text/javascript">
	
	function lookup(source, target, url, sql){
		$.get(url +'?id='+source.value + '&sql=' + sql , function(response){
			$('#'+target).val(response);
		});
	}
	
</script>

<title>Insert title here</title>
</head>
<body>
	
	<ac:select sql="select id, nome from tb_agenda"/>
</body>
</html>