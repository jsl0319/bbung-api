package com.bbung.api.test.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "bbung", name = "test")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer testId;

    @Column(length = 100)
    private String testContents;
}
