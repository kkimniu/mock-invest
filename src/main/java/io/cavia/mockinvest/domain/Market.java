package io.cavia.mockinvest.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "market")
public class Market {
    /**
     * 시장별 투자자 매매동향(시세)테이터를 담는 테이블입니다
     * id: pk입니다.
     * ------ 외국인 ------
     * - frgn_seln_vol: 외국인 매도 거래량 입니다.
     * - frgn_shnu_vol: 외국인 매수2 거래량 입니다.
     * - frgn_ntby_qty: 외국인 순매수 수량 입니다.
     * - frgn_seln_tr_pbmn: 외국인 매도 거래 대금 입니다.
     * - frgn_shnu_tr_pbmn: 외국인 매수2 거래 대금 입니다.
     * - frgn_ntby_tr_pbmn: 외국인 순매수 거래 대금 입니다.
     * ------ 개인 ------
     * - prsn_seln_vol: 개인 매도 거래량 입니다.
     * - prsn_shnu_vol: 개인 매수2 거래량 입니다.
     * - prsn_ntby_qty: 개인 순매수 수량 입니다.
     * - prsn_seln_tr_pbmn: 개인 매도 거래 대금 입니다.
     * - prsn_shnu_tr_pbmn: 개인 매수2 거래 대금 입니다.
     * - prsn_ntby_tr_pbmn: 개인 순매수 거래 대금 입니다.
     * ------ 기관 ------
     * - orgn_seln_vol: 기관계 매도 거래량 입니다.
     * - orgn_shnu_vol: 기관계 매수2 거래량 입니다.
     * - orgn_ntby_qty: 기관계 순매수 수량 입니다.
     * - orgn_seln_tr_pbmn: 기관계 매도 거래 대금 입니다.
     * - orgn_shnu_tr_pbmn: 기관계 매수2 거래 대금 입니다.
     * - orgn_ntby_tr_pbmn: 기관계 순매수 거래 대금 입니다.
     * ------ 증권 ------
     * - scrt_seln_vol: 증권 매도 거래량 입니다.
     * - scrt_shnu_vol: 증권 매수2 거래량 입니다.
     * - scrt_ntby_qty: 증권 순매수 수량 입니다.
     * - scrt_seln_tr_pbmn: 증권 매도 거래 대금 입니다.
     * - scrt_shnu_tr_pbmn: 증권 매수2 거래 대금 입니다.
     * - scrt_ntby_tr_pbmn: 증권 순매수 거래 대금 입니다.
     * ------ 투자신탁 ------
     * - ivtr_seln_vol: 투자신탁 매도 거래량 입니다.
     * - ivtr_shnu_vol: 투자신탁 매수2 거래량 입니다.
     * - ivtr_ntby_qty: 투자신탁 순매수 수량 입니다.
     * - ivtr_seln_tr_pbmn: 투자신탁 매도 거래 대금 입니다.
     * - ivtr_shnu_tr_pbmn: 투자신탁 매수2 거래 대금 입니다.
     * - ivtr_ntby_tr_pbmn: 투자신탁 순매수 거래 대금 입니다.
     * ------ 사모 펀드 ------
     * - pe_fund_seln_vol: 사모 펀드 매도 거래량 입니다.
     * - pe_fund_shnu_vol: 사모 펀드 매수2 거래량 입니다.
     * - pe_fund_ntby_vol: 사모 펀드 순매수 거래량 입니다.
     * - pe_fund_seln_tr_pbmn: 사모 펀드 매도 거래 대금 입니다.
     * - pe_fund_shnu_tr_pbmn: 사모 펀드 매수2 거래 대금 입니다.
     * - pe_fund_ntby_tr_pbmn: 사모 펀드 순매수 거래 대금 입니다.
     * ------ 은행 ------
     * - bank_seln_vol: 은행 매도 거래량 입니다.
     * - bank_shnu_vol: 은행 매수2 거래량 입니다.
     * - bank_ntby_qty: 은행 순매수 수량 입니다.
     * - bank_seln_tr_pbmn: 은행 매도 거래 대금 입니다.
     * - bank_shnu_tr_pbmn: 은행 매수2 거래 대금 입니다.
     * - bank_ntby_tr_pbmn: 은행 순매수 거래 대금 입니다.
     * ------ 보험 ------
     * - insu_seln_vol: 보험 매도 거래량 입니다.
     * - insu_shnu_vol: 보험 매수2 거래량 입니다.
     * - insu_ntby_qty: 보험 순매수 수량 입니다.
     * - insu_seln_tr_pbmn: 보험 매도 거래 대금 입니다.
     * - insu_shnu_tr_pbmn: 보험 매수2 거래 대금 입니다.
     * - insu_ntby_tr_pbmn: 보험 순매수 거래 대금 입니다.
     * ------ 종금 ------
     * - mrbn_seln_vol: 종금 매도 거래량 입니다.
     * - mrbn_shnu_vol: 종금 매수2 거래량 입니다.
     * - mrbn_ntby_qty: 종금 순매수 수량 입니다.
     * - mrbn_seln_tr_pbmn: 종금 매도 거래 대금 입니다.
     * - mrbn_shnu_tr_pbmn: 종금 매수2 거래 대금 입니다.
     * - mrbn_ntby_tr_pbmn: 종금 순매수 거래 대금 입니다.
     * ------ 기금 ------
     * - fund_seln_vol: 기금 매도 거래량 입니다.
     * - fund_shnu_vol: 기금 매수2 거래량 입니다.
     * - fund_ntby_qty: 기금 순매수 수량 입니다.
     * - fund_seln_tr_pbmn: 기금 매도 거래 대금 입니다.
     * - fund_shnu_tr_pbmn: 기금 매수2 거래 대금 입니다.
     * - fund_ntby_tr_pbmn: 기금 순매수 거래 대금 입니다.
     * ------ 기타 단체 ------
     * - etc_orgt_seln_vol: 기타 단체 매도 거래량 입니다.
     * - etc_orgt_shnu_vol: 기타 단체 매수2 거래량 입니다.
     * - etc_orgt_ntby_vol: 기타 단체 순매수 거래량 입니다.
     * - etc_orgt_seln_tr_pbmn: 기타 단체 매도 거래 대금 입니다.
     * - etc_orgt_shnu_tr_pbmn: 기타 단체 매수2 거래 대금 입니다.
     * - etc_orgt_ntby_tr_pbmn: 기타 단체 순매수 거래 대금 입니다.
     * ------ 기타 법인 ------
     * - etc_corp_seln_vol: 기타 법인 매도 거래량 입니다.
     * - etc_corp_shnu_vol: 기타 법인 매수2 거래량 입니다.
     * - etc_corp_ntby_vol: 기타 법인 순매수 거래량 입니다.
     * - etc_corp_seln_tr_pbmn: 기타 법인 매도 거래 대금 입니다.
     * - etc_corp_shnu_tr_pbmn: 기타 법인 매수2 거래 대금 입니다.
     * - etc_corp_ntby_tr_pbmn: 기타 법인 순매수 거래 대금 입니다.
     */
    @Column(name = "id")
    @Id @GeneratedValue
    private Long id;
    @Column(name = "frgn_seln_vol")
    private String frgnSelnVol;
    @Column(name = "frgn_shnu_vol")
    private String frgnShnuVol;
    @Column(name = "frgn_ntby_qty")
    private String frgnNtbyQty;
    @Column(name = "frgn_seln_tr_pbmn")
    private String frgnSelnTrPbmn;
    @Column(name = "frgn_shnu_tr_pbmn")
    private String frgnShnuTrPbmn;
    @Column(name = "frgn_ntby_tr_pbmn")
    private String frgnNtbyTrPbmn;
    @Column(name = "prsn_seln_vol")
    private String prsnSelnVol;
    @Column(name = "prsn_shnu_vol")
    private String prsnShnuVol;
    @Column(name = "prsn_ntby_qty")
    private String prsnNtbyQty;
    @Column(name = "prsn_seln_tr_pbmn")
    private String prsnSelnTrPbmn;
    @Column(name = "prsn_shnu_tr_pbmn")
    private String prsnShnuTrPbmn;
    @Column(name = "prsn_ntby_tr_pbmn")
    private String prsnNtbyTrPbmn;
    @Column(name = "orgn_seln_vol")
    private String orgnSelnVol;
    @Column(name = "orgn_shnu_vol")
    private String orgnShnuVol;
    @Column(name = "orgn_ntby_qty")
    private String orgnNtbyQty;
    @Column(name = "orgn_seln_tr_pbmn")
    private String orgnSelnTrPbmn;
    @Column(name = "orgn_shnu_tr_pbmn")
    private String orgnShnuTrPbmn;
    @Column(name = "orgn_ntby_tr_pbmn")
    private String orgnNtbyTrPbmn;
    @Column(name = "scrt_seln_vol")
    private String scrtSelnVol;
    @Column(name = "scrt_shnu_vol")
    private String scrtShnuVol;
    @Column(name = "scrt_ntby_qty")
    private String scrtNtbyQty;
    @Column(name = "scrt_seln_tr_pbmn")
    private String scrtSelnTrPbmn;
    @Column(name = "scrt_shnu_tr_pbmn")
    private String scrtShnuTrPbmn;
    @Column(name = "scrt_ntby_tr_pbmn")
    private String scrtNtbyTrPbmn;
    @Column(name = "ivtr_seln_vol")
    private String ivtrSelnVol;
    @Column(name = "ivtr_shnu_vol")
    private String ivtrShnuVol;
    @Column(name = "ivtr_ntby_qty")
    private String ivtrNtbyQty;
    @Column(name = "ivtr_seln_tr_pbmn")
    private String ivtrSelnTrPbmn;
    @Column(name = "ivtr_shnu_tr_pbmn")
    private String ivtrShnuTrPbmn;
    @Column(name = "ivtr_ntby_tr_pbmn")
    private String ivtrNtbyTrPbmn;
    @Column(name = "pe_fund_seln_vol")
    private String peFundSelnVol;
    @Column(name = "pe_fund_shnu_vol")
    private String peFundShnuVol;
    @Column(name = "pe_fund_ntby_vol")
    private String peFundNtbyVol;
    @Column(name = "pe_fund_seln_tr_pbmn")
    private String peFundSelnTrPbmn;
    @Column(name = "pe_fund_shnu_tr_pbmn")
    private String peFundShnuTrPbmn;
    @Column(name = "pe_fund_ntby_tr_pbmn")
    private String peFundNtbyTrPbmn;
    @Column(name = "bank_seln_vol")
    private String bankSelnVol;
    @Column(name = "bank_shnu_vol")
    private String bankShnuVol;
    @Column(name = "bank_ntby_qty")
    private String bankNtbyQty;
    @Column(name = "bank_seln_tr_pbmn")
    private String bankSelnTrPbmn;
    @Column(name = "bank_shnu_tr_pbmn")
    private String bankShnuTrPbmn;
    @Column(name = "bank_ntby_tr_pbmn")
    private String bankNtbyTrPbmn;
    @Column(name = "insu_seln_vol")
    private String insuSelnVol;
    @Column(name = "insu_shnu_vol")
    private String insuShnuVol;
    @Column(name = "insu_ntby_qty")
    private String insuNtbyQty;
    @Column(name = "insu_seln_tr_pbmn")
    private String insuSelnTrPbmn;
    @Column(name = "insu_shnu_tr_pbmn")
    private String insuShnuTrPbmn;
    @Column(name = "insu_ntby_tr_pbmn")
    private String insuNtbyTrPbmn;
    @Column(name = "mrbn_seln_vol")
    private String mrbnSelnVol;
    @Column(name = "mrbn_shnu_vol")
    private String mrbnShnuVol;
    @Column(name = "mrbn_ntby_qty")
    private String mrbnNtbyQty;
    @Column(name = "mrbn_seln_tr_pbmn")
    private String mrbnSelnTrPbmn;
    @Column(name = "mrbn_shnu_tr_pbmn")
    private String mrbnShnuTrPbmn;
    @Column(name = "mrbn_ntby_tr_pbmn")
    private String mrbnNtbyTrPbmn;
    @Column(name = "fund_seln_vol")
    private String fundSelnVol;
    @Column(name = "fund_shnu_vol")
    private String fundShnuVol;
    @Column(name = "fund_ntby_qty")
    private String fundNtbyQty;
    @Column(name = "fund_seln_tr_pbmn")
    private String fundSelnTrPbmn;
    @Column(name = "fund_shnu_tr_pbmn")
    private String fundShnuTrPbmn;
    @Column(name = "fund_ntby_tr_pbmn")
    private String fundNtbyTrPbmn;
    @Column(name = "etc_orgt_seln_vol")
    private String etcOrgtSelnVol;
    @Column(name = "etc_orgt_shnu_vol")
    private String etcOrgtShnuVol;
    @Column(name = "etc_orgt_ntby_vol")
    private String etcOrgtNtbyVol;
    @Column(name = "etc_orgt_seln_tr_pbmn")
    private String etcOrgtSelnTrPbmn;
    @Column(name = "etc_orgt_shnu_tr_pbmn")
    private String etcOrgtShnuTrPbmn;
    @Column(name = "etc_orgt_ntby_tr_pbmn")
    private String etcOrgtNtbyTrPbmn;
    @Column(name = "etc_corp_seln_vol")
    private String etcCorpSelnVol;
    @Column(name = "etc_corp_shnu_vol")
    private String etcCorpShnuVol;
    @Column(name = "etc_corp_ntby_vol")
    private String etcCorpNtbyVol;
    @Column(name = "etc_corp_seln_tr_pbmn")
    private String etcCorpSelnTrPbmn;
    @Column(name = "etc_corp_shnu_tr_pbmn")
    private String etcCorpShnuTrPbmn;
    @Column(name = "etc_corp_ntby_tr_pbmn")
    private String etcCorpNtbyTrPbmn;

