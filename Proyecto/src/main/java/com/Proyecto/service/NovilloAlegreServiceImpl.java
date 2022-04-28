package com.Proyecto.service;

import com.Proyecto.dao.NovilloAlegreDao;
import com.Proyecto.domain.NovilloAlegre;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NovilloAlegreServiceImpl implements NovilloAlegreService{
    
    @Autowired
    private NovilloAlegreDao NovilloAlegreDao;

    @Override
    @Transactional(readOnly = true)
    public List<NovilloAlegre> getNovilloAlegre() {
        return (List<NovilloAlegre>) NovilloAlegreDao.findAll();
    }

    @Override
    @Transactional
    public void save(NovilloAlegre NovilloAlegre) {
        NovilloAlegreDao.save(NovilloAlegre);
    }

    @Override
    public void delete(NovilloAlegre NovilloAlegre) {
        NovilloAlegreDao.delete(NovilloAlegre);
    }
    
    
}