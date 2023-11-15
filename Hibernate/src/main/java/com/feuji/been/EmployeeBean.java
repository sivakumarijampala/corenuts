package com.feuji.been;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.core.hybernet.HybernateConfigure;
import com.feuji.Entity.Employee;


@Configuration
@ComponentScan(basePackages = { "com.feuji.Entity" })
@Import(value = HybernateConfigure.class)
public class EmployeeBean {
	
	

}
