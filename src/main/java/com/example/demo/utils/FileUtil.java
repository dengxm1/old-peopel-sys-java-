package com.example.demo.utils;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.io.FileOutputStream;
import java.util.List;


public class FileUtil {

 	private static String PicturesAndAccessoriesDownLoadPath = "E:\\JavaExploit";

	public static String fileUpload(HttpServletRequest request) throws FileNotFoundException {

		File saveFile = null;
		/*如果flag为 1 就代表上传的是附件	如果flag是0的话就上传的流程图*/
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

		MultipartFile file = null;
		BufferedOutputStream stream = null;


		//预先声明一个map集合用来返回上传文件的路径和文件名
		for (int i = 0; i < files.size(); i++) {

			//获取每个文件
			file = files.get(i);
			//如果不为空
			if (!file.isEmpty()) {
				//获取文件的原始文件名
				String saveFileName = file.getOriginalFilename();
				saveFile = new File(PicturesAndAccessoriesDownLoadPath + "/" + saveFileName);
				//如果文件夹不存在就创建新的文件夹
				if (!saveFile.getParentFile().exists()) {
					saveFile.getParentFile().mkdirs();
				}

				byte[] bytes = new byte[0];
				try {
					bytes = file.getBytes();
					//开始批量上传
					stream = new BufferedOutputStream(new FileOutputStream(
							saveFile));
					stream.write(bytes);
					stream.close();
					System.out.println("批量文件上传成功");
					//组合实体类**************************************


				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//如果实体类不为空的话

		return saveFile.toString();


	}

}