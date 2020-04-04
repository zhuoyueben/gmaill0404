package com.zhuoyueben.gmailuser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author TeaBen
 * @Date 2020-04-04 12:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hr {
    private Integer id ;
    private String name;
    private String phone;      //手机号码
    private String telephone;   //住宅电话
    private String address;     //联系地址
    private String enabled;    //<<缺省值:1>>
    private String username;   //用户名
    private String password;  //密码
    private String userface;
    private String remark;
}
