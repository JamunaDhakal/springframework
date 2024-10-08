package com.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.dao.StudentDaoImpl;

@Configuration
public class AppConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("en$cry%ption123");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		 return new JdbcTemplate(dataSource());
	}
	
	@Bean
	 public StudentDaoImpl studentDao() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(jdbcTemplate());
        return studentDao;
    }

	
	
	

}
