package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "stock")
public class Stock {
    /**
     * 주식 정적 데이터를 담은 테이블 stock입니다.
     * colume 정보
     * id: pk입니다.
     * pdno: 종목코드 입니다.
     * prdt_name: 종목명 입니다.
     * std_idst_clsf_cd_name: 업종코드 입니다.
     * tot_issueStk_qty: 시가총액 입니다. (총 상장 주식 수 * 현재가)
     * list_dt: 상장일 입니다.
     * divi_kind: 배당종류 입니다.
     * divi_rate: 현금배당률 입니다.
     * stk_divi_rate: 주식배당률 입니다.
     * divi_pay_dt: 배당지급일 입니다.
     */
    @Column(name = "id")
    @Id @GeneratedValue
    private Long id;
    @Column(name = "pdno")
    private String pdno;
    @Column(name = "prdt_name")
    private String prdtName;
    @Column(name = "std_idst_cd_name")
    private String stdIdstCdName;
    @Column(name = "std_idst_clsf_cd")
    private String stdIdstClsfCd;
    @Column(name = "tot_issue_stk_qty")
    private Long totIssueStkQty;
    @Column(name = "list_dt")
    private String listDt;
    @Column(name = "divi_kind")
    private String diviKind;
    @Column(name = "divi_rate")
    private BigDecimal diviRate;
    @Column(name = "stk_divi_rate")
    private BigDecimal stkDiviRate;
    @Column(name = "divi_pay_dt")
    private String diviPayDt;

    public Stock() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPdno() {
        return pdno;
    }

    public void setPdno(String pdno) {
        this.pdno = pdno;
    }

    public String getPrdtName() {
        return prdtName;
    }

    public void setPrdtName(String prdtName) {
        this.prdtName = prdtName;
    }

    public String getStdIdstCdName() {
        return stdIdstCdName;
    }

    public void setStdIdstCdName(String stdIdstCdName) {
        this.stdIdstCdName = stdIdstCdName;
    }

    public String getStdIdstClsfCd() {
        return stdIdstClsfCd;
    }

    public void setStdIdstClsfCd(String stdIdstClsfCd) {
        this.stdIdstClsfCd = stdIdstClsfCd;
    }

    public Long getTotIssueStkQty() {
        return totIssueStkQty;
    }

    public void setTotIssueStkQty(Long totIssueStkQty) {
        this.totIssueStkQty = totIssueStkQty;
    }

    public String getListDt() {
        return listDt;
    }

    public void setListDt(String listDt) {
        this.listDt = listDt;
    }

    public String getDiviKind() {
        return diviKind;
    }

    public void setDiviKind(String diviKind) {
        this.diviKind = diviKind;
    }

    public BigDecimal getDiviRate() {
        return diviRate;
    }

    public void setDiviRate(BigDecimal diviRate) {
        this.diviRate = diviRate;
    }

    public BigDecimal getStkDiviRate() {
        return stkDiviRate;
    }

    public void setStkDiviRate(BigDecimal stkDiviRate) {
        this.stkDiviRate = stkDiviRate;
    }

    public String getDiviPayDt() {
        return diviPayDt;
    }

    public void setDiviPayDt(String diviPayDt) {
        this.diviPayDt = diviPayDt;
    }

    @Override
    public String toString() {
        return "Stock{" +
            "id=" + id +
            ", pdno='" + pdno + '\'' +
            ", prdtName='" + prdtName + '\'' +
            ", stdIdstCdName='" + stdIdstCdName + '\'' +
            ", stdIdstClsfCd='" + stdIdstClsfCd + '\'' +
            ", totIssueStkQty=" + totIssueStkQty +
            ", listDt='" + listDt + '\'' +
            ", diviKind='" + diviKind + '\'' +
            ", diviRate=" + diviRate +
            ", stkDiviRate=" + stkDiviRate +
            ", diviPayDt='" + diviPayDt + '\'' +
            '}';
    }
}
