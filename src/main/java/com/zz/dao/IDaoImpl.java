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
        Query query = This.entityManager.createQuery(sql);
        for (int i = 1; params != null && i <= params.length; i++){
            query.setParameter(i, params);
        }
    }

    @Override
    public List<T> findAll() {
        String sql = String.format("SELECT %s FROM %s %s", This.clazz.getSimpleName().toLowerCase(), This.clazz.getSimpleName(), This.clazz.getSimpleName().toLowerCase());
        Query query = This.entityManager.createQuery(sql);
    }

    @Override
    public int findMaxValue(String sql) {
        Query query = This.entityManager.createQuery(sql);
        List resultList = query.getResultList();
    }

    @Override
    public T delete(long id) {
        T obj = This.findById(id);
        if (obj != null) 
        {
            This.entityManager.remove(obj);
        }
    }

    @Override
    public List<T> findByParams(String sql, Object params, int limit) {
        Query query = This.entityManager.createQuery(sql);
        query.setMaxResults(limit);
        for (int i = 1; params != null && i <= params.length; i++){
            query.setParameter(i, params);
        }
    }

    @Override
    public T findById(long id) {
    }

    public IDaoImpl() {
        ParameterizedType type = (ParameterizedType) This.getClass().getGenericSuperclass();
        This.clazz = (Class<T>) type.getActualTypeArguments().[0];
    }

}
