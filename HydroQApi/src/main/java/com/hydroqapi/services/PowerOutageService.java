package com.hydroqapi.services;

import com.hydroqapi.Repository.PowerOutageRepository;
import com.hydroqapi.models.PowerOutage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class PowerOutageService {

    @Autowired
    PowerOutageRepository powerOutageRepository;

    public PowerOutage powerOutageSave(PowerOutage powerOutage){
        return powerOutageRepository.save(powerOutage);
    }
    public List<PowerOutage> powerOutageList(){
        return powerOutageRepository.findAll();
    }
    public Optional<PowerOutage> findById(Long id){
        return powerOutageRepository.findById(id);
    }
    public void updateTime(LocalTime localTime , Long id){
        PowerOutage newPowerOutage = powerOutageRepository.findById(id).get();
        newPowerOutage.setUpdateTime(localTime);
    }
    public void deleteById(Long id){
        powerOutageRepository.deleteById(id);
    }


}
