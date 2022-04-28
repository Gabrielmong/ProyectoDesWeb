package com.Proyecto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "GalloPinto")
public class GalloPinto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ingrediente;
    private int cantidad;
    
    
    public GalloPinto() {
        
    }

    public GalloPinto(Long id, String ingrediente, int cantidad) {
        this.id = id;
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
      
    }
    
}