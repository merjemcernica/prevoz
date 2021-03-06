package com.example.demo.services;

import com.example.demo.models.Clock;
import com.example.demo.models.User;
import com.example.demo.repositories.ClockRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClockService {
    @Autowired
    private ClockRepository clockRepository;

    public List<Clock> findAll() {
        return clockRepository.findAll();
    }

    public Optional<Clock> find(final long id) {
        return clockRepository.findById(id);
    }

    public void create(final Clock clock) {
        clockRepository.save(clock);
    }

    public void update(final Clock clock) {
        Clock update = clockRepository.findById(clock.getClockId()).orElseThrow();
        update.setTramId(clock.getTramId());
        update.setTrolleyId(clock.getTrolleyId());
        update.setBusId(clock.getBusId());
        update.setMinibussId(clock.getMinibussId());
        update.setTime(clock.getTime());
        clockRepository.save(clock);
    }

    public void delete(final long id) {
        clockRepository.findById(id).orElseThrow();
        clockRepository.deleteById(id);
    }

}