package java.com.zz.config;

import org.hibernate.cfg.AvailableSettings;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.JpaVendorAdapter;
import java.util.Properties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;

/**
 * @author YangFanFei@zz.com
 * @ClassName: DatabaseConfig
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"java.com.zz.dao", "java.com.zz.entity", "java.com.zz.service"})
public class DatabaseConfig { 

    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        return adapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setJpaProperties(databaseProperties());
        localContainerEntityManagerFactoryBean.setPackagesToScan("java.com.zz.entity");
        return localContainerEntityManagerFactoryBean;
    }

    private Properties databaseProperties() {
        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty(AvailableSettings.SHOW_SQL, "true");
        properties.setProperty(AvailableSettings.FORMAT_SQL, "true");
        properties.setProperty(AvailableSettings.INTERCEPTOR, DeviceLocationInterceptor.class);
        return properties;
    }

    @Bean
    public JpaTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }

    @Bean
    public BeanPostProcessor persistenceTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/db?useSSL=true&serverTimezone=Asia/Shanghai&autoReconnect=true&useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        return dataSource;
    }

}
