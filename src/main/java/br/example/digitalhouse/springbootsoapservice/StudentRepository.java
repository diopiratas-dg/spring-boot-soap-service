package br.example.digitalhouse.springbootsoapservice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.digitalhouse.xml.school.Student;

@Component
public class StudentRepository {
	private static final Map<String, Student> students = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Student student = new Student();
		student.setName("Diogenes");
		student.setStandard(5);
		student.setAddress("Domingues de Pontes");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Lucas");
		student.setStandard(5);
		student.setAddress("Alberto Roberto");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Leonardo");
		student.setStandard(6);
		student.setAddress("React Rota");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Pedro");
		student.setStandard(7);
		student.setAddress("Angular Noida");
		students.put(student.getName(), student);
		
		
	}

	public Student findStudent(String name) {
		Assert.notNull(name, "The Student's name must not be null");
		return students.get(name);
	}
}