package java.com.zz.dao;

import java.util.List;

public class IDao { 

    /**
     * 删除一条记录
     * @param id ID号
     */
    public T delete(long id) {
    }

    /**
     * 获取最大值
     * @param sql SQL语句
     * @return null表示没有找到，非null表示一组结果
     */
    public int findMaxValue(String sql) {
    }

    /**
     * 修改一条记录
     * @param entity 实体对象
     * @return 更新后的新对象
     */
    public T update(T entity) {
    }

}
