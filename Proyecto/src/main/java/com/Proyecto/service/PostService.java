package com.Proyecto.service;

import com.Proyecto.domain.Post;
import java.util.List;

public interface PostService {
    public List<Post> getPost();
    
    public void save(Post post);
    
    public void delete(Post post);
    
    public Post getPost(Post post);
}
