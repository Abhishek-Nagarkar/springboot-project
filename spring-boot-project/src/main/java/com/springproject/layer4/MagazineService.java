package com.springproject.layer4;


import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.layer2.Magazine;

@Service
public interface MagazineService {
    // create
    void addMagazine(Magazine magazine);
    // read single
    Magazine findMagazine(int magId);
    // read all
    List<Magazine> findAllMagazines();
    // update 
    void updateMagazine(Magazine magazine);
    // delete
    void deleteMagazine(int magId);
}