    public Market() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrgnSelnVol() {
        return frgnSelnVol;
    }

    public void setFrgnSelnVol(String frgnSelnVol) {
        this.frgnSelnVol = frgnSelnVol;
    }

    public String getFrgnShnuVol() {
        return frgnShnuVol;
    }

    public void setFrgnShnuVol(String frgnShnuVol) {
        this.frgnShnuVol = frgnShnuVol;
    }

    public String getFrgnNtbyQty() {
        return frgnNtbyQty;
    }

    public void setFrgnNtbyQty(String frgnNtbyQty) {
        this.frgnNtbyQty = frgnNtbyQty;
    }

    public String getFrgnSelnTrPbmn() {
        return frgnSelnTrPbmn;
    }

    public void setFrgnSelnTrPbmn(String frgnSelnTrPbmn) {
        this.frgnSelnTrPbmn = frgnSelnTrPbmn;
    }

    public String getFrgnShnuTrPbmn() {
        return frgnShnuTrPbmn;
    }

    public void setFrgnShnuTrPbmn(String frgnShnuTrPbmn) {
        this.frgnShnuTrPbmn = frgnShnuTrPbmn;
    }

    public String getFrgnNtbyTrPbmn() {
        return frgnNtbyTrPbmn;
    }

    public void setFrgnNtbyTrPbmn(String frgnNtbyTrPbmn) {
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
    }

