package dev.blogapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int postId;
    @Column(name = "title")
    private String postTitle;
    @Column(name = "summary")
    private String postSummary;
    @Column(name = "content")
    private String postContent;
    @Column(name = "created_at")
    private Date postCreateDate;
    @Column(name = "updated_at")
    private Date postUpdateDate;
    @Column(name = "likes")
    private int  numberOfLikes;
    @Column(name = "dislike")
    private int  numberOfDislikes;

    @ManyToOne
    @JsonIgnore
    private User author;


}
