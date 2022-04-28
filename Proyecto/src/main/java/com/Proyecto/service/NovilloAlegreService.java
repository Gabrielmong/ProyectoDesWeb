package com.Proyecto.service;

import com.Proyecto.domain.NovilloAlegre;
import java.util.List;

public interface NovilloAlegreService {
    public List<NovilloAlegre> getNovilloAlegre();
    
    public void save(NovilloAlegre novilloAlegre);
    
    public void delete(NovilloAlegre novilloAlegre);
    
    public NovilloAlegre getNovilloAlegre(NovilloAlegre galloPinto);
    
}
