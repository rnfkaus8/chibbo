package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_no")
    private Long no;

    private String memberNickname;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "work_company_no")
    private Company workCompany;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "interest_company_no")
    private Company interestCompany;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "job_category_no")
    private JobCategory interestJobCategory;

    @Enumerated(EnumType.STRING)
    private MemberStatus isWorker;

    private String loginAuthKey;

    private LocalDateTime regDate;

    private String email;

    @Enumerated(EnumType.STRING)
    private DelFlag delFlag;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<WorkerCommunity> workerCommunities;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<WorkerCommunityComment> workerCommunityComments;




}

