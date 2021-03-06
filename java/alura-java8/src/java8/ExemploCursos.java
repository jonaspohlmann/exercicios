package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		/*
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()))
			.mapToInt(Curso::getAlunos)
			.forEach(System.out::println)
			.sum()
			;
		
		
		System.out.println(sum);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.map(c -> c.getNome())
			.forEach(System.out::println);
			;
		
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 1000)
			.findFirst();
		
		Curso curso = optionalCurso.orElse(null);
		
		System.out.println(curso.getNome());

		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		
		
		cursos = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
			
		
		Map<String, Integer> map = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
						c -> c.getNome(), 
						c -> c.getAlunos()));
		
		System.out.println(map);
		
		cursos.parallelStream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
						c -> c.getNome(), 
						c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
			
		
		
		Optional<Curso> cursoFirst = cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.findFirst();
		
		cursoFirst.ifPresent(c -> System.out.println(c.getNome()));
		
		OptionalDouble average = cursos.stream()
			.mapToDouble(c -> c.getAlunos())
			.average();
		
		System.out.println(average);
		
		
		
		cursos = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
			
		*/
		
	}
}