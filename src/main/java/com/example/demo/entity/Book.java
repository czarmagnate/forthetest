package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity // JPA API >> create table book
// JPA API(엔진 : Hibernate)
// Object -> Table Mapping : ORM(Object Relational Mapping) -> SQL 생성
public class Book {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @Column(name="titl") >> 컬럼명 titl 로 변경
    @Column(name = "title", unique = true, nullable = false, length = 40)
    private String title;
    private int price;
    private String author;
    private int page;
}
// Book(Entity+DTO)