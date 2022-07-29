package com.a204.nalda.domain.entity.inflightservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ToiletLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toilet_log_id")
    private Long id;
    private LocalDateTime time;
    private int used;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "toilet_id")
    private Toilet toilet;

}
