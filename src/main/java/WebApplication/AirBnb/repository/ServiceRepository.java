package WebApplication.AirBnb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Services;
@Repository
public interface ServiceRepository extends JpaRepository<Services, Long>{
	/*
	 * @Query("SELECT service.serviceName from RoomTypeInfos roomTypeInfo join roomTypeInfo.lstServiceDetails serviceDetails join serviceDetails.service service WHERE roomTypeInfo.roomTypeInfoId = :roomTypeInfoId"
	 * ) List<String> getServiceNameByRoomTypeInfoId(@Param("roomTypeInfoId") long
	 * roomTypeInfoId);
	 */
	
	@Query(value = "select s.service_name from room_type_infos as r, service_details as sd, services as s where r.room_type_info_id = sd.room_type_info_room_type_info_id and sd.service_service_id = s.service_id and r.room_type_info_id = ?1", nativeQuery = true)
	List<String> getServiceNameByRoomTypeInfoId(long roomTypeInfoId);
}


