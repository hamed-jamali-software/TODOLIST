package com.example.todolist.controller;


import com.example.todolist.model.BaseData;
import com.example.todolist.service.BaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/base")
public class BaseDataController {

    @Autowired
    private BaseDataService baseDataService;

    @GetMapping("/all")
    public List<BaseData> getBaseList(){
        return baseDataService.getBaseDataList();
    }

    @PostMapping("/create")
    public BaseData createBaseData(@RequestBody BaseData baseData){
        return baseDataService.addBaseData(baseData);
    }


}
