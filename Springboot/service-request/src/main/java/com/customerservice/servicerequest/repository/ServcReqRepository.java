package com.customerservice.servicerequest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customerservice.servicerequest.entity.ServcReqEntity;

@Repository
public interface ServcReqRepository extends JpaRepository<ServcReqEntity, Integer>{
	
	
	@Query("select D from ServcReqEntity D where D.customerId=:id")
	List<ServcReqEntity> findReqByCustId(int id);

	@Query("select D from ServcReqEntity D where D.customerId=:id and D.reqStatus=:status")
	List<ServcReqEntity> findReqByStatus(int id, String status);

	@Query("select D from ServcReqEntity D where D.customerId=:customerId and D.reqId=:reqId")
	Optional<ServcReqEntity> fetchRequest(int customerId, int reqId);

}
