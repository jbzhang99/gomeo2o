/*
 * Copyright (c) 2014 杭州端点网络科技有限公司
 */

package io.terminus.ecp.event.user;

import io.terminus.ecp.event.user.UserEvent;
import io.terminus.ecp.user.dto.LoginUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 注册事件
 * Author: haolin
 * On: 8/27/14
 */
public class RegisterEvent extends UserEvent {

    public RegisterEvent(HttpServletRequest request, HttpServletResponse response, LoginUser user) {
        super(request, response, user);
    }
}
