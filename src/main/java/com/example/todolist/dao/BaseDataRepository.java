package com.example.todolist.dao;

import com.example.todolist.model.BaseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDataRepository extends JpaRepository<BaseData, Long> {
}