    public String getPrsnSelnVol() {
        return prsnSelnVol;
    }

    public void setPrsnSelnVol(String prsnSelnVol) {
        this.prsnSelnVol = prsnSelnVol;
    }

    public String getPrsnShnuVol() {
        return prsnShnuVol;
    }

    public void setPrsnShnuVol(String prsnShnuVol) {
        this.prsnShnuVol = prsnShnuVol;
    }

    public String getPrsnNtbyQty() {
        return prsnNtbyQty;
    }

    public void setPrsnNtbyQty(String prsnNtbyQty) {
        this.prsnNtbyQty = prsnNtbyQty;
    }

    public String getPrsnSelnTrPbmn() {
        return prsnSelnTrPbmn;
    }

    public void setPrsnSelnTrPbmn(String prsnSelnTrPbmn) {
        this.prsnSelnTrPbmn = prsnSelnTrPbmn;
    }

    public String getPrsnShnuTrPbmn() {
        return prsnShnuTrPbmn;
    }

    public void setPrsnShnuTrPbmn(String prsnShnuTrPbmn) {
        this.prsnShnuTrPbmn = prsnShnuTrPbmn;
    }

    public String getPrsnNtbyTrPbmn() {
        return prsnNtbyTrPbmn;
    }

    public void setPrsnNtbyTrPbmn(String prsnNtbyTrPbmn) {
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
    }

