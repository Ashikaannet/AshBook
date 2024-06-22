package org.example.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postid;

    @Column(name = "content")
    private String content;

    @Column(name = "description")
    private String description;

    @Column(name = "likes")
    private Integer likes;


}
