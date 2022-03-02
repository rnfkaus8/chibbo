package study.taetaena.chibbo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter @Setter
public class JobPosting {

    @Id
    @GeneratedValue
    @Column(name = "job_posting_no")
    private Long jobPostingNo;

    private String jobPostingName;

    private String career;

    private String education;

    private int salary;

    private String workCondition;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalDateTime regDate;

    private String worknetUrl;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "company_no")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "job_category_no")
    private JobCategory jobCategory;



}