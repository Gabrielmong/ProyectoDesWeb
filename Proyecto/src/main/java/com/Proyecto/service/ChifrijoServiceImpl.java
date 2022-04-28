package com.Proyecto.service;

import com.Proyecto.dao.ChifrijoDao;
import com.Proyecto.domain.Chifrijo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChifrijoServiceImpl implements ChifrijoService{
    
    @Autowired
    private ChifrijoDao chifrijoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Chifrijo> getChifrijo() {
        return (List<Chifrijo>) chifrijoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Chifrijo chifrijo) {
        chifrijoDao.save(chifrijo);
    }

    @Override
    public void delete(Chifrijo chifrijo) {
        chifrijoDao.delete(chifrijo);
    }
    
}
