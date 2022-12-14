package com.sus.app.systemUsabilityScale.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "scales")
public class Scale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "q1")
    private int q1;
    @Column(name = "q2")
    private int q2;
    @Column(name = "q3")
    private int q3;
    @Column(name = "q4")
    private int q4;
    @Column(name = "q5")
    private int q5;
    @Column(name = "q6")
    private int q6;
    @Column(name = "q7")
    private int q7;
    @Column(name = "q8")
    private int q8;
    @Column(name = "q9")
    private int q9;
    @Column(name = "q10")
    private int q10;
    @Column(name = "score")
    private float score;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date sqlTimestamp;

    public Scale() {

    }

    public Scale(int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8, int q9, int q10, float score, Date sqlTimestamp) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
        this.score = score;
        this.sqlTimestamp = sqlTimestamp;
    }

    public long getId() {
        return id;
    }

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public int getQ3() {
        return q3;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    public int getQ4() {
        return q4;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }

    public int getQ5() {
        return q5;
    }

    public void setQ5(int q5) {
        this.q5 = q5;
    }

    public int getQ6() {
        return q6;
    }

    public void setQ6(int q6) {
        this.q6 = q6;
    }

    public int getQ7() {
        return q7;
    }

    public void setQ7(int q7) {
        this.q7 = q7;
    }

    public int getQ8() {
        return q8;
    }

    public void setQ8(int q8) {
        this.q8 = q8;
    }

    public int getQ9() {
        return q9;
    }

    public void setQ9(int q9) {
        this.q9 = q9;
    }

    public int getQ10() {
        return q10;
    }

    public void setQ10(int q10) {
        this.q10 = q10;
    }

    public double getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Date sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }
}