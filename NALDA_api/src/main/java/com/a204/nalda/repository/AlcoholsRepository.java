package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.customsDeclaration.Alcohols;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlcoholsRepository extends JpaRepository<Alcohols,Long> {
}
