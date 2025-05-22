package io.cavia.mockinvest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "order_real_time")
public class OrderRealTime {

    @Column(name = "mksc_shrn_iscd", length = 9, nullable = false)
    private String mkscShrnIscd;

    @Id
    @Column(name = "bsop_hour", length = 6, nullable = false)
    private String bsopHour;

    @Column(name = "hour_cls_code", length = 1, nullable = false)
    private String hourClsCode;

    // 매도호가 1~10
    @Column(name = "askp1", nullable = false)
    private Integer askp1;
    @Column(name = "askp2", nullable = false)
    private Integer askp2;
    @Column(name = "askp3", nullable = false)
    private Integer askp3;
    @Column(name = "askp4", nullable = false)
    private Integer askp4;
    @Column(name = "askp5", nullable = false)
    private Integer askp5;
    @Column(name = "askp6", nullable = false)
    private Integer askp6;
    @Column(name = "askp7", nullable = false)
    private Integer askp7;
    @Column(name = "askp8", nullable = false)
    private Integer askp8;
    @Column(name = "askp9", nullable = false)
    private Integer askp9;
    @Column(name = "askp10", nullable = false)
    private Integer askp10;

    // 매수호가 1~10
    @Column(name = "bidp1", nullable = false)
    private Integer bidp1;
    @Column(name = "bidp2", nullable = false)
    private Integer bidp2;
    @Column(name = "bidp3", nullable = false)
    private Integer bidp3;
    @Column(name = "bidp4", nullable = false)
    private Integer bidp4;
    @Column(name = "bidp5", nullable = false)
    private Integer bidp5;
    @Column(name = "bidp6", nullable = false)
    private Integer bidp6;
    @Column(name = "bidp7", nullable = false)
    private Integer bidp7;
    @Column(name = "bidp8", nullable = false)
    private Integer bidp8;
    @Column(name = "bidp9", nullable = false)
    private Integer bidp9;
    @Column(name = "bidp10", nullable = false)
    private Integer bidp10;

    // 매도호가 잔량 1~10
    @Column(name = "askp_rsqn1", nullable = false)
    private Long askpRsqn1;
    @Column(name = "askp_rsqn2", nullable = false)
    private Long askpRsqn2;
    @Column(name = "askp_rsqn3", nullable = false)
    private Long askpRsqn3;
    @Column(name = "askp_rsqn4", nullable = false)
    private Long askpRsqn4;
    @Column(name = "askp_rsqn5", nullable = false)
    private Long askpRsqn5;
    @Column(name = "askp_rsqn6", nullable = false)
    private Long askpRsqn6;
    @Column(name = "askp_rsqn7", nullable = false)
    private Long askpRsqn7;
    @Column(name = "askp_rsqn8", nullable = false)
    private Long askpRsqn8;
    @Column(name = "askp_rsqn9", nullable = false)
    private Long askpRsqn9;
    @Column(name = "askp_rsqn10", nullable = false)
    private Long askpRsqn10;

    // 매수호가 잔량 1~10
    @Column(name = "bidp_rsqn1", nullable = false)
    private Long bidpRsqn1;
    @Column(name = "bidp_rsqn2", nullable = false)
    private Long bidpRsqn2;
    @Column(name = "bidp_rsqn3", nullable = false)
    private Long bidpRsqn3;
    @Column(name = "bidp_rsqn4", nullable = false)
    private Long bidpRsqn4;
    @Column(name = "bidp_rsqn5", nullable = false)
    private Long bidpRsqn5;
    @Column(name = "bidp_rsqn6", nullable = false)
    private Long bidpRsqn6;
    @Column(name = "bidp_rsqn7", nullable = false)
    private Long bidpRsqn7;
    @Column(name = "bidp_rsqn8", nullable = false)
    private Long bidpRsqn8;
    @Column(name = "bidp_rsqn9", nullable = false)
    private Long bidpRsqn9;
    @Column(name = "bidp_rsqn10", nullable = false)
    private Long bidpRsqn10;

    // 총 매도/매수호가 잔량
    @Column(name = "total_askp_rsqn", nullable = false)
    private Long totalAskpRsqn;
    @Column(name = "total_bidp_rsqn", nullable = false)
    private Long totalBidpRsqn;

    // 시간외 총 매도/매수호가 잔량
    @Column(name = "ovtm_total_askp_rsqn", nullable = false)
    private Long ovtmTotalAskpRsqn;
    @Column(name = "ovtm_total_bidp_rsqn", nullable = false)
    private Long ovtmTotalBidpRsqn;

