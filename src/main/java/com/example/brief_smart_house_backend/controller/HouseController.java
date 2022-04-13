package com.example.brief_smart_house_backend.controller;

import com.example.brief_smart_house_backend.entities.House;
import com.example.brief_smart_house_backend.entities.Room;
import com.example.brief_smart_house_backend.services.HouseService.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/House/")

public class HouseController {

    @Autowired
    IHouseService houseService;


    @GetMapping("/")
    public ResponseEntity<List<House>> getAll( ){
        List<House> houses = houseService.getAll();
        return new ResponseEntity<List<House>>(houses, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<House> save(@RequestBody House house) {
        House hse = houseService.AddHouse(house);
        return new ResponseEntity<House>(hse, HttpStatus.CREATED);
    }



    @PutMapping("/update")
    public ResponseEntity<House> UpdateHouse(@RequestBody House house){
        House hse = houseService.UpdateHouse(house);
        return ResponseEntity.ok(hse);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteHouse(@PathVariable long id) {
        boolean deleted = houseService.deleteHouse(id);
        return new ResponseEntity<String>("{\"House\":\"" + id + "\",\"deleted\":\"" + deleted + "\"}", HttpStatus.OK);

    }
}
