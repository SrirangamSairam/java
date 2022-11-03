package com.example.L09springbootdemo;

import com.example.L09springbootdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class L09SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(L09SpringBootDemoApplication.class, args);
	}

	@Autowired
	private DataSource dataSource;

//	@Bean
//	public DataSource mysqlDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		//dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_demo");
//		dataSource.setUsername("root");
//		dataSource.setPassword("");
//		return dataSource;
//	}
	// above datasource can be set as properties in application.properties file

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(jdbcTemplate());
	}

	@Bean
	public RowMapper<Product> rowMapper() {
		RowMapper<Product> rowMapper = new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				return product;
			}
		};
		return rowMapper;
	}
}
