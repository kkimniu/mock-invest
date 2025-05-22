package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock067Dto {
    /**
     * 주식기본조회Dto입니다
     */
    @JsonProperty("output")
    KorStock067Output output;
    @JsonProperty("pdno")
    String pdno;
    @JsonProperty("prdt_name")
    String prdtName;
    @JsonProperty("std_idst_clsf_cd_name")
    String stdIdstClsfCdName;


    public KorStock067Dto() {
    }

    public KorStock067Dto(KorStock067Output output, String pdno, String prdtName, String stdIdstClsfCdName) {
        this.output = output;
        this.pdno = pdno;
        this.prdtName = prdtName;
        this.stdIdstClsfCdName = stdIdstClsfCdName;
    }

    public KorStock067Output getOutput() {
        return output;
    }

    public void setOutput(KorStock067Output output) {
        this.output = output;
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

    public String getStdIdstClsfCdName() {
        return stdIdstClsfCdName;
    }

    public void setStdIdstClsfCdName(String stdIdstClsfCdName) {
        this.stdIdstClsfCdName = stdIdstClsfCdName;
    }
}
