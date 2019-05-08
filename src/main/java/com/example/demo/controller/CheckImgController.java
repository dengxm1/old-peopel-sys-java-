package com.example.demo.controller;

import com.example.demo.utils.CaptchaUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 * @since
 */
@RestController
@RequestMapping(value = "/yzm")
@CrossOrigin
public class CheckImgController {

  /*
   * 验证码请求
   *
   */
  @RequestMapping(value = "/captcha", method = RequestMethod.GET)
  public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
    CaptchaUtil.outputCaptcha(request, response);
  }

  /*
  当前端请求一个url并且传了一个checkCode参数的时候,会进行检验，并且把检验
  的结果以json数据返回，true或者false
  http://localhost:8080/api/yzm/checkImg?checkCode="asdasd"
   */
  @RequestMapping(value = "/checkImg", method = RequestMethod.GET)
  public Boolean checkImg(HttpServletRequest request, @RequestParam(value = "checkCode") String checkCode) {
    String str = (String) request.getSession().getAttribute("randomString");
    if (str.trim().toUpperCase().equals(checkCode.trim().toUpperCase())) {
      return true;
    } else {
      return false;
    }
  }
}
