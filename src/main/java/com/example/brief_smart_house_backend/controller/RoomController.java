package com.example.brief_smart_house_backend.controller;

import com.example.brief_smart_house_backend.entities.Room;
import com.example.brief_smart_house_backend.entities.User;
import com.example.brief_smart_house_backend.services.RoomService.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Room/")

public class RoomController {

    @Autowired
    IRoomService roomService;


    @GetMapping("/")
    public ResponseEntity<List<Room>> getAll( ){
        List<Room> rooms = roomService.getAll();
        return new ResponseEntity<List<Room>>(rooms, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Room> save(@RequestBody Room room) {
        Room rm = roomService.AddRoom(room);
        return new ResponseEntity<Room>(rm, HttpStatus.CREATED);
    }



    @PutMapping("/update")
    public ResponseEntity<Room> UpdateRoom(@RequestBody Room room){
        Room rev = roomService.UpdateRoom(room);
        return ResponseEntity.ok(rev);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRoom(@PathVariable long id) {
        boolean deleted = roomService.deleteRoom(id);
        return new ResponseEntity<String>("{\"Room\":\"" + id + "\",\"deleted\":\"" + deleted + "\"}", HttpStatus.OK);

    }




}
