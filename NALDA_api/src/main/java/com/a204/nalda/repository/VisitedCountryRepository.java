package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitedCountryRepository extends JpaRepository<VisitedCountry,Long> {
}
