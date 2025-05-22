package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String userid;
    @Column(nullable = false)
    private String password;
    private String name;
    private String email;
    private String tel;
    @Column(updatable = false, insertable = false)
    private LocalDateTime joindate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDateTime getJoindate() {
        return joindate;
    }

    public void setJoindate(LocalDateTime joindate) {
        this.joindate = joindate;
    }
}
