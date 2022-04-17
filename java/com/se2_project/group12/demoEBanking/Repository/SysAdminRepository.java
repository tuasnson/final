package com.se2_project.group12.demoEBanking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se2_project.group12.demoEBanking.Model.SysAdmin;

@Repository
public interface SysAdminRepository extends JpaRepository<SysAdmin, Integer> {

}
