package com.qiuzhi.controller;

import com.qiuzhi.dao.mapper.ImginfoMapper;
import com.vo.AdPictureURL;
import com.vo.Imginfo;
import com.vo.ReturnObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Controller
@RequestMapping("/photo")
public class FileController {

    private final static Log logger = LogFactory.getLog(FileController.class);

    @Autowired
    private ImginfoMapper imginfoMapper;

    @RequestMapping(value = "/wangEditorUpload")
    @CrossOrigin
    @ResponseBody
    public AdPictureURL upload(@RequestParam("photo") List<MultipartFile> list, ServletRequest request) {
        Integer error = 0;
        List<String> urls = new ArrayList<>();
        AdPictureURL returnAd = new AdPictureURL();
        Map<String, Object> map = new HashMap<>();
        List<String> adlist = new ArrayList<>();
        logger.info("有"+list.size()+"张图片上传");
        if (list.size() == 0) {
            error = 1;
        }
        for (MultipartFile file : list) {
            String realName = file.getOriginalFilename();
            if (file != null) {
                String fileName = UUID.randomUUID().toString()+realName;
                String path = request.getServletContext().getRealPath("/") + "img/" + fileName;
                logger.info("文件路径为：" + path);
                File newFile = new File(path);
                try {
                    file.transferTo(newFile);
                    String databaseUrl = request.getServletContext().getContextPath() + "/img/" + fileName;
                    urls.add(databaseUrl);
                } catch (IOException e) {
                    error = 1;
                    e.printStackTrace();
                }
            }
        }
        // Mybatis 批量插入 TODO

        for(String fileUrl : urls){
            Imginfo imginfo = new Imginfo();
            imginfo.setImgurl(fileUrl);
            imginfoMapper.insert(imginfo);
        }
        returnAd.setData(urls);
        returnAd.setErrno(error);
        return returnAd;
    }

}
