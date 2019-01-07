package com.wzn;

import com.wzn.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            InputStream is= Resources.getResourceAsStream("com/wzn/dao/mybatis-conf.xml");
            SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(is);
            SqlSession session=factory.openSession();
           List<User> lists= session.selectList("getUsers");

            for (User u:lists
                 ) {
                System.out.println(u);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
