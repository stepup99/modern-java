package com.moduletwo.service;

import com.moduletwo.dtos.Module2DTO;

public class Module2Service {

    public Module2DTO retrieveModule2(){
        return new Module2DTO("Hello! This is from Module2");
    }
}
