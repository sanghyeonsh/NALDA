package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.user.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

    @Query("select d from UserDetail d inner join User u on d.id = u.userDetail.id where u.username = :username")
    UserDetail findByUsername(@Param("username") String username);

}
