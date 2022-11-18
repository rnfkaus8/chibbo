package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Company {

    @Id
    @Column(name = "company_no")
    @GeneratedValue
    private Long companyNo;


    private String companyRegNum;

    private String companyName;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<WorkerCommunity> workerCommunities = new ArrayList<>();


}
