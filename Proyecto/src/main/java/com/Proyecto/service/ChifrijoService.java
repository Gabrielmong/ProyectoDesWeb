package com.Proyecto.service;

import com.Proyecto.domain.Chicharronera;
import java.util.List;

public interface ChifrijoService {
    public List<Chicharronera> getChicharronera();
    
    public void save(Chicharronera chicharronera);
    
    public void delete(Chicharronera chicharronera);
    
}
