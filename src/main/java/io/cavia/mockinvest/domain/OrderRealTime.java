package io.cavia.mockinvest.domain;

import jakarta.persistence.Column;

public class OrderRealTime {

    @Column(name = "mksc_shrn_iscd")
    private String mkscShrnIscd;

    @Column(name = "bsop_hour")
    private String bsopHour;

    @Column(name = "hour_cls_code")
    private String hourClsCode;

    @Column(name = "askp1")
    private String askp1;

    @Column(name = "askp2")
    private String askp2;

    @Column(name = "askp3")
    private String askp3;

    @Column(name = "askp4")
    private String askp4;

    @Column(name = "askp5")
    private String askp5;

    @Column(name = "askp6")
    private String askp6;

    @Column(name = "askp7")
    private String askp7;

    @Column(name = "askp8")
    private String askp8;

    @Column(name = "askp9")
    private String askp9;

    @Column(name = "askp10")
    private String askp10;

    @Column(name = "bidp1")
    private String bidp1;

    @Column(name = "bidp2")
    private String bidp2;

    @Column(name = "bidp3")
    private String bidp3;

    @Column(name = "bidp4")
    private String bidp4;

    @Column(name = "bidp5")
    private String bidp5;

    @Column(name = "bidp6")
    private String bidp6;

    @Column(name = "bidp7")
    private String bidp7;

    @Column(name = "bidp8")
    private String bidp8;

    @Column(name = "bidp9")
    private String bidp9;

    @Column(name = "bidp10")
    private String bidp10;

    @Column(name = "askp_rsqn1")
    private String askpRsqn1;

    @Column(name = "askp_rsqn2")
    private String askpRsqn2;

    @Column(name = "askp_rsqn3")
    private String askpRsqn3;

    @Column(name = "askp_rsqn4")
    private String askpRsqn4;

    @Column(name = "askp_rsqn5")
    private String askpRsqn5;

    @Column(name = "askp_rsqn6")
    private String askpRsqn6;

    @Column(name = "askp_rsqn7")
    private String askpRsqn7;

    @Column(name = "askp_rsqn8")
    private String askpRsqn8;

    @Column(name = "askp_rsqn9")
    private String askpRsqn9;

    @Column(name = "askp_rsqn10")
    private String askpRsqn10;

    @Column(name = "bidp_rsqn1")
    private String bidpRsqn1;

    @Column(name = "bidp_rsqn2")
    private String bidpRsqn2;

    @Column(name = "bidp_rsqn3")
    private String bidpRsqn3;

    @Column(name = "bidp_rsqn4")
    private String bidpRsqn4;

    @Column(name = "bidp_rsqn5")
    private String bidpRsqn5;

    @Column(name = "bidp_rsqn6")
    private String bidpRsqn6;

    @Column(name = "bidp_rsqn7")
    private String bidpRsqn7;

    @Column(name = "bidp_rsqn8")
    private String bidpRsqn8;

    @Column(name = "bidp_rsqn9")
    private String bidpRsqn9;

    @Column(name = "bidp_rsqn10")
    private String bidpRsqn10;

    @Column(name = "total_askp_rsqn")
    private String totalAskpRsqn;

    @Column(name = "total_bidp_rsqn")
    private String totalBidpRsqn;

    @Column(name = "ovtm_total_askp_rsqn")
    private String ovtmTotalAskpRsqn;

    @Column(name = "ovtm_total_bidp_rsqn")
    private String ovtmTotalBidpRsqn;

    @Column(name = "antc_cnpr")
    private String antcCnpr;

    @Column(name = "antc_cnqn")
    private String antcCnqn;

    @Column(name = "antc_vol")
    private String antcVol;

    @Column(name = "antc_cntg_vrss")
    private String antcCntgVrss;

    @Column(name = "antc_cntg_vrss_sign")
    private String antcCntgVrssSign;

    @Column(name = "antc_cntg_prdy_ctrt")
    private String antcCntgPrdyCtrt;

