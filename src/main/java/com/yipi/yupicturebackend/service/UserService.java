package com.yipi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.yipi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yipi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yipi.yupicturebackend.model.vo.LoginUserVO;
import com.yipi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 30637
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-09-09 23:25:22
*/
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);

    User getLoginUser(HttpServletRequest request);

    String getEncryptPassword(String defaultPassword);

    UserVO getUserVO(User user);

    Wrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    List<UserVO> getUserVOList(List<User> records);

    boolean isAdmin(User loginUser);

    LoginUserVO getLoginUserVO(User loginUser);
}
