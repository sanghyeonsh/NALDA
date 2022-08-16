package com.a204.nalda.repository.meal;

import com.a204.nalda.domain.entity.inflightservice.OrdersCodes;
import com.a204.nalda.dto.meal.SeatMealCntDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeatMealCntRepository extends JpaRepository<OrdersCodes,Long> {


    @Query("select new com.a204.nalda.dto.meal.SeatMealCntDto(s.meal.id,count(s.id)) from SeatMeal s where s.flight.id=(select f.id from Flight f where f.flightNum=:flightNum and f.status='PROGRESS') group by s.meal.id")
    List<SeatMealCntDto> findByFlightNumAndMealMenu(@Param("flightNum") String flightNum);

}
