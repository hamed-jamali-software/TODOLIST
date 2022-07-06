package com.example.todolist.service;


import com.example.todolist.dao.BaseDataRepository;
import com.example.todolist.model.BaseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDataService {

      @Autowired
      BaseDataRepository baseDataRepository;

    public BaseData addBaseData (BaseData baseData){

      return  baseDataRepository.save(baseData);
    }

    public List<BaseData> getBaseDataList (){
        return baseDataRepository.findAll();
    }

    public void deleteBaseData(long id){
          baseDataRepository.deleteById(id);
    }



}
