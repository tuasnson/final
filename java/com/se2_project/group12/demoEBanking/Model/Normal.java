package com.se2_project.group12.demoEBanking.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table
@Entity
@PrimaryKeyJoinColumn(name = "normalId")
public class Normal extends Account {
	
	
	@Column
	private String identityCard;

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	
}