    @Column(name = "acml_vol")
    private String acmlVol;

    @Column(name = "total_askp_rsqn_icdc")
    private String totalAskpRsqnIcdc;

    @Column(name = "total_bidp_rsqn_icdc")
    private String totalBidpRsqnIcdc;

    @Column(name = "ovtm_total_askp_icdc")
    private String ovtmTotalAskpIcdc;

    @Column(name = "ovtm_total_bidp_icdc")
    private String ovtmTotalBidpIcdc;

    public OrderRealTime() {
    }

    public OrderRealTime(String mkscShrnIscd, String bsopHour, String hourClsCode, String askp1, String askp2, String askp3,
                         String askp4, String askp5, String askp6, String askp7, String askp8, String askp9, String askp10,
                         String bidp1, String bidp2, String bidp3, String bidp4, String bidp5, String bidp6, String bidp7,
                         String bidp8, String bidp9, String bidp10, String askpRsqn1, String askpRsqn2, String askpRsqn3,
                         String askpRsqn4, String askpRsqn5, String askpRsqn6, String askpRsqn7, String askpRsqn8,
                         String askpRsqn9, String askpRsqn10, String bidpRsqn1, String bidpRsqn2, String bidpRsqn3,
                         String bidpRsqn4, String bidpRsqn5, String bidpRsqn6, String bidpRsqn7, String bidpRsqn8,
                         String bidpRsqn9, String bidpRsqn10, String totalAskpRsqn, String totalBidpRsqn,
                         String ovtmTotalAskpRsqn, String ovtmTotalBidpRsqn, String antcCnpr, String antcCnqn, String antcVol,
                         String antcCntgVrss, String antcCntgVrssSign, String antcCntgPrdyCtrt, String acmlVol,
                         String totalAskpRsqnIcdc, String totalBidpRsqnIcdc, String ovtmTotalAskpIcdc, String ovtmTotalBidpIcdc) {
        this.mkscShrnIscd = mkscShrnIscd;
        this.bsopHour = bsopHour;
        this.hourClsCode = hourClsCode;
        this.askp1 = askp1;
        this.askp2 = askp2;
        this.askp3 = askp3;
        this.askp4 = askp4;
        this.askp5 = askp5;
        this.askp6 = askp6;
        this.askp7 = askp7;
        this.askp8 = askp8;
        this.askp9 = askp9;
        this.askp10 = askp10;
        this.bidp1 = bidp1;
        this.bidp2 = bidp2;
        this.bidp3 = bidp3;
        this.bidp4 = bidp4;
        this.bidp5 = bidp5;
        this.bidp6 = bidp6;
        this.bidp7 = bidp7;
        this.bidp8 = bidp8;
        this.bidp9 = bidp9;
        this.bidp10 = bidp10;
        this.askpRsqn1 = askpRsqn1;
        this.askpRsqn2 = askpRsqn2;
        this.askpRsqn3 = askpRsqn3;
        this.askpRsqn4 = askpRsqn4;
        this.askpRsqn5 = askpRsqn5;
        this.askpRsqn6 = askpRsqn6;
        this.askpRsqn7 = askpRsqn7;
        this.askpRsqn8 = askpRsqn8;
        this.askpRsqn9 = askpRsqn9;
        this.askpRsqn10 = askpRsqn10;
        this.bidpRsqn1 = bidpRsqn1;
        this.bidpRsqn2 = bidpRsqn2;
        this.bidpRsqn3 = bidpRsqn3;
        this.bidpRsqn4 = bidpRsqn4;
        this.bidpRsqn5 = bidpRsqn5;
        this.bidpRsqn6 = bidpRsqn6;
        this.bidpRsqn7 = bidpRsqn7;
        this.bidpRsqn8 = bidpRsqn8;
        this.bidpRsqn9 = bidpRsqn9;
        this.bidpRsqn10 = bidpRsqn10;
        this.totalAskpRsqn = totalAskpRsqn;
        this.totalBidpRsqn = totalBidpRsqn;
        this.ovtmTotalAskpRsqn = ovtmTotalAskpRsqn;
        this.ovtmTotalBidpRsqn = ovtmTotalBidpRsqn;
        this.antcCnpr = antcCnpr;
        this.antcCnqn = antcCnqn;
        this.antcVol = antcVol;
        this.antcCntgVrss = antcCntgVrss;
        this.antcCntgVrssSign = antcCntgVrssSign;
        this.antcCntgPrdyCtrt = antcCntgPrdyCtrt;
        this.acmlVol = acmlVol;
        this.totalAskpRsqnIcdc = totalAskpRsqnIcdc;
        this.totalBidpRsqnIcdc = totalBidpRsqnIcdc;
        this.ovtmTotalAskpIcdc = ovtmTotalAskpIcdc;
        this.ovtmTotalBidpIcdc = ovtmTotalBidpIcdc;
    }

