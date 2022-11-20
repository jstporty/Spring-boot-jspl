package kr.kwangan2.jpatest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	private Long sid;
	private String name;
	private Integer age;
	private String addr;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date regDate;

}
