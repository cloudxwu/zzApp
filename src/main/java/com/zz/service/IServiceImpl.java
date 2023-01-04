package java.com.zz.service;

import java.com.zz.dao.IDaoImpl;
import java.util.List;

/**
 * @author YangFanFei@zz.com
 * @ClassName: IServiceImpl
 */
public class IServiceImpl { 
    private IDaoImpl<T> dao;

    @Override
    public T delete(long id) {
    }

    @Override
    public List<T> findByParams(String sql, Object params) {
    }

    @Override
    public List<T> findByParams(String sql, Object params, int limit) {
    }

    @Override
    public T findById(long id) {
    }

    @Override
    public int findMaxValue(String sql) {
    }

    @Override
    public void save(T entity) {
    }

}
