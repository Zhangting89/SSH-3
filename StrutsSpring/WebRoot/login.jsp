<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>��¼����</title></head>
  <body>
  
  <script type="text/javascript">
	function register(){
		var form = document.forms[0];
		form.action = "registerAction"
		form.submit();
	}
  </script>
  
    <form method="post" action="loginAction">
       �û�����<input name="username"><br>
       ��    �룺<input type="password" name="userpass"><br>
      <input type="submit" name="button" id="button" value="�� ��">
      <input type="submit" name="button2" id="button2" value="ע ��" onclick=register();>
      <input type="reset"  name="password" name="password" value="ȡ ��">
    </form>
    
  </body>
</html>