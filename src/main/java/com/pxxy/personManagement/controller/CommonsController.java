package com.pxxy.personManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.pxxy.personManagement.utils.ValidateCode;

@Controller
@PropertySource(value = {"classpath:app.properties"}) 
public class CommonsController {
	/**
	 * wangEditor上传路径
	 */
	@Value("${wangEditor.uploadPath}")
	private String WANGEDITOR_UPLOAD_PATH;
	/**
	 * 	生成验证码
	 * @param time
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="getCode")
	public void getCode(@RequestParam(value = "time") Date time,HttpServletRequest request,HttpServletResponse response){
		ValidateCode code = new ValidateCode(100,30,4,30,25,"validateCode");
		code.getCode(request, response);
		System.out.println(request.getSession().getAttribute("validateCode"));
	}

    /**
     * 	wangEditor文件上传 
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String, Object> upload(MultipartFile editorFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        System.out.println(editorFile+"hello");
        // 获取文件后缀
        String fileName = editorFile.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));

        // 文件存放路径
        String filePath = WANGEDITOR_UPLOAD_PATH;

        // 判断路径是否存在，不存在则创建文件夹
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }

        // 将文件写入目标
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        try {
            editorFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(WANGEDITOR_UPLOAD_PATH);
        // 获取服务端路径
        String serverPath = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getContextPath());
        System.out.println(serverPath + "/static/upload/wangEditorUpload/" + file.getName());
//        System.out.println(serverPath + file.getName().substring(file.getName().lastIndexOf("'\'")));
        // 返回给 wangEditor 的数据格式
        result.put("errno", 0);
        result.put("data", new String[]{serverPath + "/static/upload/wangEditorUpload/" + file.getName()});
        return result;
    }
}
