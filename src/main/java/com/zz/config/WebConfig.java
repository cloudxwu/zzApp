package java.com.zz.config;

import org.springframework.context.ApplicationContextAware;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: WebConfig
 */
@Configuration
@EnableWebMvc
@ComponentScan("java.com.zz.controller")
public class WebConfig { 
    private ApplicationContext applicationContext = null;

    /**
     * 服务器连接
     * ssh -p 22 root@127.0.0.1 
     * root
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }

}
