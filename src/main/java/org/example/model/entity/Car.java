package org.example.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcar")
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name = "mark")
    private  String mark;

    @Column(name = "color")
    private String color;

    @Column(name = "car_number")
    private String carNumber;

}