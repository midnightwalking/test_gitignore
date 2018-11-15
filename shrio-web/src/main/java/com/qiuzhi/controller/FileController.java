package com.qiuzhi.controller;

import com.vo.ReturnObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author qiuzhi
 * @date 2018/11/15
 * @description
 */
@Controller
public class FileController {

    @RequestMapping("/fileUp")
    @ResponseBody
    public ReturnObject fileUp(HttpServletRequest request) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        try {
            multipartRequest.setCharacterEncoding("UTF-8");
            Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
            // 文件数据库保存的路径
            String path = null;
            // 文件保存在硬盘的相对路径
            String realPath = null;


            for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()){
                MultipartFile mf = entity.getValue();// 获取上传文件对象
                String fileName = mf.getOriginalFilename();// 获取文件名
                System.out.println(fileName);
            }
        } catch (Exception e) {

        }
        return new ReturnObject("0","操作成功");
    }

    private String toHexString(int index) {
        String hexString = Integer.toHexString(index);
        // 1个byte变成16进制的，只需要2位就可以表示了，取后面两位，去掉前面的符号填充
        hexString = hexString.substring(hexString.length() - 2);
        return hexString;
    }
}
