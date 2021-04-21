package com.gls.test.service.impl;

import com.gls.test.service.PersonService;

public class PersonServiceImpl implements PersonService {
    @Override
    public void hello() {
        System.out.println("你好呀");
    }

    @Override
    public void doubt() {
        System.out.println("在学习");
    }

    @Override
    public void end() {
        System.out.println("愿您开心不至今天！！！！！");
    }
}
