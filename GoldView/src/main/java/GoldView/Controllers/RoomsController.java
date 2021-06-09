package GoldView.Controllers;

import GoldView.Models.Room;
import GoldView.Services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@CrossOrigin
public class RoomsController {

    @Autowired
    private RoomsService roomsService;

    @GetMapping("/department/{id}") public List<Room> findRoomByDeptNum(@PathVariable int id){
        return this.roomsService.findRoomByDeptNum(id);
    }

    @GetMapping("")
    public List<Room> allRooms(){
        return this.roomsService.getAllrooms();
    }
}
