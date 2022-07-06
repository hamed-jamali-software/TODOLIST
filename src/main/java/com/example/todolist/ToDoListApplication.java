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

public class ToDoListApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        baseDataRepository.saveAll(addAll());
    }

    @Autowired
    private BaseDataRepository baseDataRepository;
    private static List<BaseData> addAll(){
        List<BaseData> baseDataList = new ArrayList<>();

        baseDataList.add(new BaseData().builder().name("15 übung").nameAuto("3.1").count(50).daily(1).
                remaining(2).build()
        );
        return baseDataList;
    }
}
