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
public class Subway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subway_id")
    private Long id;

    private String name;

    private LocalDateTime time;

    private String end;

    @Column(name = "day_code")
    private String dayCode;

}
