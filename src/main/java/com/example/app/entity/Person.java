package com.example.app.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    @Id
    public int id;
    public String name;

}
