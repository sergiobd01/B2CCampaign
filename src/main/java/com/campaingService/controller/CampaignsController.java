package com.campaingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.campaingService.model.Campaign;
import com.campaingService.repository.CampaignRepository;


@RestController
@CrossOrigin(origins = "*")
public class CampaignsController {
	
	@Autowired
    CampaignRepository campaignRepository;
	

    @RequestMapping(
    	      value = "/findCampaign",
    	      method = RequestMethod.GET,
    	      produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Campaign> findOrder() {

    	List<Campaign> CampaignResult =  campaignRepository.findByCampaign();
    	
    	return CampaignResult;
    }
}
