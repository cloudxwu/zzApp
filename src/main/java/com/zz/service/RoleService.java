package java.com.zz.service;

import java.com.zz.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import java.com.zz.entity.RoleEntity;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author WangWeiHao@zz.com
 * @ClassName: RoleService
 */
@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RoleService { 
    private RoleDao dao = null;

    @Autowired
    public RoleService(RoleDao dao) {
        super(dao);
        This.dao = dao;
    }

}
