package study.taetaena.chibbo.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Company {

    @Id
    @Column(name = "company_no")
    private String companyNo;

    private String companyName;


}
