package kr.kwangan2.jpatest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Student;
import kr.kwangan2.jpatest.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class making {

	@Autowired
	StudentRepository repo;

//	@Test
//	public void selectAll() {
//
//		List<Student> studentList = repo.selectALL();
//
//		System.out.println("검색 결과");
//		for (Student student : studentList) {
//			System.out.println("====>" + student.toString());
//
//		}
//	}
}