    public String getOrgnSelnVol() {
        return orgnSelnVol;
    }

    public void setOrgnSelnVol(String orgnSelnVol) {
        this.orgnSelnVol = orgnSelnVol;
    }

    public String getOrgnShnuVol() {
        return orgnShnuVol;
    }

    public void setOrgnShnuVol(String orgnShnuVol) {
        this.orgnShnuVol = orgnShnuVol;
    }

    public String getOrgnNtbyQty() {
        return orgnNtbyQty;
    }

    public void setOrgnNtbyQty(String orgnNtbyQty) {
        this.orgnNtbyQty = orgnNtbyQty;
    }

    public String getOrgnSelnTrPbmn() {
        return orgnSelnTrPbmn;
    }

    public void setOrgnSelnTrPbmn(String orgnSelnTrPbmn) {
        this.orgnSelnTrPbmn = orgnSelnTrPbmn;
    }

    public String getOrgnShnuTrPbmn() {
        return orgnShnuTrPbmn;
    }

    public void setOrgnShnuTrPbmn(String orgnShnuTrPbmn) {
        this.orgnShnuTrPbmn = orgnShnuTrPbmn;
    }

    public String getOrgnNtbyTrPbmn() {
        return orgnNtbyTrPbmn;
    }

    public void setOrgnNtbyTrPbmn(String orgnNtbyTrPbmn) {
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
    }

    public String getScrtSelnVol() {
        return scrtSelnVol;
    }

    public void setScrtSelnVol(String scrtSelnVol) {
        this.scrtSelnVol = scrtSelnVol;
    }

    public String getScrtShnuVol() {
        return scrtShnuVol;
    }

