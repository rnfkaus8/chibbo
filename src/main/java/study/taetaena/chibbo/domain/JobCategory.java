package study.taetaena.chibbo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter @Setter
public class JobCategory {

    @Id
    @GeneratedValue
    @Column(name = "job_category_no")
    private Long JobCategoryNo;

    private String jobCategoryName;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_job_category_no")
    private JobCategory parent;

    @OneToMany(mappedBy = "parent")
    private List<JobCategory> child = new ArrayList<>();

    @OneToMany(mappedBy = "jobCategory")
    private List<JobPosting> jobPostings = new ArrayList<>();

    public void addChildJobCategory(JobCategory child){
        this.child.add(child);
        child.setParent(this);

    }
}
