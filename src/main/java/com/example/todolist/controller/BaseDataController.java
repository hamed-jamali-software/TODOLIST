package com.example.todolist.controller;


import com.example.todolist.model.BaseData;
import com.example.todolist.service.BaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/base")
public class BaseDataController {



    private   BaseDataService baseDataService;

    @GetMapping("/all")
    public ResponseEntity<Object> getBaseList(){
        return new ResponseEntity<>(
                baseDataService.getBaseDataList(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createBaseData(@RequestBody BaseData baseData){
        return new ResponseEntity<>( baseDataService.addBaseData(baseData),HttpStatus.CREATED);
    }


}
