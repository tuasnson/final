package com.se2_project.group12.demoEBanking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se2_project.group12.demoEBanking.Model.NationalBank;

@Repository
public interface NationalBankRepository extends JpaRepository<NationalBank, Integer> {

}
