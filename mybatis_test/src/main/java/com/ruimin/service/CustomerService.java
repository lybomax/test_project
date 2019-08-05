package com.ruimin.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @class: CustomerService
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LYY
 * @date: 2019年07月01日 13:52
 * @since: 1.0.0
 */
@Component(value="customerService")
public class CustomerService {

  private String getLoginIp(HttpServletRequest request) {
    String ipAddress = request.getHeader("x-forwarded-for");
    if (StringUtils.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("Proxy-Client-IP");
    }
    if (StringUtils.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("WL-Proxy-Client-IP");
    }
    if (StringUtils.isEmpty(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getRemoteAddr();
      if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
        // 根据网卡取本机配置的IP
        InetAddress inet = null;
        try {
          inet = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
        }
        ipAddress = inet.getHostAddress();
      }
    }
    // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
    if (StringUtils.isNotBlank(ipAddress) && ipAddress.length() > 15) {
      int idx = ipAddress.indexOf(",");
      if (idx > 0) {
        ipAddress = ipAddress.substring(0, idx);
      }
    }
    System.out.println("ipAddress = " + ipAddress);
    return ipAddress;
  }
  //保存业务方法
  public void save(){
    System.out.println("CustomerService业务层被调用了。。。");
  }


}
