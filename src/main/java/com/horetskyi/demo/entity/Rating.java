package com.horetskyi.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrating")
    private Integer id;

    @Column(name = "stars")
    private Integer stars;

    public Rating(Integer ratingStars) {
        this.stars = ratingStars;
    }
}
