package com.example.brief_smart_house_backend.controller;

import com.example.brief_smart_house_backend.entities.Device;
import com.example.brief_smart_house_backend.entities.Floor;
import com.example.brief_smart_house_backend.services.DeviceService.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Device/")
public class DeviceController {

    @Autowired
    IDeviceService deviceService;

    @GetMapping("/")
    public ResponseEntity<List<Device>> getAll( ){
        List<Device> devices = deviceService.getAll();
        return new ResponseEntity<List<Device>>(devices, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Device> save(@RequestBody Device device) {
        Device df = deviceService.AddDevie(device);
        return new ResponseEntity<Device>(df, HttpStatus.CREATED);
    }



    @PutMapping("/update")
    public ResponseEntity<Device> UpdateFloor(@RequestBody Device device){
        Device dft = deviceService.UpdateDevice(device);
        return ResponseEntity.ok(dft);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFloor(@PathVariable long id) {
        boolean deleted = deviceService.deleteDevice(id);
        return new ResponseEntity<String>("{\"Device\":\"" + id + "\",\"deleted\":\"" + deleted + "\"}", HttpStatus.OK);

    }
}
