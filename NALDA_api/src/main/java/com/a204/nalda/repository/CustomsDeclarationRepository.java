package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.CustomsDeclaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomsDeclarationRepository extends JpaRepository<CustomsDeclaration,Long> {


}
