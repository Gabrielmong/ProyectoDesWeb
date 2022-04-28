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
@Table(name = "Chicharronera")
public class Chicharronera implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String platos;
    private Long id;
    private String ubicacion;
    
    
    public Chicharronera() {
        
    }

    public Chicharronera(String platos, Long ID, String ubicacion) {
        this.platos = platos;
        this.id = ID;
        this.ubicacion = ubicacion;
      
    }
    
}