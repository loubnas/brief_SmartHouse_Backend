package com.example.brief_smart_house_backend.services.RoomService;

import com.example.brief_smart_house_backend.entities.Room;

import java.util.List;

public interface IRoomService {
    Room AddRoom(Room room);
    Room UpdateRoom(Room room);
    boolean deleteRoom(long id);
    List<Room> getAll();


}
