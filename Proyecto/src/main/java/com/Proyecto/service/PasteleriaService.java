package com.Proyecto.service;

import com.Proyecto.domain.Pasteleria;
import java.util.List;

public interface PasteleriaService {
    public List<Pasteleria> getPasteleria();
    
    public void save(Pasteleria Pasteleria);
    
    public void delete(Pasteleria Pasteleria);
    
}
