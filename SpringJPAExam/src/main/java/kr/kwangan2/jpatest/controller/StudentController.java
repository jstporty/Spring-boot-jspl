package kr.kwangan2.jpatest.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kwangan2.jpatest.entity.Student;
import kr.kwangan2.jpatest.repository.StudentRepository;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/")
@Log4j
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@GetMapping("list")
	public String selectAll(Model model) {

		model.addAttribute("studentList", repo.findAll(Sort.by(Sort.Direction.DESC, "sid")));
		return "list";
	}

//	@GetMapping
//	public String deleteStudent(Model model) {
//
//		model.addAttribute("delete", repo.deleteStudent(1L));
//		return "redirect:list";
//	}

	@RequestMapping("insertForm")
	public String insertStudent() {

		return "insertForm";
	}

	@RequestMapping("insert")
	public String insertproc(Student student) {

		repo.save(student);

		return "redirect:/list";
	}

	@RequestMapping("insertup")
	public String insertup(Model model, Long sid) {

		Student student = repo.findById(sid).get();

		model.addAttribute("student", student);

		return "insertForm";
	}

	@RequestMapping("update")
	public String update(Student student) {

		Student student1 = repo.findById(student.getSid()).get();

		student1.setSid(student.getSid());
		student1.setName(student.getName());
		student1.setAge(student.getAge());
		student1.setAddr(student.getAddr());
		student1.setRegDate(new Date());

		repo.save(student);

		return "redirect:/list";
	}

	@RequestMapping("delete")
	public String delete(Student student) {

		repo.deleteById(student.getSid());

		return "redirect:list";
	}

}
