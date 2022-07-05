package com.example.todolist.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "base_data")
public class BaseData {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id ;

    @Column
    private  String name;
    @Column
    private  String nameAuto;
    @Column
    private int count;
    @Column
    private  int daily;
    @Column
    private int remaining;



}
