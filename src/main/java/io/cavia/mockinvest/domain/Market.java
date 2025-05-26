package io.cavia.mockinvest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "market")
public class Market {
    /**
     * 거래소 시세 정보입니다
     * column 정보
     * id: pk입니다
     * mkop_cls_code: 장운영구분코드 입니다.
     * bstp_nmix_prpr: 업종지수 현재가 입니다
     */
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "mkop_cls_code")
    private String mkopClsCode;
    @Column(name = "bstp_nmix_prpr")
    private Long bstpNmixPrpr;
    @Column(name = "bstp_nmix_prby_vrss")
    private Long getBstpNmixVrss;
    @Column(name = "prdy_vrss_sign")
    private String prdy_vrss_sign;
    @Column(name = "bsrp_nmix_prdy_ctrt")
    private BigDecimal bstpNmixPrdyCtrt;
}
