package com.daniel.finTech.coreBankingService.repository;

import com.daniel.finTech.coreBankingService.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserRepository> findByIdentificationNumber(String identificationNumber);
}
