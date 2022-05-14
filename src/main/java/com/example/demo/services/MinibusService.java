package com.example.demo.services;

import com.example.demo.models.Minibus;
import com.example.demo.repositories.MinibusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MinibusService {
    @Autowired
    private MinibusRepository minibussRepository;

    public List<Minibus> findAll() {
        return minibussRepository.findAll();
    }

    public Optional<Minibus> find(final long id) {
        return minibussRepository.findById(id);
    }

    public void create(final Minibus minibuss) {
        minibussRepository.save(minibuss);
    }

    public void update(final Minibus minibuss) {
        Minibus update = minibussRepository.findById(minibuss.getMinibussId()).orElseThrow();
        update.setNumber(minibuss.getNumber());
        update.setStartStation(minibuss.getStartStation());
        update.setEndStation(minibuss.getEndStation());
        minibussRepository.save(minibuss);
    }

    public void delete(final long id) {
        minibussRepository.findById(id).orElseThrow();
        minibussRepository.deleteById(id);
    }

}