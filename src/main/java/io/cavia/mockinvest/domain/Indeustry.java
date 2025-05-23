package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

/**
 * 시장별 투자자 매매동향(일별)테이터를 담는 테이블입니다
 * id: pk입니다.
 * bstp_nmix_prpr : 업종 지수 현재가
 * bstp_nmix_prdy_vrss : 업종 지수 전일 대비
 * bstp_nmix_prdy_ctrt : 업종 지수 전일 대비율
 * stck_bsop_date : 주식 영업 일자
 * prdy_vrss_sign : 전일 대비 부호
 * bstp_nmix_oprc : 업종 지수 시가2
 * bstp_nmix_hgpr : 업종 지수 최고가
 * bstp_nmix_lwpr : 업종 지수 최저가
 * stck_prdy_clpr : 주식 전일 종가
 * frgn_ntby_qty : 외국인 순매수 수량
 * frgn_reg_ntby_qty : 외국인 등록 순매수 수량
 * frgn_nreg_ntby_qty : 외국인 비등록 순매수 수량
 * prsn_ntby_qty : 개인 순매수 수량
 * orgn_ntby_qty : 기관계 순매수 수량
 * scrt_ntby_qty : 증권 순매수 수량
 * ivtr_ntby_qty : 투자신탁 순매수 수량
 * pe_fund_ntby_vol : 사모 펀드 순매수 거래량
 * bank_ntby_qty : 은행 순매수 수량
 * insu_ntby_qty : 보험 순매수 수량
 * mrbn_ntby_qty : 종금 순매수 수량
 * fund_ntby_qty : 기금 순매수 수량
 * etc_ntby_qty : 기타 순매수 수량
 * etc_orgt_ntby_vol : 기타 단체 순매수 거래량
 * etc_corp_ntby_vol : 기타 법인 순매수 거래량
 * frgn_ntby_tr_pbmn : 외국인 순매수 거래 대금
 * frgn_reg_ntby_pbmn : 외국인 등록 순매수 대금
 * frgn_nreg_ntby_pbmn : 외국인 비등록 순매수 대금
 * prsn_ntby_tr_pbmn : 개인 순매수 거래 대금
 * orgn_ntby_tr_pbmn : 기관계 순매수 거래 대금
 * scrt_ntby_tr_pbmn : 증권 순매수 거래 대금
 * ivtr_ntby_tr_pbmn : 투자신탁 순매수 거래 대금
 * pe_fund_ntby_tr_pbmn : 사모 펀드 순매수 거래 대금
 * bank_ntby_tr_pbmn : 은행 순매수 거래 대금
 * insu_ntby_tr_pbmn : 보험 순매수 거래 대금
 * mrbn_ntby_tr_pbmn : 종금 순매수 거래 대금
 * fund_ntby_tr_pbmn : 기금 순매수 거래 대금
 * etc_ntby_tr_pbmn : 기타 순매수 거래 대금
 * etc_orgt_ntby_tr_pbmn : 기타 단체 순매수 거래 대금
 * etc_corp_ntby_tr_pbmn : 기타 법인 순매수 거래 대금
 */
