package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorIndeustry065Dto {
    /**
     * 국내업종 일자별 지수Dto입니다
     */
    @JsonProperty("output")
    private KorIndeustry065Output output;
    @JsonProperty("bstp_nmix_prpr")
    private String bstpNmixPrpr;

    public KorIndeustry065Dto() {
    }

    public KorIndeustry065Dto(KorIndeustry065Output output, String bstpNmixPrpr) {
        this.output = output;
        this.bstpNmixPrpr = bstpNmixPrpr;
    }

    public KorIndeustry065Output getOutput() {
        return output;
    }

    public void setOutput(KorIndeustry065Output output) {
        this.output = output;
    }

    public String getBstpNmixPrpr() {
        return bstpNmixPrpr;
    }

    public void setBstpNmixPrpr(String bstpNmixPrpr) {
        this.bstpNmixPrpr = bstpNmixPrpr;
    }
}
