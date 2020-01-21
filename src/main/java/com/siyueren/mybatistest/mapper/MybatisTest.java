package com.siyueren.mybatistest.mapper;

import com.siyueren.mybatistest.pojo.User;
import com.siyueren.mybatistest.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 乔健勇
 * @date 21:56 2020/1/21
 * @email qjyoung@163.com
 */
public class MybatisTest {
    public static void main(String[] args) {
        
        SqlSession session = MyBatisUtil.getSqlSession();
        TestMapper mapper = session.getMapper(TestMapper.class);
        User user = mapper.selectByPrimaryKey(1);
        
        session.close();
        System.out.println(user);
    }
}
