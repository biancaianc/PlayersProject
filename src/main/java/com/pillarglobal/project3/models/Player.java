package com.pillarglobal.project3.models;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="players",schema = "players_schema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    private Integer id;
    private String name;
    private String sport;
    private int age;
}
