package com.horetskyi.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idroute")
    private Integer id;

    @Column (name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @Column(name = "data")
    private String data;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name="user_iduser",nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="driver_iddriver", nullable=false)
    private Driver driver;

}
