package com.horetskyi.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "driver")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddriver")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "number_of_cars")
    private Integer numberOfCars;

    @Column(name = "experience")
    private Integer experience;

    @OneToOne
    @JoinColumn(name = "rating_idrating", referencedColumnName = "idrating")
    private Rating rating;
}