    public void setScrtShnuVol(String scrtShnuVol) {
        this.scrtShnuVol = scrtShnuVol;
    }

    public String getScrtNtbyQty() {
        return scrtNtbyQty;
    }

    public void setScrtNtbyQty(String scrtNtbyQty) {
        this.scrtNtbyQty = scrtNtbyQty;
    }

    public String getScrtSelnTrPbmn() {
        return scrtSelnTrPbmn;
    }

    public void setScrtSelnTrPbmn(String scrtSelnTrPbmn) {
        this.scrtSelnTrPbmn = scrtSelnTrPbmn;
    }

    public String getScrtShnuTrPbmn() {
        return scrtShnuTrPbmn;
    }

    public void setScrtShnuTrPbmn(String scrtShnuTrPbmn) {
        this.scrtShnuTrPbmn = scrtShnuTrPbmn;
    }

    public String getScrtNtbyTrPbmn() {
        return scrtNtbyTrPbmn;
    }

    public void setScrtNtbyTrPbmn(String scrtNtbyTrPbmn) {
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
    }

    public String getIvtrSelnVol() {
        return ivtrSelnVol;
    }

    public void setIvtrSelnVol(String ivtrSelnVol) {
        this.ivtrSelnVol = ivtrSelnVol;
    }

    public String getIvtrShnuVol() {
        return ivtrShnuVol;
    }

    public void setIvtrShnuVol(String ivtrShnuVol) {
        this.ivtrShnuVol = ivtrShnuVol;
    }

    public String getIvtrNtbyQty() {
        return ivtrNtbyQty;
    }

    public void setIvtrNtbyQty(String ivtrNtbyQty) {
        this.ivtrNtbyQty = ivtrNtbyQty;
    }

    public String getIvtrSelnTrPbmn() {
        return ivtrSelnTrPbmn;
    }

    public void setIvtrSelnTrPbmn(String ivtrSelnTrPbmn) {
        this.ivtrSelnTrPbmn = ivtrSelnTrPbmn;
    }

    public String getIvtrShnuTrPbmn() {
        return ivtrShnuTrPbmn;
    }

    public void setIvtrShnuTrPbmn(String ivtrShnuTrPbmn) {
        this.ivtrShnuTrPbmn = ivtrShnuTrPbmn;
    }

    public String getIvtrNtbyTrPbmn() {
        return ivtrNtbyTrPbmn;
    }

    public void setIvtrNtbyTrPbmn(String ivtrNtbyTrPbmn) {
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
    }

    public String getPeFundSelnVol() {
        return peFundSelnVol;
    }

    public void setPeFundSelnVol(String peFundSelnVol) {
        this.peFundSelnVol = peFundSelnVol;
    }

    public String getPeFundShnuVol() {
        return peFundShnuVol;
    }

    public void setPeFundShnuVol(String peFundShnuVol) {
        this.peFundShnuVol = peFundShnuVol;
    }

    public String getPeFundNtbyVol() {
        return peFundNtbyVol;
    }

    public void setPeFundNtbyVol(String peFundNtbyVol) {
        this.peFundNtbyVol = peFundNtbyVol;
    }

    public String getPeFundSelnTrPbmn() {
        return peFundSelnTrPbmn;
    }

    public void setPeFundSelnTrPbmn(String peFundSelnTrPbmn) {
        this.peFundSelnTrPbmn = peFundSelnTrPbmn;
    }

    public String getPeFundShnuTrPbmn() {
        return peFundShnuTrPbmn;
    }

    public void setPeFundShnuTrPbmn(String peFundShnuTrPbmn) {
        this.peFundShnuTrPbmn = peFundShnuTrPbmn;
    }

    public String getPeFundNtbyTrPbmn() {
        return peFundNtbyTrPbmn;
    }

    public void setPeFundNtbyTrPbmn(String peFundNtbyTrPbmn) {
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
    }

    public String getBankSelnVol() {
        return bankSelnVol;
    }

    public void setBankSelnVol(String bankSelnVol) {
        this.bankSelnVol = bankSelnVol;
    }

    public String getBankShnuVol() {
        return bankShnuVol;
    }

    public void setBankShnuVol(String bankShnuVol) {
        this.bankShnuVol = bankShnuVol;
    }

    public String getBankNtbyQty() {
        return bankNtbyQty;
    }

    public void setBankNtbyQty(String bankNtbyQty) {
        this.bankNtbyQty = bankNtbyQty;
    }

    public String getBankSelnTrPbmn() {
        return bankSelnTrPbmn;
    }

    public void setBankSelnTrPbmn(String bankSelnTrPbmn) {
        this.bankSelnTrPbmn = bankSelnTrPbmn;
    }

