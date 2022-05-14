package com.example.demo.controllers;

import com.example.demo.models.Tram;
import com.example.demo.models.User;
import com.example.demo.services.TramServices;
import com.example.demo.services.UserService;
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
@RequestMapping("/trams")
public class TramController {
    @Autowired
    private TramServices tramService;

    @GetMapping("")
    public List<Tram> getAllTrams() {
        return tramService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tram> getTramById(@PathVariable(value = "id") final long tramID) {
        return tramService.find(tramID);
    }

    @PostMapping("")
    public void createTram(@RequestBody final Tram tram) {
        tramService.create(tram);
    }


    @PutMapping("/{id}")
    public void updateTram(@PathVariable(value = "id") final long tramID,
                           @RequestBody final Tram tram) {
        tramService.update(tram);
    }


    @DeleteMapping("/{id}")
    public void deleteTram(@PathVariable(value = "id") final long tramID) {
        tramService.delete(tramID);
    }
}
