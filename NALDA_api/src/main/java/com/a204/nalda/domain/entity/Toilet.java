package com.a204.nalda.domain.entity;

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
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toilet_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @Column(name = "toilet_code")
    private String toiletCode;

    private LocalDateTime time;

    public void changeAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
