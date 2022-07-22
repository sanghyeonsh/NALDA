package com.a204.nalda.domain.entity.inflightservice;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Long id;

    @Column(name = "order_time")
    private LocalDateTime orderTime;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Column(name = "order_message")
    private String orderMessage;


}
