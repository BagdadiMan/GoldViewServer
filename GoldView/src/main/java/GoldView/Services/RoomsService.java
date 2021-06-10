package GoldView.Services;

import GoldView.Models.Patient;
import GoldView.Models.Room;
import GoldView.Repositories.PatientsRepository;
import GoldView.Repositories.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsService {

    @Autowired
    private RoomsRepository roomsRepository;

    @Autowired
    private PatientsRepository patientsRepository;

    public List<Room> findRoomByDeptNum(int id){
        return this.roomsRepository.findByDepartment_Id(id);
    }

    public List<Room> getAllrooms(){
        return this.roomsRepository.findAll();
    }

//    public Integer countFreeBedsInRoom(Room room){
//        return room.bedsCount() - this.patientsRepository.countByRoom_IdAndRelease_DateIsNotNull(room.id());
//    }
}
