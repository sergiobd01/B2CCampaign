package com.campaingService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CAMPAIGN")
public class Campaign {


	@Id
	@Column(name = "IDCAMPAIGN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCampaign;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "IDSTATECAMPAIGN")
	private Long idStateCampaign;

	@Column(name = "URLIMAGE")
	private String urlImage;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "IDPRODUCT")
	private Long idProduct;
	
	@Column(name = "STARTDATE")
	private Date startDate;
	
	@Column(name = "ENDDATE")
	private Date endDate;
	
	public Campaign() {
	
	}

	public Campaign(Long idCampaign, String name, Long idStateCampaign, String urlImage, String description, Long idProduct,
			Date startDate, Date endDate) {
		this.idCampaign = idCampaign;
		this.name = name;
		this.idStateCampaign = idStateCampaign;
		this.urlImage = urlImage;
		this.description = description;
		this.idProduct = idProduct;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getIdCampaign() {
		return idCampaign;
	}

	public void setIdCampaign(Long idCampaign) {
		this.idCampaign = idCampaign;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdStateCampaign() {
		return idStateCampaign;
	}

	public void setIdStateCampaign(Long idStateCampaign) {
		this.idStateCampaign = idStateCampaign;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
