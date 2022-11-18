package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class WorkerCommunity {

    @Id
    @GeneratedValue
    private Long workerCommunityNo;

    private String workerCommunityTitle;

    private String workerCommunityContent;

    private int workerCommunityLikeCnt;

    private LocalDateTime regDate;

    @ManyToOne
    @JoinColumn(name = "member_no")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "company_no")
    private Company company;

    @OneToMany(mappedBy = "workerCommunity", cascade = CascadeType.ALL)
    private List<WorkerCommunityComment> workerCommunityComments = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private DelFlag delFlag;

}
