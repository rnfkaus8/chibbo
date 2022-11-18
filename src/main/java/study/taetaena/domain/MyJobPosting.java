package study.taetaena.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="my_job_posting")
public class MyJobPosting implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name="member_no")
    private Member member;

    @Id
    private int job_posting_no;

    @Column(nullable = false)
    private LocalDateTime reg_date;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getJob_posting_no() {
        return job_posting_no;
    }

    public void setJob_posting_no(int job_postion_no) {
        this.job_posting_no = job_postion_no;
    }

    public LocalDateTime getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDateTime reg_date) {
        this.reg_date = reg_date;
    }
}
