package com.a204.nalda.domain.entity.airplane;

import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.enumtype.Status;
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
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @Column(name = "flight_date")
    private LocalDateTime flightDate;

    @Column(name = "flight_num")
    private String flightNum;

    @Enumerated(EnumType.STRING)
    private Status status;

    public void changeStatusInfo(Status status){
        this.status = status;
    }
}
