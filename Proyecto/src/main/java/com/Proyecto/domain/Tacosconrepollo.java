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
@Table(name = "TacosConRepollo")
public class Tacosconrepollo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTacosconrepollo;
    private String ingrediente;
    private int cantidad;
    
    
    public Tacosconrepollo() {
        
    }

    public Tacosconrepollo(Long idTacosconrepollo, String ingrediente, int cantidad) {
        this.idTacosconrepollo = idTacosconrepollo;
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
      
    }
    
}