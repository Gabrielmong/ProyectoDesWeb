package com.Proyecto.service;

import com.Proyecto.dao.PatiDao;
import com.Proyecto.domain.Pati;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatiServiceImpl implements PatiService{
    
    @Autowired
    private PatiDao patiDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pati> getPati() {
        return (List<Pati>) patiDao.findAll();
    }

    @Override
    @Transactional
    public void save(Pati pati) {
        patiDao.save(pati);
    }

    @Override
    public void delete(Pati pati) {
        patiDao.delete(pati);
    }
    
}
