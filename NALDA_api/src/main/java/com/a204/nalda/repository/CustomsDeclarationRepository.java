package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.customsDeclaration.CustomsDeclaration;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.customdeclaration.DeclarationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomsDeclarationRepository extends JpaRepository<CustomsDeclaration,Long> {

//    @Query("select c from CustomsDeclaration c inner join c.user u on u.username = :username")
//    List<DeclarationDTO> findByUsername(String username);

    @Query("select c from CustomsDeclaration c join fetch c.user u join fetch c.alcohols join fetch c.visitedCountries join fetch c.etcExceeds where u.username = :username")
    List<CustomsDeclaration> findByUsername(String username);


}