    // 예상 체결가/체결량/거래량 등
    @Column(name = "antc_cnpr", nullable = false)
    private Integer antcCnpr;
    @Column(name = "antc_cnqn", nullable = false)
    private Long antcCnqn;
    @Column(name = "antc_vol", nullable = false)
    private Long antcVol;
    @Column(name = "antc_cntg_vrss", nullable = false)
    private Integer antcCntgVrss;
    @Column(name = "antc_cntg_vrss_sign", length = 1, nullable = false)
    private String antcCntgVrssSign;
    @Column(name = "antc_cntg_prdy_ctrt", nullable = false)
    private Long antcCntgPrdyCtrt;

    // 누적 거래량
    @Column(name = "acml_vol", nullable = false)
    private Long acmlVol;

    // 총 매도/매수호가 잔량 증감
    @Column(name = "total_askp_rsqn_icdc", nullable = false)
    private Integer totalAskpRsqnIcdc;
    @Column(name = "total_bidp_rsqn_icdc", nullable = false)
    private Integer totalBidpRsqnIcdc;

    // 시간외 총 매도/매수 호가 증감
    @Column(name = "ovtm_total_askp_icdc", nullable = false)
    private Integer ovtmTotalAskpIcdc;
    @Column(name = "ovtm_total_bidp_icdc", nullable = false)
    private Integer ovtmTotalBidpIcdc;

    public OrderRealTime() {
    }

