package com.hs.server.util;

import com.hs.server.config.WebSecurityConfig;
import com.hs.server.domain.BaseAuditEntity;
import com.hs.server.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Date:     2018/7/24 13:59<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Component
public class SessionUtil {

    public User getCurrentUser() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        if(session!=null &&session.getAttribute(WebSecurityConfig.SESSION_KEY)!=null){
            User user = (User)session.getAttribute(WebSecurityConfig.SESSION_KEY);
            return user;
        }
        return null;
    }

    public void setCurrentUserInfo(BaseAuditEntity entity, int type){
        Date date = new Date();
        User currentUser = getCurrentUser();
        if(currentUser != null){
            if(0 == type){
                entity.setCreateBy(String.valueOf(currentUser.getUserId()));
                entity.setCreateDate(date);
            }
            entity.setUpdateBy(String.valueOf(currentUser.getUserId()));
            entity.setUpdateDate(date);
        }

    }
}