    public String getMkscShrnIscd() {
        return mkscShrnIscd;
    }

    public void setMkscShrnIscd(String mkscShrnIscd) {
        this.mkscShrnIscd = mkscShrnIscd;
    }

    public String getBsopHour() {
        return bsopHour;
    }

    public void setBsopHour(String bsopHour) {
        this.bsopHour = bsopHour;
    }

    public String getHourClsCode() {
        return hourClsCode;
    }

    public void setHourClsCode(String hourClsCode) {
        this.hourClsCode = hourClsCode;
    }

    public String getAskp1() {
        return askp1;
    }

    public void setAskp1(String askp1) {
        this.askp1 = askp1;
    }

    public String getAskp2() {
        return askp2;
    }

    public void setAskp2(String askp2) {
        this.askp2 = askp2;
    }

    public String getAskp3() {
        return askp3;
    }

    public void setAskp3(String askp3) {
        this.askp3 = askp3;
    }

    public String getAskp4() {
        return askp4;
    }

    public void setAskp4(String askp4) {
        this.askp4 = askp4;
    }

    public String getAskp5() {
        return askp5;
    }

    public void setAskp5(String askp5) {
        this.askp5 = askp5;
    }

    public String getAskp6() {
        return askp6;
    }

    public void setAskp6(String askp6) {
        this.askp6 = askp6;
    }

    public String getAskp7() {
        return askp7;
    }

    public void setAskp7(String askp7) {
        this.askp7 = askp7;
    }

    public String getAskp8() {
        return askp8;
    }

    public void setAskp8(String askp8) {
        this.askp8 = askp8;
    }

    public String getAskp9() {
        return askp9;
    }

    public void setAskp9(String askp9) {
        this.askp9 = askp9;
    }

    public String getAskp10() {
        return askp10;
    }

    public void setAskp10(String askp10) {
        this.askp10 = askp10;
    }

    public String getBidp1() {
        return bidp1;
    }

    public void setBidp1(String bidp1) {
        this.bidp1 = bidp1;
    }

    public String getBidp2() {
        return bidp2;
    }

    public void setBidp2(String bidp2) {
        this.bidp2 = bidp2;
    }

    public String getBidp3() {
        return bidp3;
    }

    public void setBidp3(String bidp3) {
        this.bidp3 = bidp3;
    }

    public String getBidp4() {
        return bidp4;
    }

    public void setBidp4(String bidp4) {
        this.bidp4 = bidp4;
    }

    public String getBidp5() {
        return bidp5;
    }

    public void setBidp5(String bidp5) {
        this.bidp5 = bidp5;
    }

    public String getBidp6() {
        return bidp6;
    }

    public void setBidp6(String bidp6) {
        this.bidp6 = bidp6;
    }

    public String getBidp7() {
        return bidp7;
    }

    public void setBidp7(String bidp7) {
        this.bidp7 = bidp7;
    }

    public String getBidp8() {
        return bidp8;
    }

