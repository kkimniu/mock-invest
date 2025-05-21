package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock213Dto {
    /**
     * 주식일별분봉조회Dto입니다
     */
    @JsonProperty("output1")
    private KorStock213Output1 output1;
    @JsonProperty("output2")
    private KorStock213Output2 output2;
    @JsonProperty("stck_prdy_clpr")
    private String stckPrdyClpr;
    @JsonProperty("stck_prpr")
    private String stckPrpr;
    @JsonProperty("stck_hgpr")
    private String stckHgpr;
    @JsonProperty("stck_lwpr")
    private String stckLwpr;
    @JsonProperty("acml_vol")
    private String acmlVol;

    public KorStock213Dto() {
    }

    public KorStock213Dto(KorStock213Output1 output1, KorStock213Output2 output2, String stckPrdyClpr, String stckPrpr,
                          String stckHgpr, String stckLwpr, String acmlVol) {
        this.output1 = output1;
        this.output2 = output2;
        this.stckPrdyClpr = stckPrdyClpr;
        this.stckPrpr = stckPrpr;
        this.stckHgpr = stckHgpr;
        this.stckLwpr = stckLwpr;
        this.acmlVol = acmlVol;
    }

    public KorStock213Output1 getOutput1() {
        return output1;
    }

    public void setOutput1(KorStock213Output1 output1) {
        this.output1 = output1;
    }

    public KorStock213Output2 getOutput2() {
        return output2;
    }

    public void setOutput2(KorStock213Output2 output2) {
        this.output2 = output2;
    }

    public String getStckPrdyClpr() {
        return stckPrdyClpr;
    }

    public void setStckPrdyClpr(String stckPrdyClpr) {
        this.stckPrdyClpr = stckPrdyClpr;
    }

    public String getStckPrpr() {
        return stckPrpr;
    }

    public void setStckPrpr(String stckPrpr) {
        this.stckPrpr = stckPrpr;
    }

    public String getStckHgpr() {
        return stckHgpr;
    }

    public void setStckHgpr(String stckHgpr) {
        this.stckHgpr = stckHgpr;
    }

    public String getStckLwpr() {
        return stckLwpr;
    }

    public void setStckLwpr(String stckLwpr) {
        this.stckLwpr = stckLwpr;
    }

    public String getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(String acmlVol) {
        this.acmlVol = acmlVol;
    }
}
