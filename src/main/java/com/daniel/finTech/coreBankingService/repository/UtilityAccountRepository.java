package com.daniel.finTech.coreBankingService.repository;

import com.daniel.finTech.coreBankingService.model.entity.UtilityAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity, Long> {
   Optional<UtilityAccountEntity> findByProviderName(String provider);
}
