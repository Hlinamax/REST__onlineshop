package com.vsrpp.onlineshop.controller;

import com.vsrpp.onlineshop.entity.Edelivery;
import com.vsrpp.onlineshop.service.EdeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EdeliveryController {
    @Qualifier("edeliveryServiceImpl")
    @Autowired
    EdeliveryService edeliveryService;

    @RequestMapping(value = "/edelivery/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Edelivery> getEdeliveryById(@PathVariable("id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Edelivery edelivery = edeliveryService.findById(id);
        if (edelivery == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(edelivery, HttpStatus.OK);
    }

    @RequestMapping(value = "/edelivery", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Edelivery> addEdelivery(@RequestBody Edelivery edelivery) {
        HttpHeaders headers = new HttpHeaders();
        if (edelivery == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.edeliveryService.save(edelivery);
        return new ResponseEntity<>(edelivery, headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/edelivery/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Edelivery> deleteEdelivery(@PathVariable("id") Long id) {
        Edelivery edelivery = edeliveryService.findById(id);
        if (edelivery == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.edeliveryService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/edeliverys", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Edelivery>> getAllEdeliverys() {
        List<Edelivery> edeliverys = this.edeliveryService.findAll();

        if (edeliverys.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(edeliverys, HttpStatus.OK);
    }
}