package kr.kwangan2.jpatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.kwangan2.jpatest.entity.Student;
import kr.kwangan2.jpatest.repository.StudentRepository;
import lombok.Setter;

public class Studentabstractservice implements StudentService {

	@Setter(onMethod_ = @Autowired)
	private StudentRepository ropo;

	@Override
	public List<Student> selectALL() {
		return null;
	}
//	
//	public String deleteStudent() {
//		return null;
//	};
}
