package com.a204.nalda.domain.entity;

import com.a204.nalda.domain.embedded.FullName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;
    private String password;

    @Embedded
    private FullName fullName;
    private LocalDate birthday;

    @OneToOne(fetch = LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "terms_id")
    private Terms terms;

    private String userRole;
    public List<String> getRoleList() {
        if(this.userRole.length() > 0 ) {
            return Arrays.asList(this.userRole.split(","));
        }
        return new ArrayList<>();
    }
}
