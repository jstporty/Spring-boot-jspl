package kr.kwangan2.jpatest.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import kr.kwangan2.jpatest.entity.Student;



public interface StudentRepository extends CrudRepository<Student, Long>,
QuerydslPredicateExecutor<Student>,PagingAndSortingRepository<Student, Long>
{

//	@Query("select s from Student s ")
//	public List<Student> selectALL();
//	
//	@Query("delete s from Student s where sid=?1")
//	public String deleteStudent(Long sid);
}
