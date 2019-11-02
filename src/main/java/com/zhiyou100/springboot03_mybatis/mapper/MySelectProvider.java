package com.zhiyou100.springboot03_mybatis.mapper;

import java.util.Map;

/**
 * @author:@Rain
 * @date 2019/10/23 11:57
 * @desc
 */
// 提供动态sql的类
/*public class MySelectProvider {

    // 用Map接受mapper传递的参数
    public String mysql1(Map params){
        StringBuilder sql = null;
        sql = new StringBuilder("select * from users ");
        if (params != null && params.size()>0) {
        sql.append("where id = "+params.get("id"));
        }

        return sql.toString();
    }
}*/
