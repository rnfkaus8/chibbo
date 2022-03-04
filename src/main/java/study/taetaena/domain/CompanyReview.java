package study.taetaena.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="company_review")
public class CompanyReview {

    @Id
    @Column(name="company_review_no")
    private int id;

    @ManyToOne
    @JoinColumn(name="company_no")
    private Company company;

    @ManyToOne
    @JoinColumn(name="member_no")
    private Member member;

    @Column(nullable = false)
    private int work_life_balance_score;

    @Column(nullable = false)
    private int self_improvement_score;

    @Column(nullable = false)
    private int salary_welfare_score;

    @Column(nullable = false)
    private int company_culture_score;

    @Column(nullable = false)
    private int company_owner_score;

    @Column(length = 4000, nullable = false)
    private String positive_content;

    @Column(length = 4000, nullable = false)
    private String negative_content;

    @Column(length = 4000, nullable = false)
    private String company_review_title;

    @Column(nullable = false)
    private LocalDateTime reg_date;

    @Column(length = 1, nullable = false)
    private char del_flag;

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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getWork_life_balance_score() {
        return work_life_balance_score;
    }

    public void setWork_life_balance_score(int work_life_balance_score) {
        this.work_life_balance_score = work_life_balance_score;
    }

    public int getSelf_improvement_score() {
        return self_improvement_score;
    }

    public void setSelf_improvement_score(int self_improvement_score) {
        this.self_improvement_score = self_improvement_score;
    }

    public int getSalary_welfare_score() {
        return salary_welfare_score;
    }

    public void setSalary_welfare_score(int salary_welfare_score) {
        this.salary_welfare_score = salary_welfare_score;
    }

    public int getCompany_culture_score() {
        return company_culture_score;
    }

    public void setCompany_culture_score(int company_culture_score) {
        this.company_culture_score = company_culture_score;
    }

    public int getCompany_owner_score() {
        return company_owner_score;
    }

    public void setCompany_owner_score(int company_owner_score) {
        this.company_owner_score = company_owner_score;
    }

    public String getPositive_content() {
        return positive_content;
    }

    public void setPositive_content(String positive_content) {
        this.positive_content = positive_content;
    }

    public String getNegative_content() {
        return negative_content;
    }

    public void setNegative_content(String negative_content) {
        this.negative_content = negative_content;
    }

    public String getCompany_review_title() {
        return company_review_title;
    }

    public void setCompany_review_title(String company_review_title) {
        this.company_review_title = company_review_title;
    }

    public LocalDateTime getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDateTime reg_date) {
        this.reg_date = reg_date;
    }

    public char getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(char del_flag) {
        this.del_flag = del_flag;
    }
}
