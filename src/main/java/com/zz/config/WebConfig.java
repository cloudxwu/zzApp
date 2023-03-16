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

    @Bean
    public MultipartResolver multipartResolver() {
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(This.applicationContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setCacheable(false);
    }

    /** 
* test comment
* line2
**/
    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
    }

}
