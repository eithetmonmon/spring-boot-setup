package com.example.demoapplication.dao;

import com.example.demoapplication.ds.ToDoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemDao extends CrudRepository<ToDoItem,Integer> {
}
