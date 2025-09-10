package com.yipi.yupicturebackend.service;

import com.yipi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 30637
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-09-09 23:25:22
*/
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);
}
