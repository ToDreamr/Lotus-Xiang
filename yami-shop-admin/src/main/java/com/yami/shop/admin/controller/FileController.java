

package com.yami.shop.admin.controller;

import com.yami.shop.common.bean.Qiniu;
import com.yami.shop.common.response.ServerResponseEntity;
import com.yami.shop.common.util.ImgUploadUtil;
import com.yami.shop.service.AttachFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

/**
 * 文件上传 controller
 * @author 春江花朝秋月夜
 *
 */
@RestController
@RequestMapping("/admin/file")
public class FileController {

	@Autowired
	private AttachFileService attachFileService;
	@Autowired
	private Qiniu qiniu;
	@Autowired
	private ImgUploadUtil imgUploadUtil;

	@PostMapping("/upload/element")
	public ServerResponseEntity<String> uploadElementFile(@RequestParam("file") MultipartFile file) throws IOException{
		if(file.isEmpty()){
            return ServerResponseEntity.success();
        }
		String fileName = attachFileService.uploadFile(file);
        return ServerResponseEntity.success(fileName);
	}

	@PostMapping("/upload/tinymceEditor")
	public ServerResponseEntity<String> uploadTinymceEditorImages(@RequestParam("editorFile") MultipartFile editorFile) throws IOException{
		String fileName =  attachFileService.uploadFile(editorFile);
		String data = "";
		if (Objects.equals(imgUploadUtil.getUploadType(), 1)) {
			data = imgUploadUtil.getUploadPath() + fileName;
		} else if (Objects.equals(imgUploadUtil.getUploadType(), 2)) {
			data = qiniu.getResourcesUrl() + fileName;
		}
        return ServerResponseEntity.success(data);
	}

}
