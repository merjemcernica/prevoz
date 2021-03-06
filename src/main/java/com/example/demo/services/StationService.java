package com.example.demo.services;

import com.example.demo.models.Station;
import com.example.demo.models.User;
import com.example.demo.repositories.StationRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StationService {
    @Autowired
    private StationRepository stationRepository;

    public List<Station> findAll() {
        return stationRepository.findAll();
    }

    public Optional<Station> find(final long id) {
        return stationRepository.findById(id);
    }

    public void create(final Station station) {
        stationRepository.save(station);
    }

    public void update(final Station station) {
        Station update = stationRepository.findById(station.getStationId()).orElseThrow();
        update.setTramId(station.getTramId());
        update.setBusId(station.getBusId());
        update.setMinibussId(station.getMinibussId());
        update.setTrolleyId(station.getTrolleyId());
        update.setName(station.getName());

        stationRepository.save(station);
    }

    public void delete(final long id) {
        stationRepository.findById(id).orElseThrow();
        stationRepository.deleteById(id);
    }

}