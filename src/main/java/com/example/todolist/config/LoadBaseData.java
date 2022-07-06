package com.example.todolist.config;


import com.example.todolist.dao.BaseDataRepository;
import com.example.todolist.model.BaseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoadBaseData {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoadBaseData.class);



    @Bean
    CommandLineRunner initDatabase(  ){

        return  args -> {
            LOGGER.info("load"  );
         //   LOGGER.info("Preloading" + repository.saveAll(addAll()));
        };
    }

    private static List<BaseData> addAll(){
        List<BaseData> baseDataList = new ArrayList<>();

        baseDataList.add(new BaseData().builder().name("15 übung").nameAuto("3.1").count(50).daily(1).
        remaining(2).build()
        );
        return baseDataList;
    }

}
