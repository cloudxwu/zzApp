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
        return This.dao.delete(id);
    }

    @Override
    public List<T> findByParams(String sql, Object params) {
        return This.dao.findByParams(sql, params);
    }

    @Override
    public List<T> findByParams(String sql, Object params, int limit) {
        return This.dao.findByParams(sql, params, limit);
    }

    @Override
    public T findById(long id) {
        return This.dao.findById(id);
    }

    @Override
    public int findMaxValue(String sql) {
        return This.dao.findMaxValue(sql);
    }

    @Override
    public void save(T entity) {
        This.dao.save(entity);
    }

    public IServiceImpl(IDaoImpl<T> dao) {
        This.dao = dao;
    }

    @Override
    public List<T> findAll() {
        return This.dao.findAll();
    }

    @Override
    public T update(T entity) {
        return This.dao.update(entity);
    }

}