@Entity
@Table(name = "indeustry")
public class Indeustry {
    @Column(name = "id")
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "bstp_nmix_prpr")
    private String bstpNmixPrpr;
    @Column(name = "bstp_nmix_prdy_vrss")
    private String bstpNmixPrdyVrss;
    @Column(name = "bstp_nmix_prdy_ctrt")
    private String bstpNmixPrdyCtrt;
    @Column(name = "stck_bsop_date")
    private String stckBsopDate;
    @Column(name = "prdy_vrss_sign")
    private String prdyVrssSign;
    @Column(name = "bstp_nmix_oprc")
    private String bstpNmixOprc;
    @Column(name = "bstp_nmix_hgpr")
    private String bstpNmixHgpr;
    @Column(name = "bstp_nmix_lwpr")
    private String bstpNmixLwpr;
    @Column(name = "stck_prdy_clpr")
    private String stckPrdyClpr;
    @Column(name = "frgn_ntby_qty")
    private String frgnNtbyQty;
    @Column(name = "frgn_reg_ntby_qty")
    private String frgnRegNtbyQty;
    @Column(name = "frgn_nreg_ntby_qty")
    private String frgnNregNtbyQty;
    @Column(name = "prsn_ntby_qty")
    private String prsnNtbyQty;
    @Column(name = "orgn_ntby_qty")
    private String orgnNtbyQty;
    @Column(name = "scrt_ntby_qty")
    private String scrtNtbyQty;
    @Column(name = "ivtr_ntby_qty")
    private String ivtrNtbyQty;
    @Column(name = "pe_fund_ntby_vol")
    private String peFundNtbyVol;
    @Column(name = "bank_ntby_qty")
    private String bankNtbyQty;
    @Column(name = "insu_ntby_qty")
    private String insuNtbyQty;
    @Column(name = "mrbn_ntby_qty")
    private String mrbnNtbyQty;
    @Column(name = "fund_ntby_qty")
    private String fundNtbyQty;
    @Column(name = "etc_ntby_qty")
    private String etcNtbyQty;
    @Column(name = "etc_orgt_ntby_vol")
    private String etcOrgtNtbyVol;
    @Column(name = "etc_corp_ntby_vol")
    private String etcCorpNtbyVol;
    @Column(name = "frgn_ntby_tr_pbmn")
    private String frgnNtbyTrPbmn;
    @Column(name = "frgn_reg_ntby_pbmn")
    private String frgnRegNtbyPbmn;
    @Column(name = "frgn_nreg_ntby_pbmn")
    private String frgnNregNtbyPbmn;
    @Column(name = "prsn_ntby_tr_pbmn")
    private String prsnNtbyTrPbmn;
    @Column(name = "orgn_ntby_tr_pbmn")
    private String orgnNtbyTrPbmn;
    @Column(name = "scrt_ntby_tr_pbmn")
    private String scrtNtbyTrPbmn;
    @Column(name = "ivtr_ntby_tr_pbmn")
    private String ivtrNtbyTrPbmn;
    @Column(name = "pe_fund_ntby_tr_pbmn")
    private String peFundNtbyTrPbmn;
    @Column(name = "bank_ntby_tr_pbmn")
    private String bankNtbyTrPbmn;
    @Column(name = "insu_ntby_tr_pbmn")
    private String insuNtbyTrPbmn;
    @Column(name = "mrbn_ntby_tr_pbmn")
    private String mrbnNtbyTrPbmn;
    @Column(name = "fund_ntby_tr_pbmn")
    private String fundNtbyTrPbmn;
    @Column(name = "etc_ntby_tr_pbmn")
    private String etcNtbyTrPbmn;
    @Column(name = "etc_orgt_ntby_tr_pbmn")
    private String etcOrgtNtbyTrPbmn;
    @Column(name = "etc_corp_ntby_tr_pbmn")
    private String etcCorpNtbyTrPbmn;

    public Indeustry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public String getBstpNmixPrdyVrss() {
        return bstpNmixPrdyVrss;
    }

    public void setBstpNmixPrdyVrss(String bstpNmixPrdyVrss) {
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
    }

    public String getBstpNmixPrdyCtrt() {
        return bstpNmixPrdyCtrt;
    }

    public void setBstpNmixPrdyCtrt(String bstpNmixPrdyCtrt) {
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    public String getStckBsopDate() {
        return stckBsopDate;
    }

    public void setStckBsopDate(String stckBsopDate) {
        this.stckBsopDate = stckBsopDate;
    }

    public String getPrdyVrssSign() {
        return prdyVrssSign;
    }

    public void setPrdyVrssSign(String prdyVrssSign) {
        this.prdyVrssSign = prdyVrssSign;
    }

    public String getBstpNmixOprc() {
        return bstpNmixOprc;
    }

    public void setBstpNmixOprc(String bstpNmixOprc) {
        this.bstpNmixOprc = bstpNmixOprc;
    }

    public String getBstpNmixHgpr() {
        return bstpNmixHgpr;
    }

    public void setBstpNmixHgpr(String bstpNmixHgpr) {
        this.bstpNmixHgpr = bstpNmixHgpr;
    }

    public String getBstpNmixLwpr() {
        return bstpNmixLwpr;
    }

    public void setBstpNmixLwpr(String bstpNmixLwpr) {
        this.bstpNmixLwpr = bstpNmixLwpr;
    }

    public String getStckPrdyClpr() {
        return stckPrdyClpr;
    }

    public void setStckPrdyClpr(String stckPrdyClpr) {
        this.stckPrdyClpr = stckPrdyClpr;
    }

    public String getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(String frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public String getFrgnRegNtbyQty() {
        return frgnRegNtbyQty;
    }

    public void setFrgnRegNtbyQty(String frgnRegNtbyQty) {
        this.frgnRegNtbyQty = frgnRegNtbyQty;
    }

    public String getFrgnNregNtbyQty() {
        return frgnNregNtbyQty;
    }

    public void setFrgnNregNtbyQty(String frgnNregNtbyQty) {
        this.frgnNregNtbyQty = frgnNregNtbyQty;
    }

    public String getPrsnNtbyQty() {
        return prsnNtbyQty;
    }

    public void setPrsnNtbyQty(String prsnNtbyQty) {
        this.prsnNtbyQty = prsnNtbyQty;
    }

    public String getOrgnNtbyQty() {
        return orgnNtbyQty;
    }

    public void setOrgnNtbyQty(String orgnNtbyQty) {
        this.orgnNtbyQty = orgnNtbyQty;
    }

    public String getScrtNtbyQty() {
        return scrtNtbyQty;
    }

    public void setScrtNtbyQty(String scrtNtbyQty) {
        this.scrtNtbyQty = scrtNtbyQty;
    }

    public String getIvtrNtbyQty() {
        return ivtrNtbyQty;
    }

    public void setIvtrNtbyQty(String ivtrNtbyQty) {
        this.ivtrNtbyQty = ivtrNtbyQty;
    }

    public String getPeFundNtbyVol() {
        return peFundNtbyVol;
    }

    public void setPeFundNtbyVol(String peFundNtbyVol) {
        this.peFundNtbyVol = peFundNtbyVol;
    }

    public String getBankNtbyQty() {
        return bankNtbyQty;
    }

    public void setBankNtbyQty(String bankNtbyQty) {
        this.bankNtbyQty = bankNtbyQty;
    }

    public String getInsuNtbyQty() {
        return insuNtbyQty;
    }

    public void setInsuNtbyQty(String insuNtbyQty) {
        this.insuNtbyQty = insuNtbyQty;
    }

    public String getMrbnNtbyQty() {
        return mrbnNtbyQty;
    }

    public void setMrbnNtbyQty(String mrbnNtbyQty) {
        this.mrbnNtbyQty = mrbnNtbyQty;
    }

    public String getFundNtbyQty() {
        return fundNtbyQty;
    }

    public void setFundNtbyQty(String fundNtbyQty) {
        this.fundNtbyQty = fundNtbyQty;
    }

    public String getEtcNtbyQty() {
        return etcNtbyQty;
    }

    public void setEtcNtbyQty(String etcNtbyQty) {
        this.etcNtbyQty = etcNtbyQty;
    }

    public String getEtcOrgtNtbyVol() {
        return etcOrgtNtbyVol;
    }

    public void setEtcOrgtNtbyVol(String etcOrgtNtbyVol) {
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
    }

    public String getEtcCorpNtbyVol() {
        return etcCorpNtbyVol;
    }

    public void setEtcCorpNtbyVol(String etcCorpNtbyVol) {
        this.etcCorpNtbyVol = etcCorpNtbyVol;
    }

    public String getFrgnNtbyTrPbmn() {
        return frgnNtbyTrPbmn;
    }

    public void setFrgnNtbyTrPbmn(String frgnNtbyTrPbmn) {
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
    }

    public String getFrgnRegNtbyPbmn() {
        return frgnRegNtbyPbmn;
    }

    public void setFrgnRegNtbyPbmn(String frgnRegNtbyPbmn) {
        this.frgnRegNtbyPbmn = frgnRegNtbyPbmn;
    }

    public String getFrgnNregNtbyPbmn() {
        return frgnNregNtbyPbmn;
    }

    public void setFrgnNregNtbyPbmn(String frgnNregNtbyPbmn) {
        this.frgnNregNtbyPbmn = frgnNregNtbyPbmn;
    }

    public String getPrsnNtbyTrPbmn() {
        return prsnNtbyTrPbmn;
    }

    public void setPrsnNtbyTrPbmn(String prsnNtbyTrPbmn) {
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
    }

    public String getOrgnNtbyTrPbmn() {
        return orgnNtbyTrPbmn;
    }

    public void setOrgnNtbyTrPbmn(String orgnNtbyTrPbmn) {
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
    }

    public String getScrtNtbyTrPbmn() {
        return scrtNtbyTrPbmn;
    }

    public void setScrtNtbyTrPbmn(String scrtNtbyTrPbmn) {
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
    }

    public String getIvtrNtbyTrPbmn() {
        return ivtrNtbyTrPbmn;
    }

    public void setIvtrNtbyTrPbmn(String ivtrNtbyTrPbmn) {
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
    }

    public String getPeFundNtbyTrPbmn() {
        return peFundNtbyTrPbmn;
    }

    public void setPeFundNtbyTrPbmn(String peFundNtbyTrPbmn) {
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
    }

    public String getBankNtbyTrPbmn() {
        return bankNtbyTrPbmn;
    }

    public void setBankNtbyTrPbmn(String bankNtbyTrPbmn) {
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
    }

    public String getInsuNtbyTrPbmn() {
        return insuNtbyTrPbmn;
    }

    public void setInsuNtbyTrPbmn(String insuNtbyTrPbmn) {
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
    }

    public String getMrbnNtbyTrPbmn() {
        return mrbnNtbyTrPbmn;
    }

    public void setMrbnNtbyTrPbmn(String mrbnNtbyTrPbmn) {
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
    }

    public String getFundNtbyTrPbmn() {
        return fundNtbyTrPbmn;
    }

    public void setFundNtbyTrPbmn(String fundNtbyTrPbmn) {
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
    }

    public String getEtcNtbyTrPbmn() {
        return etcNtbyTrPbmn;
    }

    public void setEtcNtbyTrPbmn(String etcNtbyTrPbmn) {
        this.etcNtbyTrPbmn = etcNtbyTrPbmn;
    }

    public String getEtcOrgtNtbyTrPbmn() {
        return etcOrgtNtbyTrPbmn;
    }

    public void setEtcOrgtNtbyTrPbmn(String etcOrgtNtbyTrPbmn) {
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
    }

    public String getEtcCorpNtbyTrPbmn() {
        return etcCorpNtbyTrPbmn;
    }

    public void setEtcCorpNtbyTrPbmn(String etcCorpNtbyTrPbmn) {
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }

    @Override
    public String toString() {
        return "Indeustry{" +
            "id=" + id +
            ", bstpNmixPrpr='" + bstpNmixPrpr + '\'' +
            ", bstpNmixPrdyVrss='" + bstpNmixPrdyVrss + '\'' +
            ", bstpNmixPrdyCtrt='" + bstpNmixPrdyCtrt + '\'' +
            ", stckBsopDate='" + stckBsopDate + '\'' +
            ", prdyVrssSign='" + prdyVrssSign + '\'' +
            ", bstpNmixOprc='" + bstpNmixOprc + '\'' +
            ", bstpNmixHgpr='" + bstpNmixHgpr + '\'' +
            ", bstpNmixLwpr='" + bstpNmixLwpr + '\'' +
            ", stckPrdyClpr='" + stckPrdyClpr + '\'' +
            ", frgnNtbyQty='" + frgnNtbyQty + '\'' +
            ", frgnRegNtbyQty='" + frgnRegNtbyQty + '\'' +
            ", frgnNregNtbyQty='" + frgnNregNtbyQty + '\'' +
            ", prsnNtbyQty='" + prsnNtbyQty + '\'' +
            ", orgnNtbyQty='" + orgnNtbyQty + '\'' +
            ", scrtNtbyQty='" + scrtNtbyQty + '\'' +
            ", ivtrNtbyQty='" + ivtrNtbyQty + '\'' +
            ", peFundNtbyVol='" + peFundNtbyVol + '\'' +
            ", bankNtbyQty='" + bankNtbyQty + '\'' +
            ", insuNtbyQty='" + insuNtbyQty + '\'' +
            ", mrbnNtbyQty='" + mrbnNtbyQty + '\'' +
            ", fundNtbyQty='" + fundNtbyQty + '\'' +
            ", etcNtbyQty='" + etcNtbyQty + '\'' +
            ", etcOrgtNtbyVol='" + etcOrgtNtbyVol + '\'' +
            ", etcCorpNtbyVol='" + etcCorpNtbyVol + '\'' +
            ", frgnNtbyTrPbmn='" + frgnNtbyTrPbmn + '\'' +
            ", frgnRegNtbyPbmn='" + frgnRegNtbyPbmn + '\'' +
            ", frgnNregNtbyPbmn='" + frgnNregNtbyPbmn + '\'' +
            ", prsnNtbyTrPbmn='" + prsnNtbyTrPbmn + '\'' +
            ", orgnNtbyTrPbmn='" + orgnNtbyTrPbmn + '\'' +
            ", scrtNtbyTrPbmn='" + scrtNtbyTrPbmn + '\'' +
            ", ivtrNtbyTrPbmn='" + ivtrNtbyTrPbmn + '\'' +
            ", peFundNtbyTrPbmn='" + peFundNtbyTrPbmn + '\'' +
            ", bankNtbyTrPbmn='" + bankNtbyTrPbmn + '\'' +
            ", insuNtbyTrPbmn='" + insuNtbyTrPbmn + '\'' +
            ", mrbnNtbyTrPbmn='" + mrbnNtbyTrPbmn + '\'' +
            ", fundNtbyTrPbmn='" + fundNtbyTrPbmn + '\'' +
            ", etcNtbyTrPbmn='" + etcNtbyTrPbmn + '\'' +
            ", etcOrgtNtbyTrPbmn='" + etcOrgtNtbyTrPbmn + '\'' +
            ", etcCorpNtbyTrPbmn='" + etcCorpNtbyTrPbmn + '\'' +
            '}';
    }
}
