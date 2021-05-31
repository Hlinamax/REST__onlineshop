package com.vsrpp.onlineshop.service.impl;

import com.vsrpp.onlineshop.entity.Edelivery;
import com.vsrpp.onlineshop.repository.EdeliveryRepository;
import com.vsrpp.onlineshop.service.EdeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EdeliveryServiceImpl implements EdeliveryService {
    @Autowired
    EdeliveryRepository edeliveryRepository;

    @Override
    public Edelivery findByName(String name) {
        return edeliveryRepository.findEdeliveryByName(name);
    }

    @Override
    public void save(Edelivery edelivery) {
        edeliveryRepository.save(edelivery);
    }

    @Override
    public List<Edelivery> findAll() {
        return edeliveryRepository.findAll();
    }

    @Override
    public Edelivery findById(Long id) {
        return edeliveryRepository.findEdeliveryById(id);
    }

    @Override
    public void delete(Long id) {
        edeliveryRepository.deleteById(id);
    }
}


