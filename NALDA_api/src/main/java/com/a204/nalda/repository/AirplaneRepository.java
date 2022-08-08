package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane,Long> {

    Airplane findByAirplaneKind(String airplaneKind);
}
