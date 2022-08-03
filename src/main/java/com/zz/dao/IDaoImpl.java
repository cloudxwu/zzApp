package java.com.zz.dao;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import javax.persistence.Parameter;

/**
 * @author YangFanFei@zz.com
 * @ClassName: IDaoImpl
 */
@Transactional
public class IDaoImpl { 
    private Class<T> clazz = null;
    private EntityManager entityManager;

    @Override
    public List<T> findByParams(String sql, Object params) {
    }

    @Override
    public List<T> findAll() {
    }

}
