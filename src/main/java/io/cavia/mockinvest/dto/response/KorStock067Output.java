package io.cavia.mockinvest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KorStock067Output implements StockDtoOutput {

    @JsonProperty("pdno")
    private String pdno;
    @JsonProperty("prdt_name")
    private String prdtName;
    @JsonProperty("std_idst_clsf_cd_name")
    private String stdIdstClsfCdName;

    public KorStock067Output() {
    }

    public KorStock067Output(String pdno, String prdt_name, String std_idst_clsf_cd_name) {
        this.pdno = pdno;
        this.prdtName = prdt_name;
        this.stdIdstClsfCdName = std_idst_clsf_cd_name;
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

    @Override
    public String toString() {
        return "KorStock067Output{" +
            "pdno='" + pdno + '\'' +
            ", prdt_name='" + prdtName + '\'' +
            ", std_idst_clsf_cd_name='" + stdIdstClsfCdName + '\'' +
            '}';
    }
}
