package com.daniel.finTech.coreBankingService.repository;

import com.daniel.finTech.coreBankingService.model.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

}
