package com.hydroqapi.controller;

import com.hydroqapi.services.PowerOutageService;
import com.hydroqapi.models.PowerOutage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/PowerOutage")
public class PowerOutageController {
    @Autowired
    PowerOutageService powerOutageService;
    @GetMapping("/list")
    public List<PowerOutage> list() {
        return powerOutageService.powerOutageList();
    }

    @PostMapping("/save")
    public void save(@RequestBody PowerOutage powerOutage){
        powerOutageService.powerOutageSave(powerOutage);
    }

    @DeleteMapping("/remove/{id}")
    public String delete(@PathVariable Long id){
        if (!powerOutageService.findById(id).isPresent()){
            return "powerOutage not found";
        }
        else {
            powerOutageService.deleteById(id);
            return "deleted";
        }
    }

    @GetMapping("{id}")
    public Optional<PowerOutage> find(@PathVariable Long id){
        return powerOutageService.findById(id);
    }

    @PostMapping("/update/{id}/{time}")
    public String updateById(@PathVariable LocalTime time , @PathVariable Long id) {
        if (!powerOutageService.findById(id).isPresent()) {
            return "powerOutage not found";
        }

        else {
            powerOutageService.updateTime(time,id);
            return "Success - new time : " + time.toString() ;
        }
    }
}
