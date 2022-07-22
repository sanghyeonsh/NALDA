package com.a204.nalda.domain.entity.user;

import com.a204.nalda.domain.enumtype.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Terms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "terms_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "term_service")
    private Permission termService;

    @Enumerated(EnumType.STRING)
    @Column(name = "privacy_policy")
    private Permission privacyPolicy;

    @Enumerated(EnumType.STRING)
    @Column(name = "location_based")
    private Permission locationBased;

    @Enumerated(EnumType.STRING)
    @Column(name = "promotional_info")
    private Permission promotionalInfo;

    @OneToOne(mappedBy = "terms")
    private User user;




}
