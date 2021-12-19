<%@page import="model.Modelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema</title>
<link rel="stylesheet" href="bootstrap.css">
<link rel="styelsheet" href="style">
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<%
	out.print(Modelo.menu());	
	%>
	<div style="margin-top: 50px;"class="col-md-6 offset-md-3 text-center">
	
	
		<h1 style="font-size:55px;">Escola Catapimbas</h1>
	
	
	<div style="margin-top:50px;" class="card-group">
  <div class="card">
    <img class="card-img-top" src="images/imgI.jpg" alt="imagem criancas felizes">
    <div class="card-body">
      <h5 class="card-title">Área do(a) Aluno(a)</h5>
      <p class="card-text">Registro de novos(as) alunos(as).</p>
      <a href="aluno.jsp" class="btn bg-info">Vamos lá!</a>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="images/imgII.jpg" alt="imagem professor ensinando">
    <div class="card-body">
      <h5 class="card-title">Área do(a) Professor(a)</h5>
      <p class="card-text">Registro de novos(as) professores(as).</p>
      <a href="professor.jsp" class="btn bg-info">Vamos lá!</a>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="images/imgIII.jpg" alt="image de livros">
    <div class="card-body">
      <h5 class="card-title">Área da Disciplina</h5>
      <p class="card-text">Registro de novas disciplinas.</p>
       <a href="disciplina.jsp" class="btn bg-info">Vamos lá!</a>
    </div>
  </div>
</div>
	</div>	
</body>
</html>