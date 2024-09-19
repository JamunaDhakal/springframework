package com.jdbc.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.config.AppConfig;
import com.jdbc.dao.StudentDao;
import com.jdbc.model.Student;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {  
	  
//		ApplicationContext context=new ClassPathXmlApplicationContext("jdbc\\applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    StudentDao studentDao = (StudentDao) context.getBean( StudentDao.class);
//	    
//	    Student student = new Student();
//	    student.setId(1221);
//	    student.setName("jamuna123");
//	    student.setEmail("dhakal1234@gmail.com");
//	    
//	    int r  = studentDao.insert(student);
//	    System.out.print(r);
//	    
//	    Student student1 = studentDao.getStudentById(1221);
//	    System.out.print(student1.getEmail());
//	    studentDao.printStudentEmail(12);
	   
	   	    
//	    List<Student> students = studentDao.getAllStudent();
//	    for(Student s:students) {
//	    	System.out.println(s.getId());	
//	    }
    
//	    Student student = new Student();
//	    student.setId(1);
//	    student.setName("jamuna dhakal");
//	    student.setEmail("jdhakal2000@gmail.com");
//	    studentDao.change(student);

	    studentDao.delete(12);
//	    System.out.print(delete);
	    
	    
	   
	}

}