    public void setBidp8(String bidp8) {
        this.bidp8 = bidp8;
    }

    public String getBidp9() {
        return bidp9;
    }

    public void setBidp9(String bidp9) {
        this.bidp9 = bidp9;
    }

    public String getBidp10() {
        return bidp10;
    }

    public void setBidp10(String bidp10) {
        this.bidp10 = bidp10;
    }

    public String getAskpRsqn1() {
        return askpRsqn1;
    }

    public void setAskpRsqn1(String askpRsqn1) {
        this.askpRsqn1 = askpRsqn1;
    }

    public String getAskpRsqn2() {
        return askpRsqn2;
    }

    public void setAskpRsqn2(String askpRsqn2) {
        this.askpRsqn2 = askpRsqn2;
    }

    public String getAskpRsqn3() {
        return askpRsqn3;
    }

    public void setAskpRsqn3(String askpRsqn3) {
        this.askpRsqn3 = askpRsqn3;
    }

    public String getAskpRsqn4() {
        return askpRsqn4;
    }

    public void setAskpRsqn4(String askpRsqn4) {
        this.askpRsqn4 = askpRsqn4;
    }

    public String getAskpRsqn5() {
        return askpRsqn5;
    }

    public void setAskpRsqn5(String askpRsqn5) {
        this.askpRsqn5 = askpRsqn5;
    }

    public String getAskpRsqn6() {
        return askpRsqn6;
    }

    public void setAskpRsqn6(String askpRsqn6) {
        this.askpRsqn6 = askpRsqn6;
    }

    public String getAskpRsqn7() {
        return askpRsqn7;
    }

    public void setAskpRsqn7(String askpRsqn7) {
        this.askpRsqn7 = askpRsqn7;
    }

    public String getAskpRsqn8() {
        return askpRsqn8;
    }

    public void setAskpRsqn8(String askpRsqn8) {
        this.askpRsqn8 = askpRsqn8;
    }

    public String getAskpRsqn9() {
        return askpRsqn9;
    }

    public void setAskpRsqn9(String askpRsqn9) {
        this.askpRsqn9 = askpRsqn9;
    }

    public String getAskpRsqn10() {
        return askpRsqn10;
    }

    public void setAskpRsqn10(String askpRsqn10) {
        this.askpRsqn10 = askpRsqn10;
    }

    public String getBidpRsqn1() {
        return bidpRsqn1;
    }

    public void setBidpRsqn1(String bidpRsqn1) {
        this.bidpRsqn1 = bidpRsqn1;
    }

    public String getBidpRsqn2() {
        return bidpRsqn2;
    }

    public void setBidpRsqn2(String bidpRsqn2) {
        this.bidpRsqn2 = bidpRsqn2;
    }

    public String getBidpRsqn3() {
        return bidpRsqn3;
    }

    public void setBidpRsqn3(String bidpRsqn3) {
        this.bidpRsqn3 = bidpRsqn3;
    }

    public String getBidpRsqn4() {
        return bidpRsqn4;
    }

    public void setBidpRsqn4(String bidpRsqn4) {
        this.bidpRsqn4 = bidpRsqn4;
    }

    public String getBidpRsqn5() {
        return bidpRsqn5;
    }

    public void setBidpRsqn5(String bidpRsqn5) {
        this.bidpRsqn5 = bidpRsqn5;
    }

    public String getBidpRsqn6() {
        return bidpRsqn6;
    }

    public void setBidpRsqn6(String bidpRsqn6) {
        this.bidpRsqn6 = bidpRsqn6;
    }

    public String getBidpRsqn7() {
        return bidpRsqn7;
    }

    public void setBidpRsqn7(String bidpRsqn7) {
        this.bidpRsqn7 = bidpRsqn7;
    }

    public String getBidpRsqn8() {
        return bidpRsqn8;
    }

    public void setBidpRsqn8(String bidpRsqn8) {
        this.bidpRsqn8 = bidpRsqn8;
    }

