package com.example.demo.dao;

import com.example.demo.po.TodoPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDao {
    List<TodoPo> getTodoList();
}