    public String getBankShnuTrPbmn() {
        return bankShnuTrPbmn;
    }

    public void setBankShnuTrPbmn(String bankShnuTrPbmn) {
        this.bankShnuTrPbmn = bankShnuTrPbmn;
    }

    public String getBankNtbyTrPbmn() {
        return bankNtbyTrPbmn;
    }

    public void setBankNtbyTrPbmn(String bankNtbyTrPbmn) {
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
    }

    public String getInsuSelnVol() {
        return insuSelnVol;
    }

    public void setInsuSelnVol(String insuSelnVol) {
        this.insuSelnVol = insuSelnVol;
    }

    public String getInsuShnuVol() {
        return insuShnuVol;
    }

    public void setInsuShnuVol(String insuShnuVol) {
        this.insuShnuVol = insuShnuVol;
    }

    public String getInsuNtbyQty() {
        return insuNtbyQty;
    }

    public void setInsuNtbyQty(String insuNtbyQty) {
        this.insuNtbyQty = insuNtbyQty;
    }

    public String getInsuSelnTrPbmn() {
        return insuSelnTrPbmn;
    }

    public void setInsuSelnTrPbmn(String insuSelnTrPbmn) {
        this.insuSelnTrPbmn = insuSelnTrPbmn;
    }

    public String getInsuShnuTrPbmn() {
        return insuShnuTrPbmn;
    }

    public void setInsuShnuTrPbmn(String insuShnuTrPbmn) {
        this.insuShnuTrPbmn = insuShnuTrPbmn;
    }

    public String getInsuNtbyTrPbmn() {
        return insuNtbyTrPbmn;
    }

    public void setInsuNtbyTrPbmn(String insuNtbyTrPbmn) {
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
    }

    public String getMrbnSelnVol() {
        return mrbnSelnVol;
    }

    public void setMrbnSelnVol(String mrbnSelnVol) {
        this.mrbnSelnVol = mrbnSelnVol;
    }

    public String getMrbnShnuVol() {
        return mrbnShnuVol;
    }

    public void setMrbnShnuVol(String mrbnShnuVol) {
        this.mrbnShnuVol = mrbnShnuVol;
    }

    public String getMrbnNtbyQty() {
        return mrbnNtbyQty;
    }

    public void setMrbnNtbyQty(String mrbnNtbyQty) {
        this.mrbnNtbyQty = mrbnNtbyQty;
    }

    public String getMrbnSelnTrPbmn() {
        return mrbnSelnTrPbmn;
    }

    public void setMrbnSelnTrPbmn(String mrbnSelnTrPbmn) {
        this.mrbnSelnTrPbmn = mrbnSelnTrPbmn;
    }

    public String getMrbnShnuTrPbmn() {
        return mrbnShnuTrPbmn;
    }

    public void setMrbnShnuTrPbmn(String mrbnShnuTrPbmn) {
        this.mrbnShnuTrPbmn = mrbnShnuTrPbmn;
    }

    public String getMrbnNtbyTrPbmn() {
        return mrbnNtbyTrPbmn;
    }

    public void setMrbnNtbyTrPbmn(String mrbnNtbyTrPbmn) {
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
    }

    public String getFundSelnVol() {
        return fundSelnVol;
    }

    public void setFundSelnVol(String fundSelnVol) {
        this.fundSelnVol = fundSelnVol;
    }

    public String getFundShnuVol() {
        return fundShnuVol;
    }

    public void setFundShnuVol(String fundShnuVol) {
        this.fundShnuVol = fundShnuVol;
    }

    public String getFundNtbyQty() {
        return fundNtbyQty;
    }

    public void setFundNtbyQty(String fundNtbyQty) {
        this.fundNtbyQty = fundNtbyQty;
    }

    public String getFundSelnTrPbmn() {
        return fundSelnTrPbmn;
    }

    public void setFundSelnTrPbmn(String fundSelnTrPbmn) {
        this.fundSelnTrPbmn = fundSelnTrPbmn;
    }

    public String getFundShnuTrPbmn() {
        return fundShnuTrPbmn;
    }

    public void setFundShnuTrPbmn(String fundShnuTrPbmn) {
        this.fundShnuTrPbmn = fundShnuTrPbmn;
    }

    public String getFundNtbyTrPbmn() {
        return fundNtbyTrPbmn;
    }

    public void setFundNtbyTrPbmn(String fundNtbyTrPbmn) {
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
    }

    public String getEtcOrgtSelnVol() {
        return etcOrgtSelnVol;
    }

