package GoldView.Repositories;

import GoldView.Models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomsRepository extends JpaRepository<Room, Integer> {

    Room findByDepartment_Id(Integer deptnum);
}
