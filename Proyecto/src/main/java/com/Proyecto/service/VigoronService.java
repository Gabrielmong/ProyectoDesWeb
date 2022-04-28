package com.Proyecto.service;

import com.Proyecto.domain.Tacosconrepollo;
import com.Proyecto.domain.Vigoron;
import java.util.List;

public interface VigoronService {
    public List<Vigoron> getVigoron();
    
    public void save(Vigoron vigoron);
    
    public void delete(Vigoron vigoron);
    
    public Vigoron getVigoron(Vigoron vigoron);
}