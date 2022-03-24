package com.Proyecto.dao;

import com.Proyecto.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long>{
    
}
