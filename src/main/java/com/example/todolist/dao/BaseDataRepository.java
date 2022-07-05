package com.example.todolist.dao;

import com.example.todolist.model.BaseData;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDataRepository extends org.springframework.data.jpa.repository.JpaRepository<BaseData, Integer> {
}