    public void setEtcOrgtSelnVol(String etcOrgtSelnVol) {
        this.etcOrgtSelnVol = etcOrgtSelnVol;
    }

    public String getEtcOrgtShnuVol() {
        return etcOrgtShnuVol;
    }

    public void setEtcOrgtShnuVol(String etcOrgtShnuVol) {
        this.etcOrgtShnuVol = etcOrgtShnuVol;
    }

    public String getEtcOrgtNtbyVol() {
        return etcOrgtNtbyVol;
    }

    public void setEtcOrgtNtbyVol(String etcOrgtNtbyVol) {
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
    }

    public String getEtcOrgtSelnTrPbmn() {
        return etcOrgtSelnTrPbmn;
    }

    public void setEtcOrgtSelnTrPbmn(String etcOrgtSelnTrPbmn) {
        this.etcOrgtSelnTrPbmn = etcOrgtSelnTrPbmn;
    }

    public String getEtcOrgtShnuTrPbmn() {
        return etcOrgtShnuTrPbmn;
    }

    public void setEtcOrgtShnuTrPbmn(String etcOrgtShnuTrPbmn) {
        this.etcOrgtShnuTrPbmn = etcOrgtShnuTrPbmn;
    }

    public String getEtcOrgtNtbyTrPbmn() {
        return etcOrgtNtbyTrPbmn;
    }

    public void setEtcOrgtNtbyTrPbmn(String etcOrgtNtbyTrPbmn) {
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
    }

    public String getEtcCorpSelnVol() {
        return etcCorpSelnVol;
    }

    public void setEtcCorpSelnVol(String etcCorpSelnVol) {
        this.etcCorpSelnVol = etcCorpSelnVol;
    }

    public String getEtcCorpShnuVol() {
        return etcCorpShnuVol;
    }

    public void setEtcCorpShnuVol(String etcCorpShnuVol) {
        this.etcCorpShnuVol = etcCorpShnuVol;
    }

    public String getEtcCorpNtbyVol() {
        return etcCorpNtbyVol;
    }

    public void setEtcCorpNtbyVol(String etcCorpNtbyVol) {
        this.etcCorpNtbyVol = etcCorpNtbyVol;
    }

    public String getEtcCorpSelnTrPbmn() {
        return etcCorpSelnTrPbmn;
    }

    public void setEtcCorpSelnTrPbmn(String etcCorpSelnTrPbmn) {
        this.etcCorpSelnTrPbmn = etcCorpSelnTrPbmn;
    }

    public String getEtcCorpShnuTrPbmn() {
        return etcCorpShnuTrPbmn;
    }

    public void setEtcCorpShnuTrPbmn(String etcCorpShnuTrPbmn) {
        this.etcCorpShnuTrPbmn = etcCorpShnuTrPbmn;
    }

    public String getEtcCorpNtbyTrPbmn() {
        return etcCorpNtbyTrPbmn;
    }

