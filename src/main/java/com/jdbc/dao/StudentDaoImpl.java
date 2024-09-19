package com.jdbc.dao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.model.Student;
public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}

	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,email) values(?,?,?)";
		int s = this.jdbcTemplate.update(query, student.getId(),student.getName(), student.getEmail());
		return s;
	}
	
	@Override
	public Student getStudentById(int studentId) {
		String query =  "SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper = new StudentRowMapper();
		Student r = this.jdbcTemplate.queryForObject(query,rowMapper, new Object[]{studentId});
		return r;
		
	}
	
	 public void printStudentEmail(int id) {
		 System.out.println("Fetching student with ID: " + id);
		 Student student1 = getStudentById(id);
		 if (student1 != null) {
			 System.out.println("Student email: " + student1.getEmail());
			 } else {
		        System.out.println("Student with ID " + id + " not found.");
		    }
		}
	
	@Override
	public List<Student> getAllStudent() {
		String query =  "SELECT * FROM student ";
		List<Student> r = this.jdbcTemplate.query(query,new StudentRowMapper());
		return r;
	}
	
	@Override
	public int change(Student student) {
		String sql = "update student set  name=? , email=? WHERE id=?";
		int r = this.jdbcTemplate.update(sql, student.getName(), student.getEmail(),student.getId());
		return r;
		
	}
	
	@Override
	public int delete(int id) {
		String sql = "DELETE FROM  student WHERE id = ?";
		int r = this.jdbcTemplate.update(sql,id);
		return r;
		
	}
	
	
	
	



}
