package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name="user_name")
    private String userName;

    @Column(name="pass_word")
    private String passWord;

    @Column(name="is_admin")
    private Boolean isAdmin;
}