    public void setEtcCorpNtbyTrPbmn(String etcCorpNtbyTrPbmn) {
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }
    @Override
    public String toString(){
        return "Market{"+
            "id=" + id +
            ", frgnSelnVol='" + frgnSelnVol + '\'' +
            ", frgnShnuVol='" + frgnShnuVol + '\'' +
            ", frgnNtbyQty='" + frgnNtbyQty + '\'' +
            ", frgnSelnTrPbmn='" + frgnSelnTrPbmn + '\'' +
            ", frgnShnuTrPbmn='" + frgnShnuTrPbmn + '\'' +
            ", frgnNtbyTrPbmn='" + frgnNtbyTrPbmn + '\'' +
            ", prsnSelnVol='" + prsnSelnVol + '\'' +
            ", prsnShnuVol='" + prsnShnuVol + '\'' +
            ", prsnNtbyQty='" + prsnNtbyQty + '\'' +
            ", prsnSelnTrPbmn='" + prsnSelnTrPbmn + '\'' +
            ", prsnShnuTrPbmn='" + prsnShnuTrPbmn + '\'' +
            ", prsnNtbyTrPbmn='" + prsnNtbyTrPbmn + '\'' +
            ", orgnSelnVol='" + orgnSelnVol + '\'' +
            ", orgnShnuVol='" + orgnShnuVol + '\'' +
            ", orgnNtbyQty='" + orgnNtbyQty + '\'' +
            ", orgnSelnTrPbmn='" + orgnSelnTrPbmn + '\'' +
            ", orgnShnuTrPbmn='" + orgnShnuTrPbmn + '\'' +
            ", orgnNtbyTrPbmn='" + orgnNtbyTrPbmn + '\'' +
            ", scrtSelnVol='" + scrtSelnVol + '\'' +
            ", scrtShnuVol='" + scrtShnuVol + '\'' +
            ", scrtNtbyQty='" + scrtNtbyQty + '\'' +
            ", scrtSelnTrPbmn='" + scrtSelnTrPbmn + '\'' +
            ", scrtShnuTrPbmn='" + scrtShnuTrPbmn + '\'' +
            ", scrtNtbyTrPbmn='" + scrtNtbyTrPbmn + '\'' +
            ", ivtrSelnVol='" + ivtrSelnVol + '\'' +
            ", ivtrShnuVol='" + ivtrShnuVol + '\'' +
            ", ivtrNtbyQty='" + ivtrNtbyQty + '\'' +
            ", ivtrSelnTrPbmn='" + ivtrSelnTrPbmn + '\'' +
            ", ivtrShnuTrPbmn='" + ivtrShnuTrPbmn + '\'' +
            ", ivtrNtbyTrPbmn='" + ivtrNtbyTrPbmn + '\'' +
            ", peFundSelnVol='" + peFundSelnVol + '\'' +
            ", peFundShnuVol='" + peFundShnuVol + '\'' +
            ", peFundNtbyVol='" + peFundNtbyVol + '\'' +
            ", peFundSelnTrPbmn='" + peFundSelnTrPbmn + '\'' +
            ", peFundShnuTrPbmn='" + peFundShnuTrPbmn + '\'' +
            ", peFundNtbyTrPbmn='" + peFundNtbyTrPbmn + '\'' +
            ", bankSelnVol='" + bankSelnVol + '\'' +
            ", bankShnuVol='" + bankShnuVol + '\'' +
            ", bankNtbyQty='" + bankNtbyQty + '\'' +
            ", bankSelnTrPbmn='" + bankSelnTrPbmn + '\'' +
            ", bankShnuTrPbmn='" + bankShnuTrPbmn + '\'' +
            ", bankNtbyTrPbmn='" + bankNtbyTrPbmn + '\'' +
            ", insuSelnVol='" + insuSelnVol + '\'' +
            ", insuShnuVol='" + insuShnuVol + '\'' +
            ", insuNtbyQty='" + insuNtbyQty + '\'' +
            ", insuSelnTrPbmn='" + insuSelnTrPbmn + '\'' +
            ", insuShnuTrPbmn='" + insuShnuTrPbmn + '\'' +
            ", insuNtbyTrPbmn='" + insuNtbyTrPbmn + '\'' +
            ", mrbnSelnVol='" + mrbnSelnVol + '\'' +
            ", mrbnShnuVol='" + mrbnShnuVol + '\'' +
            ", mrbnNtbyQty='" + mrbnNtbyQty + '\'' +
            ", mrbnSelnTrPbmn='" + mrbnSelnTrPbmn + '\'' +
            ", mrbnShnuTrPbmn='" + mrbnShnuTrPbmn + '\'' +
            ", mrbnNtbyTrPbmn='" + mrbnNtbyTrPbmn + '\'' +
            ", fundSelnVol='" + fundSelnVol + '\'' +
            ", fundShnuVol='" + fundShnuVol + '\'' +
            ", fundNtbyQty='" + fundNtbyQty + '\'' +
            ", fundSelnTrPbmn='" + fundSelnTrPbmn + '\'' +
            ", fundShnuTrPbmn='" + fundShnuTrPbmn + '\'' +
            ", fundNtbyTrPbmn='" + fundNtbyTrPbmn + '\'' +
            ", etcOrgtSelnVol='" + etcOrgtSelnVol + '\'' +
            ", etcOrgtShnuVol='" + etcOrgtShnuVol + '\'' +
            ", etcOrgtNtbyVol='" + etcOrgtNtbyVol + '\'' +
            ", etcOrgtSelnTrPbmn='" + etcOrgtSelnTrPbmn + '\'' +
            ", etcOrgtShnuTrPbmn='" + etcOrgtShnuTrPbmn + '\'' +
            ", etcOrgtNtbyTrPbmn='" + etcOrgtNtbyTrPbmn + '\'' +
            ", etcCorpSelnVol='" + etcCorpSelnVol + '\'' +
            ", etcCorpShnuVol='" + etcCorpShnuVol + '\'' +
            ", etcCorpNtbyVol='" + etcCorpNtbyVol + '\'' +
            ", etcCorpSelnTrPbmn='" + etcCorpSelnTrPbmn + '\'' +
            ", etcCorpShnuTrPbmn='" + etcCorpShnuTrPbmn + '\'' +
            ", etcCorpNtbyTrPbmn='" + etcCorpNtbyTrPbmn + '\'' +
            '}';
    }
}
