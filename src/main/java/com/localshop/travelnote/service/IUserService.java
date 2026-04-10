package com.localshop.travelnote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.localshop.travelnote.dto.LoginFormDTO;
import com.localshop.travelnote.dto.Result;
import com.localshop.travelnote.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();
}
