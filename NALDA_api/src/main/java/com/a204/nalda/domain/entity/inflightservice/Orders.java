package com.a204.nalda.domain.entity.inflightservice;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.enumtype.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "complete_time")
    private LocalDateTime completeTime;


    @OneToMany(mappedBy = "orderCode",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdersCodes> ordersCodes = new ArrayList<>();

    public void addOrdersCode(OrdersCodes ordersCodes) {
        this.ordersCodes.add(ordersCodes);
        ordersCodes.changeOrder(this);
    }

    public void changeStatusInfo(Status status){
        this.status = status;
    }


}
