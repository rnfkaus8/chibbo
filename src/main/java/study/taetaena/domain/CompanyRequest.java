package study.taetaena.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="company_request")
public class CompanyRequest {

    @Id
    @Column(name="company_request_no")
    private int id;

    @OneToOne
    @JoinColumn(name="company_no")
    private Company company;

    @Column(length = 4000, nullable = false)
    private String company_name;

    @Column(nullable = false)
    private LocalDateTime reg_date;

    @Column(length = 1, nullable = false)
    private char approval_flag;

    private LocalDateTime approval_date;

    @ManyToOne
    @JoinColumn(name="member_no")
    private Member member;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public LocalDateTime getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDateTime reg_date) {
        this.reg_date = reg_date;
    }

    public char getApproval_flag() {
        return approval_flag;
    }

    public void setApproval_flag(char approval_flag) {
        this.approval_flag = approval_flag;
    }

    public LocalDateTime getApproval_date() {
        return approval_date;
    }

    public void setApproval_date(LocalDateTime approval_date) {
        this.approval_date = approval_date;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}

