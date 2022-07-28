package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.customsDeclaration.CustomsDeclaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomsDeclarationRepository extends JpaRepository<CustomsDeclaration,Long> {

//    @Query("select c from CustomsDeclaration c inner join c.user u on u.username = :username")
//    List<DeclarationDTO> findByUsername(String username);

    @Query("select c from CustomsDeclaration c join fetch c.user u where u.username = :username")
    List<CustomsDeclaration> findByUsername(String username);

    Optional<CustomsDeclaration> findById(Long id);


}
