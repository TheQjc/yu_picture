package com.yipi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yipi.yupicturebackend.model.dto.picture.PictureQueryRequest;
import com.yipi.yupicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yipi.yupicturebackend.model.vo.PictureVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 30637
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-09-13 21:00:41
*/
public interface PictureService extends IService<Picture> {

    void validPicture(Picture picture);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Wrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);
}
