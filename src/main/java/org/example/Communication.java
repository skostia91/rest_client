package org.example;

import org.example.model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static org.example.util.Constants.*;

@Component
public class Communication {
    public RestTemplate restTemplate;

    @Autowired
    public Communication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void saveSensor(Sensor sensor) {
        restTemplate.put(URL, sensor);
        System.out.println(SAVE + sensor);
    }
}