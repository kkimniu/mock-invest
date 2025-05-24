package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "api_credentials")
public class ApiCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String credentialOwner;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private CredentialType credentialType;

    @Column(nullable = false, length = 500)
    private String credentialValue;

    @Column(nullable = false)
    private LocalDateTime expiresIn;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public ApiCredential() {
    }

    public ApiCredential(String credentialOwner, CredentialType credentialType,
                         String credentialValue, LocalDateTime expiresIn) {
        this.credentialOwner = credentialOwner;
        this.credentialType = credentialType;
        this.credentialValue = credentialValue;
        this.expiresIn = expiresIn;
    }

    // 엔티티가 최초로 저장될때 적용되는 JPA 생명주기 콜백
    @PrePersist
    protected void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now; // 생성 시에는 createdAt과 updatedAt을 동일하게 설정
    }

    // 엔티티가 수정될때 적용되는 JPA 생명주기 콜백
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCredentialOwner() {
        return credentialOwner;
    }

    public void setCredentialOwner(String credentialOwner) {
        this.credentialOwner = credentialOwner;
    }

    public CredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public String getCredentialValue() {
        return credentialValue;
    }

    public void setCredentialValue(String credentialValue) {
        this.credentialValue = credentialValue;
    }

    public LocalDateTime getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(LocalDateTime expiresIn) {
        this.expiresIn = expiresIn;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ApiCredential{" +
            "id=" + id +
            ", credentialOwner='" + credentialOwner + '\'' +
            ", credentialType=" + credentialType +
            ", credentialValue='" + credentialValue + '\'' +
            ", expiresIn=" + expiresIn +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
    }
}
