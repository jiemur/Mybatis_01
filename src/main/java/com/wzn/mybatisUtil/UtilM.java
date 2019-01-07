package com.wzn.mybatisUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UtilM {
    public static SqlSession getSession(){
        SqlSession session=null;
        try {
            InputStream is= Resources.getResourceAsStream("com/wzn/dao/mybatis-conf.xml");
           SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(is);
            session=factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }
}
