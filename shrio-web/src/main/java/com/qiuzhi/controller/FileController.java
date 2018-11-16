package com.qiuzhi.controller;

import com.qiuzhi.dao.mapper.ImginfoMapper;
import com.vo.AdPictureURL;
import com.vo.Imginfo;
import com.vo.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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
public class FileController {

    @Autowired
    private ImginfoMapper imginfoMapper;

    @RequestMapping(value = "/wangEditorUpload")
    public AdPictureURL upload(@RequestParam List<MultipartFile> list) {
        Integer error = 0;
        List<String> urls = new ArrayList<>();
        AdPictureURL returnAd = new AdPictureURL();
        Map<String, Object> map = new HashMap<>();
        List<String> adlist = new ArrayList<>();
        if (list.size() == 0) {
            error = 1;
        }
        Imginfo img = new Imginfo();

        for (MultipartFile file : list) {
            String realName = "";
            if (file != null) {
                String fileName = UUID.randomUUID().toString();
                String path = "" + fileName;
                File newFile = new File("" + fileName);
                try {
                    file.transferTo(newFile);
                    String databaseUrl = "http://192.168.1.58:8081/study/picture/" + fileName;
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
