package com.example.enlectortool.service;

import com.example.enlectortool.model.Lection;
import com.example.enlectortool.repository.LectionRepository;
import com.example.enlectortool.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LectionService {

    private final LectionRepository lectionRepository;
    private final StudentRepository studentRepository;


    public void createLection(String title,String level){
        lectionRepository.save(new Lection(title,level));
    }

    public List<Lection> getAllLections(){
        return lectionRepository.findAll();
    }

}
