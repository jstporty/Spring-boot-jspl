package kr.kwangan2.jpatest;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Student;
import kr.kwangan2.jpatest.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest { 

	@Autowired
	StudentRepository repo;
	
	
	
	@Test
	public void dataPrepare() {

		for (int i = 1; i <= 100; i++) {
			Student student  = new Student();
			
			student.setAddr("여기산다 ㅋ"+i);
			student.setAge(26);
			student.setRegDate(new Date());
			student.setName("여승현"+i);
			
			repo.save(student);
		}
	}
	
	//@Test
	public void insertdata() {
	
	Student student  = new Student();
	
	student.setAddr("여기산다 ㅋ");
	student.setAge(26);
	student.setRegDate(new Date());
	student.setName("여승현");
	
	repo.save(student);
	}
	
	//@Test
	public void selectTest() {
		Student student = repo.findById(1L).get();
		System.out.println("==============검색결과");
		System.out.println(student.toString());
	}
	
	//@Test
	public void update() {
		Student student = repo.findById(1L).get();
		student.setName("여승현 ㅋ");
		
		repo.save(student);
	}
	
	//@Test
	public void deleve() {
		repo.deleteById(2L);
		
	}
	
	
	
}
