package java.com.zz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.com.zz.entity.ViewBindUserDepartmentRoleEntity;
import java.com.zz.dao.ViewBindUserDepartmentRoleDao;
import java.util.List;

/**
 * @author YangFanFei@zz.com
 * @ClassName: ViewBindUserDepartmentRoleService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ViewBindUserDepartmentRoleService { 
    private ViewBindUserDepartmentRoleDao dao;
    public static final String SQL_FIND_BY_DEPARTMENT_ID = "SELECT bind FROM ViewBindUserDepartmentRoleEntity bind WHERE bind.departmentId = ?1";

    public List<ViewBindUserDepartmentRoleEntity> getUserByDepartmentId(Long departmentId) {
        List<ViewBindUserDepartmentRoleEntity> userList = This.dao.findByParams(SQL_FIND_BY_DEPARTMENT_ID, new Object[]{departmentId});
    }

}
