package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorMarketNow074Dto {
    /**
     * 시장별 투자자 매매동향(시세)Dto입니다
     */
    @JsonProperty("output")
    private KorMarketNow074Output output;

    @JsonProperty("frgn_seln_vol")
    private String frgnSelnVol;  // 외국인 매도 거래량

    @JsonProperty("frgn_shnu_vol")
    private String frgnShnuVol;  // 외국인 매수2 거래량

    @JsonProperty("frgn_ntby_qty")
    private String frgnNtbyQty;  // 외국인 순매수 수량

    @JsonProperty("frgn_seln_tr_pbmn")
    private String frgnSelnTrPbmn;  // 외국인 매도 거래 대금

    @JsonProperty("frgn_shnu_tr_pbmn")
    private String frgnShnuTrPbmn;  // 외국인 매수2 거래 대금

    @JsonProperty("frgn_ntby_tr_pbmn")
    private String frgnNtbyTrPbmn;  // 외국인 순매수 거래 대금

    // ------ 개인 ------
    @JsonProperty("prsn_seln_vol")
    private String prsnSelnVol;  // 개인 매도 거래량

    @JsonProperty("prsn_shnu_vol")
    private String prsnShnuVol;  // 개인 매수2 거래량

    @JsonProperty("prsn_ntby_qty")
    private String prsnNtbyQty;  // 개인 순매수 수량

    @JsonProperty("prsn_seln_tr_pbmn")
    private String prsnSelnTrPbmn;  // 개인 매도 거래 대금

    @JsonProperty("prsn_shnu_tr_pbmn")
    private String prsnShnuTrPbmn;  // 개인 매수2 거래 대금

    @JsonProperty("prsn_ntby_tr_pbmn")
    private String prsnNtbyTrPbmn;  // 개인 순매수 거래 대금

    // ------ 기관 ------
    @JsonProperty("orgn_seln_vol")
    private String orgnSelnVol;  // 기관계 매도 거래량

    @JsonProperty("orgn_shnu_vol")
    private String orgnShnuVol;  // 기관계 매수2 거래량

    @JsonProperty("orgn_ntby_qty")
    private String orgnNtbyQty;  // 기관계 순매수 수량

    @JsonProperty("orgn_seln_tr_pbmn")
    private String orgnSelnTrPbmn;  // 기관계 매도 거래 대금

    @JsonProperty("orgn_shnu_tr_pbmn")
    private String orgnShnuTrPbmn;  // 기관계 매수2 거래 대금

    @JsonProperty("orgn_ntby_tr_pbmn")
    private String orgnNtbyTrPbmn;  // 기관계 순매수 거래 대금

    // ------ 증권 ------
    @JsonProperty("scrt_seln_vol")
    private String scrtSelnVol;  // 증권 매도 거래량

    @JsonProperty("scrt_shnu_vol")
    private String scrtShnuVol;  // 증권 매수2 거래량

    @JsonProperty("scrt_ntby_qty")
    private String scrtNtbyQty;  // 증권 순매수 수량

    @JsonProperty("scrt_seln_tr_pbmn")
    private String scrtSelnTrPbmn;  // 증권 매도 거래 대금

    @JsonProperty("scrt_shnu_tr_pbmn")
    private String scrtShnuTrPbmn;  // 증권 매수2 거래 대금

    @JsonProperty("scrt_ntby_tr_pbmn")
    private String scrtNtbyTrPbmn;  // 증권 순매수 거래 대금

    // ------ 투자신탁 ------
    @JsonProperty("ivtr_seln_vol")
    private String ivtrSelnVol;  // 투자신탁 매도 거래량

    @JsonProperty("ivtr_shnu_vol")
    private String ivtrShnuVol;  // 투자신탁 매수2 거래량

    @JsonProperty("ivtr_ntby_qty")
    private String ivtrNtbyQty;  // 투자신탁 순매수 수량

    @JsonProperty("ivtr_seln_tr_pbmn")
    private String ivtrSelnTrPbmn;  // 투자신탁 매도 거래 대금

    @JsonProperty("ivtr_shnu_tr_pbmn")
    private String ivtrShnuTrPbmn;  // 투자신탁 매수2 거래 대금

    @JsonProperty("ivtr_ntby_tr_pbmn")
    private String ivtrNtbyTrPbmn;  // 투자신탁 순매수 거래 대금

    // ------ 사모 펀드 ------
    @JsonProperty("pe_fund_seln_vol")
    private String peFundSelnVol;  // 사모 펀드 매도 거래량

    @JsonProperty("pe_fund_shnu_vol")
    private String peFundShnuVol;  // 사모 펀드 매수2 거래량

    @JsonProperty("pe_fund_ntby_vol")
    private String peFundNtbyVol;  // 사모 펀드 순매수 거래량

    @JsonProperty("pe_fund_seln_tr_pbmn")
    private String peFundSelnTrPbmn; // 사모 펀드 매도 거래 대금

    @JsonProperty("pe_fund_shnu_tr_pbmn")
    private String peFundShnuTrPbmn; // 사모 펀드 매수2 거래 대금

    @JsonProperty("pe_fund_ntby_tr_pbmn")
    private String peFundNtbyTrPbmn; // 사모 펀드 순매수 거래 대금

    // ------ 은행 ------
    @JsonProperty("bank_seln_vol")
    private String bankSelnVol;  // 은행 매도 거래량

    @JsonProperty("bank_shnu_vol")
    private String bankShnuVol;  // 은행 매수2 거래량

    @JsonProperty("bank_ntby_qty")
    private String bankNtbyQty;  // 은행 순매수 수량

    @JsonProperty("bank_seln_tr_pbmn")
    private String bankSelnTrPbmn; // 은행 매도 거래 대금

    @JsonProperty("bank_shnu_tr_pbmn")
    private String bankShnuTrPbmn; // 은행 매수2 거래 대금

    @JsonProperty("bank_ntby_tr_pbmn")
    private String bankNtbyTrPbmn; // 은행 순매수 거래 대금

    // ------ 보험 ------
    @JsonProperty("insu_seln_vol")
    private String insuSelnVol;  // 보험 매도 거래량

    @JsonProperty("insu_shnu_vol")
    private String insuShnuVol;  // 보험 매수2 거래량

    @JsonProperty("insu_ntby_qty")
    private String insuNtbyQty;  // 보험 순매수 수량

    @JsonProperty("insu_seln_tr_pbmn")
    private String insuSelnTrPbmn;  // 보험 매도 거래 대금

    @JsonProperty("insu_shnu_tr_pbmn")
    private String insuShnuTrPbmn;  // 보험 매수2 거래 대금

    @JsonProperty("insu_ntby_tr_pbmn")
    private String insuNtbyTrPbmn;  // 보험 순매수 거래 대금

    // ------ 종금 ------
    @JsonProperty("mrbn_seln_vol")
    private String mrbnSelnVol;  // 종금 매도 거래량

    @JsonProperty("mrbn_shnu_vol")
    private String mrbnShnuVol;  // 종금 매수2 거래량

    @JsonProperty("mrbn_ntby_qty")
    private String mrbnNtbyQty;  // 종금 순매수 수량

    @JsonProperty("mrbn_seln_tr_pbmn")
    private String mrbnSelnTrPbmn; // 종금 매도 거래 대금

    @JsonProperty("mrbn_shnu_tr_pbmn")
    private String mrbnShnuTrPbmn; // 종금 매수2 거래 대금

    @JsonProperty("mrbn_ntby_tr_pbmn")
    private String mrbnNtbyTrPbmn; // 종금 순매수 거래 대금

    // ------ 기금 ------
    @JsonProperty("fund_seln_vol")
    private String fundSelnVol;  // 기금 매도 거래량

    @JsonProperty("fund_shnu_vol")
    private String fundShnuVol;  // 기금 매수2 거래량

    @JsonProperty("fund_ntby_qty")
    private String fundNtbyQty;  // 기금 순매수 수량

    @JsonProperty("fund_seln_tr_pbmn")
    private String fundSelnTrPbmn; // 기금 매도 거래 대금

    @JsonProperty("fund_shnu_tr_pbmn")
    private String fundShnuTrPbmn; // 기금 매수2 거래 대금

    @JsonProperty("fund_ntby_tr_pbmn")
    private String fundNtbyTrPbmn; // 기금 순매수 거래 대금

    // ------ 기타 단체 ------
    @JsonProperty("etc_orgt_seln_vol")
    private String etcOrgtSelnVol;  // 기타 단체 매도 거래량

    @JsonProperty("etc_orgt_shnu_vol")
    private String etcOrgtShnuVol;  // 기타 단체 매수2 거래량

    @JsonProperty("etc_orgt_ntby_vol")
    private String etcOrgtNtbyVol; // 기타 단체 순매수 거래량

    @JsonProperty("etc_orgt_seln_tr_pbmn")
    private String etcOrgtSelnTrPbmn; // 기타 단체 매도 거래 대금

    @JsonProperty("etc_orgt_shnu_tr_pbmn")
    private String etcOrgtShnuTrPbmn; // 기타 단체 매수2 거래 대금

    @JsonProperty("etc_orgt_ntby_tr_pbmn")
    private String etcOrgtNtbyTrPbmn; // 기타 단체 순매수 거래 대금

    // ------ 기타 법인 ------
    @JsonProperty("etc_corp_seln_vol")
    private String etcCorpSelnVol;   // 기타 법인 매도 거래량

    @JsonProperty("etc_corp_shnu_vol")
    private String etcCorpShnuVol;   // 기타 법인 매수2 거래량

    @JsonProperty("etc_corp_ntby_vol")
    private String etcCorpNtbyVol;   // 기타 법인 순매수 거래량

    @JsonProperty("etc_corp_seln_tr_pbmn")
    private String etcCorpSelnTrPbmn;   // 기타 법인 매도 거래 대금

    @JsonProperty("etc_corp_shnu_tr_pbmn")
    private String etcCorpShnuTrPbmn;   // 기타 법인 매수2 거래 대금

    @JsonProperty("etc_corp_ntby_tr_pbmn")
    private String etcCorpNtbyTrPbmn;

    public KorMarketNow074Dto(KorMarketNow074Output output) {
    }

    public KorMarketNow074Dto(KorMarketNow074Output output, String frgnSelnVol, String frgnShnuVol, String frgnNtbyQty,
                              String frgnSelnTrPbmn, String frgnShnuTrPbmn, String frgnNtbyTrPbmn, String prsnSelnVol,
                              String prsnShnuVol, String prsnNtbyQty, String prsnSelnTrPbmn, String prsnShnuTrPbmn,
                              String prsnNtbyTrPbmn, String orgnSelnVol, String orgnShnuVol, String orgnNtbyQty,
                              String orgnSelnTrPbmn, String orgnShnuTrPbmn, String orgnNtbyTrPbmn, String scrtSelnVol,
                              String scrtShnuVol, String scrtNtbyQty, String scrtSelnTrPbmn, String scrtShnuTrPbmn,
                              String scrtNtbyTrPbmn, String ivtrSelnVol, String ivtrShnuVol, String ivtrNtbyQty,
                              String ivtrSelnTrPbmn, String ivtrShnuTrPbmn, String ivtrNtbyTrPbmn, String peFundSelnVol,
                              String peFundShnuVol, String peFundNtbyVol, String peFundSelnTrPbmn, String peFundShnuTrPbmn,
                              String peFundNtbyTrPbmn, String bankSelnVol, String bankShnuVol, String bankNtbyQty,
                              String bankSelnTrPbmn, String bankShnuTrPbmn, String bankNtbyTrPbmn, String insuSelnVol,
                              String insuShnuVol, String insuNtbyQty, String insuSelnTrPbmn, String insuShnuTrPbmn,
                              String insuNtbyTrPbmn, String mrbnSelnVol, String mrbnShnuVol, String mrbnNtbyQty, String mrbnSelnTrPbmn,
                              String mrbnShnuTrPbmn, String mrbnNtbyTrPbmn, String fundSelnVol, String fundShnuVol, String fundNtbyQty,
                              String fundSelnTrPbmn, String fundShnuTrPbmn, String fundNtbyTrPbmn, String etcOrgtSelnVol,
                              String etcOrgtShnuVol, String etcOrgtNtbyVol, String etcOrgtSelnTrPbmn, String etcOrgtShnuTrPbmn,
                              String etcOrgtNtbyTrPbmn, String etcCorpSelnVol, String etcCorpShnuVol, String etcCorpNtbyVol,
                              String etcCorpSelnTrPbmn, String etcCorpShnuTrPbmn, String etcCorpNtbyTrPbmn) {
        this.output = output;
        this.frgnSelnVol = frgnSelnVol;
        this.frgnShnuVol = frgnShnuVol;
        this.frgnNtbyQty = frgnNtbyQty;
        this.frgnSelnTrPbmn = frgnSelnTrPbmn;
        this.frgnShnuTrPbmn = frgnShnuTrPbmn;
        this.frgnNtbyTrPbmn = frgnNtbyTrPbmn;
        this.prsnSelnVol = prsnSelnVol;
        this.prsnShnuVol = prsnShnuVol;
        this.prsnNtbyQty = prsnNtbyQty;
        this.prsnSelnTrPbmn = prsnSelnTrPbmn;
        this.prsnShnuTrPbmn = prsnShnuTrPbmn;
        this.prsnNtbyTrPbmn = prsnNtbyTrPbmn;
        this.orgnSelnVol = orgnSelnVol;
        this.orgnShnuVol = orgnShnuVol;
        this.orgnNtbyQty = orgnNtbyQty;
        this.orgnSelnTrPbmn = orgnSelnTrPbmn;
        this.orgnShnuTrPbmn = orgnShnuTrPbmn;
        this.orgnNtbyTrPbmn = orgnNtbyTrPbmn;
        this.scrtSelnVol = scrtSelnVol;
        this.scrtShnuVol = scrtShnuVol;
        this.scrtNtbyQty = scrtNtbyQty;
        this.scrtSelnTrPbmn = scrtSelnTrPbmn;
        this.scrtShnuTrPbmn = scrtShnuTrPbmn;
        this.scrtNtbyTrPbmn = scrtNtbyTrPbmn;
        this.ivtrSelnVol = ivtrSelnVol;
        this.ivtrShnuVol = ivtrShnuVol;
        this.ivtrNtbyQty = ivtrNtbyQty;
        this.ivtrSelnTrPbmn = ivtrSelnTrPbmn;
        this.ivtrShnuTrPbmn = ivtrShnuTrPbmn;
        this.ivtrNtbyTrPbmn = ivtrNtbyTrPbmn;
        this.peFundSelnVol = peFundSelnVol;
        this.peFundShnuVol = peFundShnuVol;
        this.peFundNtbyVol = peFundNtbyVol;
        this.peFundSelnTrPbmn = peFundSelnTrPbmn;
        this.peFundShnuTrPbmn = peFundShnuTrPbmn;
        this.peFundNtbyTrPbmn = peFundNtbyTrPbmn;
        this.bankSelnVol = bankSelnVol;
        this.bankShnuVol = bankShnuVol;
        this.bankNtbyQty = bankNtbyQty;
        this.bankSelnTrPbmn = bankSelnTrPbmn;
        this.bankShnuTrPbmn = bankShnuTrPbmn;
        this.bankNtbyTrPbmn = bankNtbyTrPbmn;
        this.insuSelnVol = insuSelnVol;
        this.insuShnuVol = insuShnuVol;
        this.insuNtbyQty = insuNtbyQty;
        this.insuSelnTrPbmn = insuSelnTrPbmn;
        this.insuShnuTrPbmn = insuShnuTrPbmn;
        this.insuNtbyTrPbmn = insuNtbyTrPbmn;
        this.mrbnSelnVol = mrbnSelnVol;
        this.mrbnShnuVol = mrbnShnuVol;
        this.mrbnNtbyQty = mrbnNtbyQty;
        this.mrbnSelnTrPbmn = mrbnSelnTrPbmn;
        this.mrbnShnuTrPbmn = mrbnShnuTrPbmn;
        this.mrbnNtbyTrPbmn = mrbnNtbyTrPbmn;
        this.fundSelnVol = fundSelnVol;
        this.fundShnuVol = fundShnuVol;
        this.fundNtbyQty = fundNtbyQty;
        this.fundSelnTrPbmn = fundSelnTrPbmn;
        this.fundShnuTrPbmn = fundShnuTrPbmn;
        this.fundNtbyTrPbmn = fundNtbyTrPbmn;
        this.etcOrgtSelnVol = etcOrgtSelnVol;
        this.etcOrgtShnuVol = etcOrgtShnuVol;
        this.etcOrgtNtbyVol = etcOrgtNtbyVol;
        this.etcOrgtSelnTrPbmn = etcOrgtSelnTrPbmn;
        this.etcOrgtShnuTrPbmn = etcOrgtShnuTrPbmn;
        this.etcOrgtNtbyTrPbmn = etcOrgtNtbyTrPbmn;
        this.etcCorpSelnVol = etcCorpSelnVol;
        this.etcCorpShnuVol = etcCorpShnuVol;
        this.etcCorpNtbyVol = etcCorpNtbyVol;
        this.etcCorpSelnTrPbmn = etcCorpSelnTrPbmn;
        this.etcCorpShnuTrPbmn = etcCorpShnuTrPbmn;
        this.etcCorpNtbyTrPbmn = etcCorpNtbyTrPbmn;
    }

    public KorMarketNow074Output getOutput() {
        return output;
    }

    public void setOutput(KorMarketNow074Output output) {
        this.output = output;
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
}
