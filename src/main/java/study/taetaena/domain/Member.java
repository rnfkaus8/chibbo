package study.taetaena.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member {

    @Id
    @Column(name="member_no")
    private int id;

    private int job_small_no;

    private int job_large_no;

    @Column(length = 4000, nullable = false)
    private String member_nickname;

    @Column(length = 4000)
    private String interest_company_no;

    @Column(length = 1, nullable = false)
    private char is_work;

    @Column(length = 4000, nullable = false)
    private String login_auth_key;

    @Column(length = 4000)
    private String worker_company_no;

    @Column(nullable = false)
    private LocalDateTime reg_date;

    @Column(length = 4000)
    private String email;

    @Column(length = 1, nullable = false)
    private char del_flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJob_small_no() {
        return job_small_no;
    }

    public void setJob_small_no(int job_small_no) {
        this.job_small_no = job_small_no;
    }

    public int getJob_large_no() {
        return job_large_no;
    }

    public void setJob_large_no(int job_large_no) {
        this.job_large_no = job_large_no;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public String getInterest_company_no() {
        return interest_company_no;
    }

    public void setInterest_company_no(String interest_company_no) {
        this.interest_company_no = interest_company_no;
    }

    public char getIs_work() {
        return is_work;
    }

    public void setIs_work(char is_work) {
        this.is_work = is_work;
    }

    public String getLogin_auth_key() {
        return login_auth_key;
    }

    public void setLogin_auth_key(String login_auth_key) {
        this.login_auth_key = login_auth_key;
    }

    public String getWorker_company_no() {
        return worker_company_no;
    }

    public void setWorker_company_no(String worker_company_no) {
        this.worker_company_no = worker_company_no;
    }

    public LocalDateTime getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDateTime reg_date) {
        this.reg_date = reg_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(char del_flag) {
        this.del_flag = del_flag;
    }
}
