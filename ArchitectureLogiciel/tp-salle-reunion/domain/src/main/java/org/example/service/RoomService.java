package org.example.service;

import org.example.entity.Person;
import org.example.entity.Room;
import org.example.port.RoomRepository;

import java.util.List;

public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public void createRoom(String name, int capacity, Person person ) {
         if (isPersonAdmin(person)) {
            Room room = new Room.Builder()
                    .name(name)
                    .capacity(capacity)
                    .build();
        } throw new RuntimeException ("Vous n'êtes pas administrateur!");
        }

        public void delete ( Person person, long id){
        Room room = roomRepository.findById(id);
if (!isPersonAdmin(person)){
    throw new RuntimeException("Vous n'êtes pas administrateur!");
}else if (room == null){
    throw new RuntimeException("Cette salle de réunion n'existe pas!");
}roomRepository.delete(room);
        }

        public Room findById ( long id){

            return null;
        }

        public List<Room> getAll(){
            return null;
        }
        public boolean isPersonAdmin(Person person){
            return person.isAdmin();
        }
    }
