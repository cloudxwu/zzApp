package java.com.zz.service;

import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.com.zz.dao.BindUserDepartmentRoleDao;
import org.springframework.context.annotation.ScopedProxyMode;
import java.com.zz.entity.BindUserDepartmentRoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: BindUserDepartmentRoleService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BindUserDepartmentRoleService { 
    private BindUserDepartmentRoleDao dao;
    public static final String SQL_FIND_BY_USER_DEPARTMENT = "SELECT bind FROM BindUserDepartmentRoleEntity bind WHERE bind.userId = ?1 AND bind.departmentId = ?2";

}
