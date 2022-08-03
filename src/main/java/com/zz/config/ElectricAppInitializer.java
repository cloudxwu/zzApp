package java.com.zz.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import javax.servlet.MultipartConfigElement;
import org.springframework.web.filter.HttpPutFormContentFilter;
import javax.servlet.ServletRegistration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;
import java.nio.charset.Charset;
import javax.servlet.annotation.MultipartConfig;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: ElectricAppInitializer
 */
public class ElectricAppInitializer { 
    private static final int MAX_UPLOAD_SIZE = 2 * 1024 * 1024;
    private static final int MAX_REQUEST_SIZE = 4 * 1024 * 1024;

    @Override
    protected Class<?> getServletConfigClasses() {
    }

}
