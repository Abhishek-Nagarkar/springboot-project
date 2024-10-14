package com.springproject.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.layer2.Magazine;

@Repository
public interface MagazineRepository extends CrudRepository<Magazine, Integer> {
    
}
