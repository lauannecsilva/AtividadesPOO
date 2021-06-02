package main;

import java.util.ArrayList;
import modal.Estudante;
import modal.Pessoa;
import modal.Professor;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante01 = new Estudante("Paula", "Rua paulo augusto");
			estudante01.addCursoNota("Portugues", 9);
			estudante01.addCursoNota("Programação", 6);
			
			Estudante estudante02 = new Estudante("Pedro", "Av Estudante");
			estudante02.addCursoNota("Ingles", 8);
			estudante02.addCursoNota("Matematica", 9);
			estudante02.addCursoNota("Programação", 9);
			
			Estudante estudante03 = new Estudante("Julio", "Rua do sol");
			estudante03.addCursoNota("Portugues", 8);
			estudante03.addCursoNota("Matematica", 9);
			estudante03.addCursoNota("Programação", 9);
			estudante03.addCursoNota("Historia", 9);
			pessoas.add(estudante01);
			pessoas.add(estudante02);
			pessoas.add(estudante03);

			Professor  professor01 = new Professor("Maria", "Avenida Santa Elias");
			professor01.addCurso("matematica");
			professor01.addCurso("Historia");
			
			Professor professor02 = new Professor("Leticia", "Lamedas das Baraunas");
			professor02.addCurso("Programação");
			professor02.addCurso("Ingles");
			
			pessoas.add(professor01);
			pessoas.add(professor02);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						str += "Curso: "+ teacher.getCursos().get(y)+"\n";
						str += "Professor: " + teacher.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}

}
