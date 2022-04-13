package com.example.brief_smart_house_backend.services.FloorService;

import com.example.brief_smart_house_backend.entities.Floor;

import java.util.List;

public interface IFloorService {
    Floor AddFloor(Floor floor);
    Floor UpdateFloor(Floor  floor);
    boolean deleteFloor(long id);
    List<Floor> getAll();

}
