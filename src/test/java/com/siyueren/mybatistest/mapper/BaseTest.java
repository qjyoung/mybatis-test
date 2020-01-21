package com.siyueren.mybatistest.mapper;

import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.io.Resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class BaseTest {
    
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    
    public static final String DERBY = "derby.sql";
    
    public void runScript(Connection connection, String resource) throws IOException, SQLException {
        try (Reader reader = Resources.getResourceAsReader(resource)) {
            BufferedReader lineReader = new BufferedReader(reader);
            StringBuilder script = new StringBuilder();
            String line;
            while ((line = lineReader.readLine()) != null) {
                script.append(line);
            }
            final String[] sqls = script.toString().split(";");
            for (String sql : sqls) {
                logger.info("sql:{}", sql);
                if (StringUtils.isNullOrEmpty(sql.trim())) {
                    continue;
                }
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                boolean result = preparedStatement.execute();
                logger.info("result:{}", result);
            }
        }
    }
}
