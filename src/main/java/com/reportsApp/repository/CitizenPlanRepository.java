package com.reportsApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reportsApp.entities.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Long>{
	
	@Query("select distinct(planeName) from CitizenPlan")
	public List<String> getPlanName();
	
	
	@Query("select distinct(planStatus) from CitizenPlan")
	public List<String> getPlanStatus();
	
	
}
 