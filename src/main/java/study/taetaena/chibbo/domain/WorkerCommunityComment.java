package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class WorkerCommunityComment {

    @Id
    @GeneratedValue
    private Long workerCommunityCommentNo;

    private String workerCommunityCommentContent;

    @Enumerated(EnumType.STRING)
    private DelFlag delFlag;

    private LocalDateTime regDate;

    @ManyToOne
    @JoinColumn(name = "member_no")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "worker_community_no")
    private WorkerCommunity workerCommunity;



}
