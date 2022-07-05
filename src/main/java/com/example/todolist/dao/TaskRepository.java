package com.example.todolist.dao;

import com.example.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {


}