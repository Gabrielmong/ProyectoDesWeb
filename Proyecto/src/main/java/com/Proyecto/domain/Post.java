package com.Proyecto.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "posts")
public class Post implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPub;
    private String titulo;
    private String autor;
    private String review;
    private Date postDate;
    
    public Post() {
        
    }

    public Post(String titulo, String autor, String review, Date postDate) {
        this.titulo = titulo;
        this.autor = autor;
        this.review = review;
        this.postDate = postDate;
    }
    
}
