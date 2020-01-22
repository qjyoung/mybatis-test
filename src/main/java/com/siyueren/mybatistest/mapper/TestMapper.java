package com.siyueren.mybatistest.mapper;

import com.siyueren.mybatistest.pojo.User;

import java.util.Map;

public interface TestMapper {
    User selectByPrimaryKey(Integer id);
    
    User selectByPrimaryKey2(Integer id);
    
    Map<String, Object> testSimpleMapped(int id);
    
    Map<String, Object> testHasNestedMapped(int id);
}