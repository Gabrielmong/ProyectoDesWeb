package com.Proyecto.service;

import com.Proyecto.domain.NovilloAlegre;
import java.util.List;

public interface NovilloAlegreService {
    public List<NovilloAlegre> getNovilloAlegre();
    
    public void save(NovilloAlegre NovilloAlegre);
    
    public void delete(NovilloAlegre NovilloAlegre);
    
}