    public OrderRealTime(String mkscShrnIscd, String bsopHour, String hourClsCode, Integer askp1, Integer askp2, Integer askp3,
                         Integer askp4, Integer askp5, Integer askp6, Integer askp7, Integer askp8, Integer askp9,
                         Integer askp10, Integer bidp1, Integer bidp2, Integer bidp3, Integer bidp4, Integer bidp5,
                         Integer bidp6, Integer bidp7, Integer bidp8, Integer bidp9, Integer bidp10, Long askpRsqn1,
                         Long askpRsqn2, Long askpRsqn3, Long askpRsqn4, Long askpRsqn5, Long askpRsqn6, Long askpRsqn7,
                         Long askpRsqn8, Long askpRsqn9, Long askpRsqn10, Long bidpRsqn1, Long bidpRsqn2, Long bidpRsqn3,
                         Long bidpRsqn4, Long bidpRsqn5, Long bidpRsqn6, Long bidpRsqn7, Long bidpRsqn8, Long bidpRsqn9,
                         Long bidpRsqn10, Long totalAskpRsqn, Long totalBidpRsqn, Long ovtmTotalAskpRsqn,
                         Long ovtmTotalBidpRsqn, Integer antcCnpr, Long antcCnqn, Long antcVol, Integer antcCntgVrss,
                         String antcCntgVrssSign, Long antcCntgPrdyCtrt, Long acmlVol, Integer totalAskpRsqnIcdc,
                         Integer totalBidpRsqnIcdc, Integer ovtmTotalAskpIcdc, Integer ovtmTotalBidpIcdc) {
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

    public Integer getAskp1() {
        return askp1;
    }

    public void setAskp1(Integer askp1) {
        this.askp1 = askp1;
    }

    public Integer getAskp2() {
        return askp2;
    }

    public void setAskp2(Integer askp2) {
        this.askp2 = askp2;
    }

    public Integer getAskp3() {
        return askp3;
    }

    public void setAskp3(Integer askp3) {
        this.askp3 = askp3;
    }

    public Integer getAskp4() {
        return askp4;
    }

    public void setAskp4(Integer askp4) {
        this.askp4 = askp4;
    }

    public Integer getAskp5() {
        return askp5;
    }

    public void setAskp5(Integer askp5) {
        this.askp5 = askp5;
    }

    public Integer getAskp6() {
        return askp6;
    }

    public void setAskp6(Integer askp6) {
        this.askp6 = askp6;
    }

    public Integer getAskp7() {
        return askp7;
    }

    public void setAskp7(Integer askp7) {
        this.askp7 = askp7;
    }

    public Integer getAskp8() {
        return askp8;
    }

    public void setAskp8(Integer askp8) {
        this.askp8 = askp8;
    }

    public Integer getAskp9() {
        return askp9;
    }

    public void setAskp9(Integer askp9) {
        this.askp9 = askp9;
    }

    public Integer getAskp10() {
        return askp10;
    }

    public void setAskp10(Integer askp10) {
        this.askp10 = askp10;
    }

    public Integer getBidp1() {
        return bidp1;
    }

    public void setBidp1(Integer bidp1) {
        this.bidp1 = bidp1;
    }

    public Integer getBidp2() {
        return bidp2;
    }

    public void setBidp2(Integer bidp2) {
        this.bidp2 = bidp2;
    }

    public Integer getBidp3() {
        return bidp3;
    }

    public void setBidp3(Integer bidp3) {
        this.bidp3 = bidp3;
    }

    public Integer getBidp4() {
        return bidp4;
    }

    public void setBidp4(Integer bidp4) {
        this.bidp4 = bidp4;
    }

    public Integer getBidp5() {
        return bidp5;
    }

    public void setBidp5(Integer bidp5) {
        this.bidp5 = bidp5;
    }

    public Integer getBidp6() {
        return bidp6;
    }

    public void setBidp6(Integer bidp6) {
        this.bidp6 = bidp6;
    }

    public Integer getBidp7() {
        return bidp7;
    }

    public void setBidp7(Integer bidp7) {
        this.bidp7 = bidp7;
    }

    public Integer getBidp8() {
        return bidp8;
    }

    public void setBidp8(Integer bidp8) {
        this.bidp8 = bidp8;
    }

    public Integer getBidp9() {
        return bidp9;
    }

    public void setBidp9(Integer bidp9) {
        this.bidp9 = bidp9;
    }

    public Integer getBidp10() {
        return bidp10;
    }

    public void setBidp10(Integer bidp10) {
        this.bidp10 = bidp10;
    }

    public Long getAskpRsqn1() {
        return askpRsqn1;
    }

    public void setAskpRsqn1(Long askpRsqn1) {
        this.askpRsqn1 = askpRsqn1;
    }

    public Long getAskpRsqn2() {
        return askpRsqn2;
    }

    public void setAskpRsqn2(Long askpRsqn2) {
        this.askpRsqn2 = askpRsqn2;
    }

    public Long getAskpRsqn3() {
        return askpRsqn3;
    }

    public void setAskpRsqn3(Long askpRsqn3) {
        this.askpRsqn3 = askpRsqn3;
    }

    public Long getAskpRsqn4() {
        return askpRsqn4;
    }

    public void setAskpRsqn4(Long askpRsqn4) {
        this.askpRsqn4 = askpRsqn4;
    }

    public Long getAskpRsqn5() {
        return askpRsqn5;
    }

    public void setAskpRsqn5(Long askpRsqn5) {
        this.askpRsqn5 = askpRsqn5;
    }

    public Long getAskpRsqn6() {
        return askpRsqn6;
    }

    public void setAskpRsqn6(Long askpRsqn6) {
        this.askpRsqn6 = askpRsqn6;
    }

    public Long getAskpRsqn7() {
        return askpRsqn7;
    }

    public void setAskpRsqn7(Long askpRsqn7) {
        this.askpRsqn7 = askpRsqn7;
    }

    public Long getAskpRsqn8() {
        return askpRsqn8;
    }

    public void setAskpRsqn8(Long askpRsqn8) {
        this.askpRsqn8 = askpRsqn8;
    }

    public Long getAskpRsqn9() {
        return askpRsqn9;
    }

    public void setAskpRsqn9(Long askpRsqn9) {
        this.askpRsqn9 = askpRsqn9;
    }

    public Long getAskpRsqn10() {
        return askpRsqn10;
    }

    public void setAskpRsqn10(Long askpRsqn10) {
        this.askpRsqn10 = askpRsqn10;
    }

    public Long getBidpRsqn1() {
        return bidpRsqn1;
    }

    public void setBidpRsqn1(Long bidpRsqn1) {
        this.bidpRsqn1 = bidpRsqn1;
    }

    public Long getBidpRsqn2() {
        return bidpRsqn2;
    }

    public void setBidpRsqn2(Long bidpRsqn2) {
        this.bidpRsqn2 = bidpRsqn2;
    }

    public Long getBidpRsqn3() {
        return bidpRsqn3;
    }

    public void setBidpRsqn3(Long bidpRsqn3) {
        this.bidpRsqn3 = bidpRsqn3;
    }

    public Long getBidpRsqn4() {
        return bidpRsqn4;
    }

    public void setBidpRsqn4(Long bidpRsqn4) {
        this.bidpRsqn4 = bidpRsqn4;
    }

    public Long getBidpRsqn5() {
        return bidpRsqn5;
    }

    public void setBidpRsqn5(Long bidpRsqn5) {
        this.bidpRsqn5 = bidpRsqn5;
    }

    public Long getBidpRsqn6() {
        return bidpRsqn6;
    }

    public void setBidpRsqn6(Long bidpRsqn6) {
        this.bidpRsqn6 = bidpRsqn6;
    }

    public Long getBidpRsqn7() {
        return bidpRsqn7;
    }

    public void setBidpRsqn7(Long bidpRsqn7) {
        this.bidpRsqn7 = bidpRsqn7;
    }

    public Long getBidpRsqn8() {
        return bidpRsqn8;
    }

    public void setBidpRsqn8(Long bidpRsqn8) {
        this.bidpRsqn8 = bidpRsqn8;
    }

    public Long getBidpRsqn9() {
        return bidpRsqn9;
    }

    public void setBidpRsqn9(Long bidpRsqn9) {
        this.bidpRsqn9 = bidpRsqn9;
    }

    public Long getBidpRsqn10() {
        return bidpRsqn10;
    }

    public void setBidpRsqn10(Long bidpRsqn10) {
        this.bidpRsqn10 = bidpRsqn10;
    }

    public Long getTotalAskpRsqn() {
        return totalAskpRsqn;
    }

    public void setTotalAskpRsqn(Long totalAskpRsqn) {
        this.totalAskpRsqn = totalAskpRsqn;
    }

    public Long getTotalBidpRsqn() {
        return totalBidpRsqn;
    }

    public void setTotalBidpRsqn(Long totalBidpRsqn) {
        this.totalBidpRsqn = totalBidpRsqn;
    }

    public Long getOvtmTotalAskpRsqn() {
        return ovtmTotalAskpRsqn;
    }

    public void setOvtmTotalAskpRsqn(Long ovtmTotalAskpRsqn) {
        this.ovtmTotalAskpRsqn = ovtmTotalAskpRsqn;
    }

    public Long getOvtmTotalBidpRsqn() {
        return ovtmTotalBidpRsqn;
    }

    public void setOvtmTotalBidpRsqn(Long ovtmTotalBidpRsqn) {
        this.ovtmTotalBidpRsqn = ovtmTotalBidpRsqn;
    }

    public Integer getAntcCnpr() {
        return antcCnpr;
    }

    public void setAntcCnpr(Integer antcCnpr) {
        this.antcCnpr = antcCnpr;
    }

    public Long getAntcCnqn() {
        return antcCnqn;
    }

    public void setAntcCnqn(Long antcCnqn) {
        this.antcCnqn = antcCnqn;
    }

    public Long getAntcVol() {
        return antcVol;
    }

    public void setAntcVol(Long antcVol) {
        this.antcVol = antcVol;
    }

    public Integer getAntcCntgVrss() {
        return antcCntgVrss;
    }

    public void setAntcCntgVrss(Integer antcCntgVrss) {
        this.antcCntgVrss = antcCntgVrss;
    }

    public String getAntcCntgVrssSign() {
        return antcCntgVrssSign;
    }

    public void setAntcCntgVrssSign(String antcCntgVrssSign) {
        this.antcCntgVrssSign = antcCntgVrssSign;
    }

    public Long getAntcCntgPrdyCtrt() {
        return antcCntgPrdyCtrt;
    }

    public void setAntcCntgPrdyCtrt(Long antcCntgPrdyCtrt) {
        this.antcCntgPrdyCtrt = antcCntgPrdyCtrt;
    }

    public Long getAcmlVol() {
        return acmlVol;
    }

    public void setAcmlVol(Long acmlVol) {
        this.acmlVol = acmlVol;
    }

    public Integer getTotalAskpRsqnIcdc() {
        return totalAskpRsqnIcdc;
    }

    public void setTotalAskpRsqnIcdc(Integer totalAskpRsqnIcdc) {
        this.totalAskpRsqnIcdc = totalAskpRsqnIcdc;
    }

    public Integer getTotalBidpRsqnIcdc() {
        return totalBidpRsqnIcdc;
    }

    public void setTotalBidpRsqnIcdc(Integer totalBidpRsqnIcdc) {
        this.totalBidpRsqnIcdc = totalBidpRsqnIcdc;
    }

    public Integer getOvtmTotalAskpIcdc() {
        return ovtmTotalAskpIcdc;
    }

    public void setOvtmTotalAskpIcdc(Integer ovtmTotalAskpIcdc) {
        this.ovtmTotalAskpIcdc = ovtmTotalAskpIcdc;
    }

    public Integer getOvtmTotalBidpIcdc() {
        return ovtmTotalBidpIcdc;
    }

    public void setOvtmTotalBidpIcdc(Integer ovtmTotalBidpIcdc) {
        this.ovtmTotalBidpIcdc = ovtmTotalBidpIcdc;
    }
}
