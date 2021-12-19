package model;

import java.util.ArrayList;

public class Modelo {
	
public static ArrayList<Aluno> a = new ArrayList<Aluno>();
public static ArrayList<Professor> p = new ArrayList<Professor>();
public static ArrayList<Disciplina> d = new ArrayList<Disciplina>();
	
	public static String getAlunos(){
		String lista="<table class=\"table\"><thead class=\"thead-dark\"><th scope=\"col\">NOME</th><th scope=\"col\">CPF</th><th scope=\\\"col\\\">Turma</th></thead><tbody>";
		for(int i=0;i<a.size();i++){
			lista+="<tr><td>"+a.get(i).getNome()+"</td> "+"<td>"+a.get(i).getCpf()+"</td>"+"<td>"+ a.get(i).getTurma()+ "</td></tr>";
		}
		lista+="</tbody></table>";
		return lista;
	}
	
	public static String getDisciplina(){
		String lista="<table class=\"table\"><thead class=\"thead-dark\"><th scope=\"col\">NOME</th><th scope=\"col\">Inicio</th><th scope=\\\"col\\\">Fim</th></thead><tbody>";
		for(int i=0;i<d.size();i++){
			lista+="<tr><td>"+d.get(i).getNome()+"</td> "+"<td>"+d.get(i).getInicio()+"</td>"+"<td>"+ d.get(i).getFim()+ "</td></tr>";
		}
		lista+="</tbody></table>";
		return lista;
	}
	
	public static String getProfessores(){
		String lista="<table class=\"table\"><thead class=\"thead-dark\"><th scope=\"col\">NOME</th><th scope=\"col\">CPF</th><th scope=\\\"col\\\">Formação</th></thead><tbody>";
		for(int i=0;i<p.size();i++){
			lista+="<tr><td>"+p.get(i).getNome()+"</td> "+"<td>"+p.get(i).getCpf()+"</td>"+"<td>"+ p.get(i).getFormacao()+ "</td></tr>" ;
		}
		lista+="</tbody></table>";
		return lista;
	}
	
   public static String menu() {
	  return "<nav class='navbar navbar-expand-lg navbar-light bg-info'>\r\n" + 
		   		"		\r\n" + 
		   		"		<button class='navbar-toggler' type='button' data-toggle='collapse'\r\n" + 
		   		"			data-target='#navbarSupportedContent'\r\n" + 
		   		"			aria-controls='navbarSupportedContent' aria-expanded='false'\r\n" + 
		   		"			aria-label='Toggle navigation'>\r\n" + 
		   		"			<span class='navbar-toggler-icon'></span>\r\n" + 
		   		"		</button>\r\n" + 
		   		"\r\n" + 
		   		"		<div class='collapse navbar-collapse' id='navbarSupportedContent'>\r\n" + 
		   		"			<ul class='navbar-nav mr-auto'>\r\n" + 
		   		"				\r\n" + 
		   		"				\r\n" + 
		   		"				<li class='nav-item dropdown'><a\r\n" + 
		   		"					class='nav-link dropdown-toggle' href='#' id='navbarDropdown'\r\n" + 
		   		"					role='button' data-toggle='dropdown' aria-haspopup='true'\r\n" + 
		   		"					aria-expanded='false'> Menu </a>\r\n" + 
		   		"					<div class='bg-info dropdown-menu' aria-labelledby='navbarDropdown'>\r\n" + 
		   		"						<a class='dropdown-item' href='index.jsp'>Início</a>\r\n" +
		   		"						<div class='dropdown-divider'></div> \r\n" + 
		   		"						<a class='dropdown-item' href='aluno.jsp'>Registrar Aluno</a>\r\n" + 
		   		"						<div class='dropdown-divider'></div> \r\n" + 
		   		"						<a class='dropdown-item' href='professor.jsp'>Registrar Professor</a>\r\n" + 
		   		"						<div class='dropdown-divider'></div>\r\n" + 
		   		"						<a class='dropdown-item' href='disciplina.jsp'>Registrar Disciplina</a>\r\n" +
		   		"						<div class='dropdown-divider'></div>\r\n" + 
		   		"						<a class='dropdown-item' href='consultar.jsp'>Consulta Professor</a>\r\n" + 
		   		"						<div class='dropdown-divider'></div>\r\n" + 
		   		"						<a class='dropdown-item' href='matricula.jsp'>Conferir Matricula</a>\r\n" + 
		   		"					</div></li>\r\n" + 
		   		"				\r\n" + 
		   		"			</ul>\r\n" + 
		   		"			\r\n" + 
		   		"		</div>\r\n" + 
		   		"	</nav>";
	   
   }
}
