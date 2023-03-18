package org.example;

import org.example.configuration.MyConfig;
import org.example.model.Sensor;
import org.example.util.Constants;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        Random random = new Random();

        for (int i = 0; i < 500; i++) {
            System.out.println(i);
            Sensor sensor = new Sensor(Constants.SENSOR_NAME,
                    random.nextDouble() * Constants.MAX_TEMPERATURE, random.nextBoolean());
            communication.saveSensor(sensor);
        }
    }
}