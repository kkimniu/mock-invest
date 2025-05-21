package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorIndustry063Dto {
    /**
     * 국내업종 현재 지수Dto입니다
     */
    @JsonProperty("output")
    private KorIndustry063Output output;
    @JsonProperty("bstp_nmix_prpr")
    private String bstpNmixPrpr;
    @JsonProperty("bstp_nmix_prdy_vrss")
    private String bstpNmixPrdyVrss;
    @JsonProperty("bstp_nmix_prdy_ctrt")
    private String bstpNmixPrdyCtrt;

    public KorIndustry063Dto() {
    }

    public KorIndustry063Dto(KorIndustry063Output output, String bstpNmixPrpr, String bstpNmixPrdyVrss, String bstpNmixPrdyCtrt) {
        this.output = output;
        this.bstpNmixPrpr = bstpNmixPrpr;
        this.bstpNmixPrdyVrss = bstpNmixPrdyVrss;
        this.bstpNmixPrdyCtrt = bstpNmixPrdyCtrt;
    }

    public KorIndustry063Output getOutput() {
        return output;
    }

    public void setOutput(KorIndustry063Output output) {
        this.output = output;
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
}
