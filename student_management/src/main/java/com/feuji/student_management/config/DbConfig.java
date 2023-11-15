package com.feuji.student_management.config;

import java.util.Properties;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages ={"com.feuji.student_management","com.feuji.student_management.service"})
@PropertySource(value = "classpath:mysql.properties")
public class DbConfig {


		@Autowired
		private Environment environment;
		
		@Bean
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
			dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
			dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
			dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
			return dataSource;
		}

		private Properties hibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
			properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
			properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
			//properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
			return properties;
		}

		@Bean
		public LocalSessionFactoryBean sessionFactory() {
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource());
		 sessionFactory.setPackagesToScan(new String[] { "com.feuji.student_management.model" });
			sessionFactory.setHibernateProperties(hibernateProperties());
			return sessionFactory;
		}

		@Bean
		public HibernateTemplate hibernateTemplate() {
			HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory().getObject());
			return hibernateTemplate;
		}

		@Bean
		public HibernateTransactionManager getTransactionManager() {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(sessionFactory().getObject());
			return transactionManager;
		}
		

	}

	



