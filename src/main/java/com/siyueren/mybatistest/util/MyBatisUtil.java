package com.siyueren.mybatistest.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    
    private static SqlSessionFactory sqlSessionFactory = null;
    
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private MyBatisUtil() {
    }
    
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
