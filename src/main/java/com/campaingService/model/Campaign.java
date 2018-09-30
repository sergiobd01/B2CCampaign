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
	private Long name;
	
	@Column(name = "IDSTATECAMPAIGN")
	private Long idStateCampaign;

	@Column(name = "URLIMAGE")
	private Long urlImage;
	
	@Column(name = "DESCRIPTION")
	private Long description;
	
	@Column(name = "IDPRODUCT")
	private Date idProduct;
	
	@Column(name = "STARTDATE")
	private Date startDate;
	
	@Column(name = "ENDDATE")
	private Date endDate;
	
	public Campaign() {
	
	}

	public Campaign(Long idCampaign, Long name, Long idStateCampaign, Long urlImage, Long description, Date idProduct,
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

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	public Long getIdStateCampaign() {
		return idStateCampaign;
	}

	public void setIdStateCampaign(Long idStateCampaign) {
		this.idStateCampaign = idStateCampaign;
	}

	public Long getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(Long urlImage) {
		this.urlImage = urlImage;
	}

	public Long getDescription() {
		return description;
	}

	public void setDescription(Long description) {
		this.description = description;
	}

	public Date getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Date idProduct) {
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
