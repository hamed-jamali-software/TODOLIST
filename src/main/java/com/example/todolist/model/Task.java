package com.example.todolist.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Task {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id ;

    @OneToOne
    @JoinColumn(name = "idBaseData", referencedColumnName = "id")
    private BaseData baseData;

    @Column
    private int idBaseData;


    //@Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    @Nullable
    private boolean status;

}
