package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock145Dto {
    /**
     * 예탁원정보(배당일정)Dto입니다
     */
    @JsonProperty("output1")
    private KorStock145Output output;
    @JsonProperty("divi_kind")
    private String diviKind;
    @JsonProperty("divi_rate")
    private String diviRate;
    @JsonProperty("stk_divi_rate")
    private String stkDiviRate;
    @JsonProperty("divi_pay_dt")
    private String diviPayDt;

    public KorStock145Dto() {
    }

    public KorStock145Dto(KorStock145Output output, String diviKind, String diviRate, String stkDiviRate, String diviPayDt) {
        this.output = output;
        this.diviKind = diviKind;
        this.diviRate = diviRate;
        this.stkDiviRate = stkDiviRate;
        this.diviPayDt = diviPayDt;
    }

    public KorStock145Output getOutput() {
        return output;
    }

    public void setOutput(KorStock145Output output) {
        this.output = output;
    }

    public String getDiviKind() {
        return diviKind;
    }

    public void setDiviKind(String diviKind) {
        this.diviKind = diviKind;
    }

    public String getDiviRate() {
        return diviRate;
    }

    public void setDiviRate(String diviRate) {
        this.diviRate = diviRate;
    }

    public String getStkDiviRate() {
        return stkDiviRate;
    }

    public void setStkDiviRate(String stkDiviRate) {
        this.stkDiviRate = stkDiviRate;
    }

    public String getDiviPayDt() {
        return diviPayDt;
    }

    public void setDiviPayDt(String diviPayDt) {
        this.diviPayDt = diviPayDt;
    }
}
