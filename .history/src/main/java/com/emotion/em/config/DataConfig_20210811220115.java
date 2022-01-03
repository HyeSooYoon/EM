package com.emotion.em.config;

public class DataConfig {
    @Autowired
    private DatabaseProperties databaseProperties;

    @Bean
    public DataSource dataSoure() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(databaseProperties.getDriver());
        dataSource.setUrl(databaseProperties.getUrl());
        dataSource.setUsername(databaseProperties.getUsername());
        dataSource.setPassword(databaseProperties.getPassword());
        return dataSource;
    }

    @Bean public LocalContainerEntityManagerFactoryBean entityManagerFactory(){ LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean(); factoryBean.setDataSource(dataSoure()); factoryBean.setPackagesToScan("com.example.model"); factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter()); // JPA 상세설정 Properties jpaProperties = new Properties(); jpaProperties.put(AvailableSettings.SHOW_SQL, true); // SQL 보기 jpaProperties.put(AvailableSettings.FORMAT_SQL, true); // SQL 포맷팅하기 jpaProperties.put(AvailableSettings.USE_SQL_COMMENTS, true); // SQL 코멘트 보기 jpaProperties.put(AvailableSettings.HBM2DDL_AUTO, databaseProperties.getHbm2ddlAuto()); // DDL 자동생성 종류 jpaProperties.put(AvailableSettings.DIALECT, databaseProperties.getDialect()); // 방언 설정 jpaProperties.put(AvailableSettings.USE_NEW_ID_GENERATOR_MAPPINGS, true); // 키 생성 전략 사용시 설정 jpaProperties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy"); // 자바의 카멜 표기법을 테이블의 언더스코어 표기법으로 매핑 factoryBean.setJpaProperties(jpaProperties); return factoryBean; }
 
}
