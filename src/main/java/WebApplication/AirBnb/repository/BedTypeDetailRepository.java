package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.RoomTypeDetails;
import WebApplication.AirBnb.domain.BedTypeId;


@Repository
public interface BedTypeDetailRepository extends JpaRepository<RoomTypeDetails, BedTypeId>{

}
