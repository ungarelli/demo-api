package com.example.demoapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoapi.model.State;
import com.example.demoapi.repository.StateRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StateService {

    private StateRepo repository;

    public State save(State state) {
        return repository.save(state);
    }

    public List<State> findAll() {
        return repository.findAll();
    }
    
    public void delete(Long id) {
    	repository.deleteById(id);
    }

}
