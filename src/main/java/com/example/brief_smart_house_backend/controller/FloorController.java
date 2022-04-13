package com.example.brief_smart_house_backend.controller;

import com.example.brief_smart_house_backend.entities.Floor;
import com.example.brief_smart_house_backend.services.FloorService.IFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Floor/")

public class FloorController {

    @Autowired
    IFloorService floorService;

    @GetMapping("/")
    public ResponseEntity<List<Floor>> getAll( ){
        List<Floor> floors = floorService.getAll();
        return new ResponseEntity<List<Floor>>(floors, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Floor> save(@RequestBody Floor floor) {
        Floor flr = floorService.AddFloor(floor);
        return new ResponseEntity<Floor>(flr, HttpStatus.CREATED);
    }



    @PutMapping("/update")
    public ResponseEntity<Floor> UpdateFloor(@RequestBody Floor floor){
        Floor flr = floorService.UpdateFloor(floor);
        return ResponseEntity.ok(flr);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFloor(@PathVariable long id) {
        boolean deleted = floorService.deleteFloor(id);
        return new ResponseEntity<String>("{\"Floor\":\"" + id + "\",\"deleted\":\"" + deleted + "\"}", HttpStatus.OK);

    }
}
