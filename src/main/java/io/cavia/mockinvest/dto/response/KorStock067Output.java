package io.cavia.mockinvest.dto.response;

public class KorStock067Output {
    private String pdno;
    private String prdt_name;
    private String std_idst_clsf_cd_name;

    public KorStock067Output() {
    }

    public KorStock067Output(String pdno, String prdt_name, String std_idst_clsf_cd_name) {
        this.pdno = pdno;
        this.prdt_name = prdt_name;
        this.std_idst_clsf_cd_name = std_idst_clsf_cd_name;
    }

    public String getPdno() {
        return pdno;
    }

    public void setPdno(String pdno) {
        this.pdno = pdno;
    }

    public String getPrdt_name() {
        return prdt_name;
    }

    public void setPrdt_name(String prdt_name) {
        this.prdt_name = prdt_name;
    }

    public String getStd_idst_clsf_cd_name() {
        return std_idst_clsf_cd_name;
    }

    public void setStd_idst_clsf_cd_name(String std_idst_clsf_cd_name) {
        this.std_idst_clsf_cd_name = std_idst_clsf_cd_name;
    }
}
