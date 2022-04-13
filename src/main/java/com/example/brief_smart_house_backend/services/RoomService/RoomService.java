package com.example.brief_smart_house_backend.services.RoomService;

import com.example.brief_smart_house_backend.entities.Room;
import com.example.brief_smart_house_backend.entities.User;
import com.example.brief_smart_house_backend.repository.RoomRepository;
import com.example.brief_smart_house_backend.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService {

    @Autowired
    RoomRepository roomRepository;
    @Autowired
    SequenceGeneratorService sequenceGenerator;

    @Override
    public List<Room> getAll() {
        List<Room> rooms = roomRepository.findAll();
        return rooms;
    }

    @Override
    public Room AddRoom(Room room) {
        room.setId(sequenceGenerator.generateSequence(Room.SEQUENCE_NAME));
        Room rm= roomRepository.save(room);
        return rm;
    }


    @Override
    public Room UpdateRoom(Room room) {
        Room rm= roomRepository.save(room);
        return rm;
    }

    @Override
    public boolean deleteRoom(long id) {
        try {
            roomRepository.deleteById(id);
        }catch (Exception ex){
            return false;
        }
        return true;
    }


}


