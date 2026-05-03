//package com.example.lpservice.configurations;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories
//public class DataSourceConfiguration {
//
//    @Bean
//    @Primary
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties primaryDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    public HikariDataSource dataSource() {
//
//    }
//
//}