package com.a204.nalda_api.domain.entity;

import com.a204.nalda_api.domain.embedded.FullName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String username;
    private String password;

    @Embedded
    private FullName fullName;
    private LocalDate birthday;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;
}
