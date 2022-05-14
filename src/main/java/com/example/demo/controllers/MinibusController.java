package com.example.demo.controllers;

import com.example.demo.models.Minibus;
import com.example.demo.services.MinibusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/minibusses")
public class MinibusController {
    @Autowired
    private MinibusService minibusService;

    @GetMapping("")
    public List<Minibus> getAllMinibusses() {
        return minibusService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Minibus> getMinibussById(@PathVariable(value = "id") final long minibussID) {
        return minibusService.find(minibussID);
    }

    @PostMapping("")
    public void createMinibuss(@RequestBody final Minibus minibuss) {
        minibusService.create(minibuss);
    }


    @PutMapping("/{id}")
    public void updateMinibuss(@PathVariable(value = "id") final long minibussID,
                               @RequestBody final Minibus minibuss) {
        minibusService.update(minibuss);
    }


    @DeleteMapping("/{id}")
    public void deleteMinibuss(@PathVariable(value = "id") final long minibussID) {
        minibusService.delete(minibussID);
    }
}