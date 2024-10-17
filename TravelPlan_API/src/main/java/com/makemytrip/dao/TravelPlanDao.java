package com.makemytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makemytrip.entity.TravelPlan;

public interface TravelPlanDao extends JpaRepository<TravelPlan, Long>{

}
