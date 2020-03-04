package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class HystrixService implements UserService {
    @Override
    public String hello() {
        return null;
    }

    @Override
    public List<Map> list(Map map) {
        System.out.println("HystrixService is working");
        return null;
    }

    @Override
    public int save(Map map) {
        return 0;
    }

    @Override
    public List<Map> getAllRoles() {
        return null;
    }
}
