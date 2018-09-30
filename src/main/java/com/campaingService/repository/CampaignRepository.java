package com.campaingService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;

import com.campaingService.model.Campaign;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long>  {
	
	public List<Campaign> findByidCampaign(Long idCampaign);

}
