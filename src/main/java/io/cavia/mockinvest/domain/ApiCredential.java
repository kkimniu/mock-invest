package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "api_credentials")
public class ApiCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credential_owner", nullable = false)
    private String credentialOwner;

    @Column(name = "credential_type", nullable = false)
    private String credentialType;

    @Column(name = "credential_value", nullable = false, length = 500)
    private String credentialValue;

    @Column(name = "expires_in", nullable = false)
    private LocalDateTime expiresIn;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public ApiCredential() {
    }

    public ApiCredential(Long id, String credentialOwner, String credentialType, String credentialValue, LocalDateTime expiresIn, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.credentialOwner = credentialOwner;
        this.credentialType = credentialType;
        this.credentialValue = credentialValue;
        this.expiresIn = expiresIn;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
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
            ", credentialType='" + credentialType + '\'' +
            ", credentialValue='" + credentialValue + '\'' +
            ", expiresIn=" + expiresIn +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
    }
}
