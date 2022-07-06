package com.example.todolist;

import com.example.todolist.dao.BaseDataRepository;
import com.example.todolist.dao.TaskRepository;
import com.example.todolist.model.BaseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ToDoListApplication   {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
    }



}
