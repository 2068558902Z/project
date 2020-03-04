package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CilentService {
    @Autowired
    RestTemplate restTemplate;



    public ResponseEntity<String> buy(){
      return restTemplate.getForEntity("http://SERVICE-PROVIDER/hi",String.class);
    }
}