    public String getBidpRsqn9() {
        return bidpRsqn9;
    }

    public void setBidpRsqn9(String bidpRsqn9) {
        this.bidpRsqn9 = bidpRsqn9;
    }

    public String getBidpRsqn10() {
        return bidpRsqn10;
    }

    public void setBidpRsqn10(String bidpRsqn10) {
        this.bidpRsqn10 = bidpRsqn10;
    }

    public String getTotalAskpRsqn() {
        return totalAskpRsqn;
    }

    public void setTotalAskpRsqn(String totalAskpRsqn) {
        this.totalAskpRsqn = totalAskpRsqn;
    }

    public String getTotalBidpRsqn() {
        return totalBidpRsqn;
    }

    public void setTotalBidpRsqn(String totalBidpRsqn) {
        this.totalBidpRsqn = totalBidpRsqn;
    }

    public String getOvtmTotalAskpRsqn() {
        return ovtmTotalAskpRsqn;
    }

    public void setOvtmTotalAskpRsqn(String ovtmTotalAskpRsqn) {
        this.ovtmTotalAskpRsqn = ovtmTotalAskpRsqn;
    }

    public String getOvtmTotalBidpRsqn() {
        return ovtmTotalBidpRsqn;
    }

    public void setOvtmTotalBidpRsqn(String ovtmTotalBidpRsqn) {
        this.ovtmTotalBidpRsqn = ovtmTotalBidpRsqn;
    }

    public String getAntcCnpr() {
        return antcCnpr;
    }

    public void setAntcCnpr(String antcCnpr) {
        this.antcCnpr = antcCnpr;
    }

    public String getAntcCnqn() {
        return antcCnqn;
    }

    public void setAntcCnqn(String antcCnqn) {
        this.antcCnqn = antcCnqn;
    }

    public String getAntcVol() {
        return antcVol;
    }

    public void setAntcVol(String antcVol) {
        this.antcVol = antcVol;
    }

    public String getAntcCntgVrss() {
        return antcCntgVrss;
    }

    public void setAntcCntgVrss(String antcCntgVrss) {
        this.antcCntgVrss = antcCntgVrss;
    }

    public String getAntcCntgVrssSign() {
        return antcCntgVrssSign;
    }

    public void setAntcCntgVrssSign(String antcCntgVrssSign) {
        this.antcCntgVrssSign = antcCntgVrssSign;
    }

    public String getAntcCntgPrdyCtrt() {
        return antcCntgPrdyCtrt;
    }

    public void setAntcCntgPrdyCtrt(String antcCntgPrdyCtrt) {
        this.antcCntgPrdyCtrt = antcCntgPrdyCtrt;
    }

    public String getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(String acmlVol) {
        this.acmlVol = acmlVol;
    }

    public String getTotalAskpRsqnIcdc() {
        return totalAskpRsqnIcdc;
    }

    public void setTotalAskpRsqnIcdc(String totalAskpRsqnIcdc) {
        this.totalAskpRsqnIcdc = totalAskpRsqnIcdc;
    }

    public String getTotalBidpRsqnIcdc() {
        return totalBidpRsqnIcdc;
    }

    public void setTotalBidpRsqnIcdc(String totalBidpRsqnIcdc) {
        this.totalBidpRsqnIcdc = totalBidpRsqnIcdc;
    }

    public String getOvtmTotalAskpIcdc() {
        return ovtmTotalAskpIcdc;
    }

    public void setOvtmTotalAskpIcdc(String ovtmTotalAskpIcdc) {
        this.ovtmTotalAskpIcdc = ovtmTotalAskpIcdc;
    }

    public String getOvtmTotalBidpIcdc() {
        return ovtmTotalBidpIcdc;
    }

    public void setOvtmTotalBidpIcdc(String ovtmTotalBidpIcdc) {
        this.ovtmTotalBidpIcdc = ovtmTotalBidpIcdc;
    }
}
