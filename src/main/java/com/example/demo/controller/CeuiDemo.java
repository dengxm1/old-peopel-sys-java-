package com.example.demo.controller;

import com.example.demo.utils.FileUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * 测试
 */
@RequestMapping("/ceui")
@RestController
public class CeuiDemo {


	@PostMapping("/lmxi")
	public String aa(HttpServletRequest request) throws IOException {
		String s = FileUtil.fileUpload(request);
		return s;
	}


}
