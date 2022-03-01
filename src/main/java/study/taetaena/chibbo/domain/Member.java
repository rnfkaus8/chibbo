package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_no")
    private Long no;

    private String memberNickname;

//    @ManyToOne
//    @JoinColumn(name = "company_no")
//    private Company interestCompany;

//    @ManyToOne
//    @JoinColumn(name = "job_large_no")
//    private Long jobLargeNo;
//
//    @ManyToOne
//    @JoinColumn(name = "job_small_no")
//    private Long jobSmallNo;

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

