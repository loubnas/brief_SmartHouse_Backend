package com.example.brief_smart_house_backend.services.FloorService;

import com.example.brief_smart_house_backend.entities.Floor;
import com.example.brief_smart_house_backend.entities.House;
import com.example.brief_smart_house_backend.entities.Room;
import com.example.brief_smart_house_backend.repository.FloorRepository;
import com.example.brief_smart_house_backend.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService implements IFloorService{
    @Autowired
    FloorRepository floorRepository;

    @Autowired
    SequenceGeneratorService sequenceGenerator;


    @Override
    public List<Floor> getAll() {
        List<Floor> floors = floorRepository.findAll();
        return floors;
    }

    @Override
    public Floor AddFloor(Floor floor) {
        floor.setId(sequenceGenerator.generateSequence(Floor.SEQUENCE_NAME));
        Floor flr= floorRepository.save(floor);
        return flr;
    }

    @Override
    public Floor UpdateFloor(Floor floor) {
        Floor flr = floorRepository.save(floor);
        return flr;
    }

    @Override
    public boolean deleteFloor(long id) {
        try {
            floorRepository.deleteById(id);
        }catch (Exception ex){
            return false;
        }
        return true;


    }


}
