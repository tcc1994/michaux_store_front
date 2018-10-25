<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../jquery-3.2.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
sss
</body>
<script>
            $.ajax({
                type:"POST",
                url:"http://192.168.211.57:8087/role/aa?phone=15811006652",
                dataType:"text",
                success:function(res){
                    alert(res+"777");
                },
                error:function(data){
                    alert(data+"888");
                }
            })
        </script>
</html>