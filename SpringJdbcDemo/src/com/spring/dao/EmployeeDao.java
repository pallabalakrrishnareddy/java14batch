package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entity.Employee;

public class EmployeeDao {
private JdbcTemplate jd;

public JdbcTemplate getJd() {
	return jd;
}

public void setJd(JdbcTemplate jd) {
	this.jd = jd;
}
public int insert(Employee e)
{
	String s="insert into employee values('"+e.getSapid()+"','"+e.getName()+"','"+e.getSalary()+"')";
	return jd.update(s);
	
}
}
