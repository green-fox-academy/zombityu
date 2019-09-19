package com.greenfox.demo.Repository;

import com.greenfox.demo.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepo extends CrudRepository<Log,Integer> {

  List<Log> findAll();

}
