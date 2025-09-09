package com.yipi.yupicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yipi.yupicturebackend.domain.User;
import com.yipi.yupicturebackend.service.UserService;
import com.yipi.yupicturebackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 30637
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-09-09 23:25:22
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




