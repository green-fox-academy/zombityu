package com.myproject.reddit.repository;

import com.myproject.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post,Long> {

  Post findById(Integer id);
}
