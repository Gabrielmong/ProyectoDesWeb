package com.Proyecto.service;

import com.Proyecto.domain.Pati;
import java.util.List;

public interface PatiService {
    public List<Pati> getPati();
    
    public void save(Pati pati);
    
    public void delete(Pati pati);
    
    public Pati getPati(Pati pati);
}
