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
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
    }

}
