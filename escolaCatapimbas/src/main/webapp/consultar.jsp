<%@page import="model.Modelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consultar Professores(a)</title>
<link rel="stylesheet" href="bootstrap.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>
<body>
    <% out.print(Modelo.menu()); %>
<div class="row">
	<div class="form-group">
		<div class="col-md-6 offset-md-3">
    
    <form style="margin-top:50px"action="#" method="POST">
        <input placeholder="Digite o CPF do(a) professor(a)" class="form-control" name="n" type="text" required>
        <div class="text-center col ">
        	<button class="btn btn-default"type="submit">Buscar</button>
        </div>
    </form>
    <% 
     if(request.getParameter("n")!=null){
    	%>
    	<table>
    	  <thead>
    	     <th>NOME</th><th>CPF</th><th>Formação</th>
    	  </thead>  
    	  <tbody> 
    	<%  
    	  for(int i=0;i<Modelo.p.size();i++){
    		  String palavra = request.getParameter("n");    		  
    		 if(Modelo.p.get(i).getCpf().equals(palavra)){
    			 %> 
    			 <tr>
    			  <td><%=Modelo.p.get(i).getNome() %></td>
    			  <td><%=Modelo.p.get(i).getCpf()%> </td>
    			  <td><%=Modelo.p.get(i).getFormacao()%> </td>
    			  </tr>
    		  <%	  
    		}
    	  }
    	%>
    	  </tbody>
    	 </table> 
    	<%
    }
    %>
    		</div>
    	</div>
    </div>
</body>
</html>