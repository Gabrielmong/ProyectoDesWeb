package com.Proyecto.service;

import com.Proyecto.domain.ArrozConLeche;
import java.util.List;

public interface ArrozConLecheService {
    public List<ArrozConLeche> getArrozConLeche();
    
    public void save(ArrozConLeche arrozConLeche);
    
    public void delete(ArrozConLeche arrozConLeche);
    
    public ArrozConLeche getArrozConLeche(ArrozConLeche arrozConLeche);
    
}
