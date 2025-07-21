package com.example.caution.repository;

import com.example.caution.domain.CautionQa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CautionQaRepository extends JpaRepository<CautionQa, Long> {
    List<CautionQa> findByChainType(String chainType);
    List<CautionQa> findByChainTypeAndIsVisible(String chainType, String isVisible);
}
