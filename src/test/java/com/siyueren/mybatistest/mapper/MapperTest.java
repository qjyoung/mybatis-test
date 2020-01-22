package com.siyueren.mybatistest.mapper;

import com.siyueren.mybatistest.pojo.User;
import com.siyueren.mybatistest.util.MyBatisUtil;
import org.apache.ibatis.jdbc.RuntimeSqlException;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by QJY on 2018/7/15
 */
public class MapperTest extends BaseTest {
    
    private static final Logger logger = LoggerFactory.getLogger(MapperTest.class);
    
    private static SqlSession session = MyBatisUtil.getSqlSession();
    private static TestMapper mapper = session.getMapper(TestMapper.class);
    
    private void print(String flag, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            logger.debug("{}->{}:{}", flag, entry.getKey(), entry.getValue());
        }
    }
    
    @After
    public void after() {
        session.close();
    }
    
    @Test
    public void initDb() throws Exception {
        Connection connection = session.getConnection();
        runScript(connection, BaseTest.DERBY);
        try {
            if (!connection.getAutoCommit()) {
                connection.commit();
            }
        } catch (Throwable t) {
            throw new RuntimeSqlException("Could not commit transaction. Cause: " + t, t);
        } finally {
            connection.close();
        }
    }
    
    @Test
    public void simple() {
        User user = mapper.selectByPrimaryKey(1);
        logger.debug("user-1:{}", user);
        user = mapper.selectByPrimaryKey2(1);
        logger.debug("user-2:{}", user);
    }
    
    @Test
    public void testSimpleMapped() throws Exception {
        Map<String, Object> simpleMapped = mapper.testSimpleMapped(1);
        logger.debug("simpleMapped:{}", simpleMapped);
    }
    
    @Test
    public void testHasNestedMapped() throws Exception {
//        User user = mapper.selectByPrimaryKey(1);
//        Map<String, Object> simpleMapped = mapper.testSimpleMapped(1);
//        logger.debug("simpleMapped:{}", simpleMapped);
        Map<String, Object> nestedMapped = mapper.testHasNestedMapped(1);
        logger.debug("nestedMapped:{}", nestedMapped);
    }
}