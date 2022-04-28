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
@Table(name = "NovilloAlegre")
public class NovilloAlegre implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String plato;
    private Long idPlato;
    private String ubicacion;
    
    
    public NovilloAlegre() {
        
    }

    public NovilloAlegre(String plato, Long ID, String ubicacion) {
        this.plato = plato;
        this.idPlato = ID;
        this.ubicacion = ubicacion;
      
    }
    
}