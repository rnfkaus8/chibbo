package study.taetaena.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="work_request")
public class WorkerRequest {

    @Id
    @Column(name="worker_request_no")
    private int id;

    @ManyToOne
    @JoinColumn(name="member_no")
    private Member member;

    @ManyToOne
    @JoinColumn(name="company_no")
    private Company company;

    @Column(length = 4000, nullable = false)
    private String email;

    @Column(length = 4000)
    private String img_attach_name;

    @Column(length = 1, nullable = false)
    private char approval_flag;

    @Column(nullable = false)
    private LocalDateTime reg_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg_attach_name() {
        return img_attach_name;
    }

    public void setImg_attach_name(String img_attach_name) {
        this.img_attach_name = img_attach_name;
    }

    public char getApproval_flag() {
        return approval_flag;
    }

    public void setApproval_flag(char approval_flag) {
        this.approval_flag = approval_flag;
    }

    public LocalDateTime getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDateTime reg_date) {
        this.reg_date = reg_date;
    }
}
