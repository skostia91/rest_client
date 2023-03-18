package org.example.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Sensor {
    private String name;
    private Double value;
    private boolean raining;
}