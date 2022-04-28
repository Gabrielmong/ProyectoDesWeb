package com.Proyecto.service;

import com.Proyecto.domain.Chifrijo;
import java.util.List;

public interface ChifrijoService {
    public List<Chifrijo> getChifrijo();
    
    public void save(Chifrijo chifrijo);
    
    public void delete(Chifrijo chifrijo);
    
}
