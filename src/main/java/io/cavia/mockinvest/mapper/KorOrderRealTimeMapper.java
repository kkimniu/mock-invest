package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.OrderRealTime;

import java.math.BigDecimal;

public class KorOrderRealTimeMapper {
    /**
     * 국내주식 실시간호가 요청으로 발생하는 dvs를 Entity로 변환하는 메서드 입니다
     * dvs는 '^'를 구분자로 가지고 57개의 데이터가 매핑되어 있습니다
     * 확인 결과 null로 전달 되는 값과 각각 다른 타입으로 파싱해야 하는 데이터가 있어서
     * 추후 보수를 고려하여 가장 원시적인 형태로 메서드를 작성하였습니다
     *
     * @param dvs
     * @return
     */
    public OrderRealTime toEntity(String dvs) {
        String[] datas = dvs.split("^");
        datas[0] = datas[0].substring(datas[0].lastIndexOf("|"));

        return new OrderRealTime(
            datas[0],   // mkscShrnIscd
            datas[1],   // bsopHour
            datas[2],   // hourClsCode
            Integer.parseInt(datas[3]),   // askp1
            Integer.parseInt(datas[4]),   // askp2
            Integer.parseInt(datas[5]),   // askp3
            Integer.parseInt(datas[6]),   // askp4
            Integer.parseInt(datas[7]),   // askp5
            Integer.parseInt(datas[8]),   // askp6
            Integer.parseInt(datas[9]),   // askp7
            Integer.parseInt(datas[10]),  // askp8
            Integer.parseInt(datas[11]),  // askp9
            Integer.parseInt(datas[12]),  // askp10
            Integer.parseInt(datas[13]),  // bidp1
            Integer.parseInt(datas[14]),  // bidp2
            Integer.parseInt(datas[15]),  // bidp3
            Integer.parseInt(datas[16]),  // bidp4
            Integer.parseInt(datas[17]),  // bidp5
            Integer.parseInt(datas[18]),  // bidp6
            Integer.parseInt(datas[19]),  // bidp7
            Integer.parseInt(datas[20]),  // bidp8
            Integer.parseInt(datas[21]),  // bidp9
            Integer.parseInt(datas[22]),  // bidp10
            Long.parseLong(datas[23]),  // askpRsqn1
            Long.parseLong(datas[24]),  // askpRsqn2
            Long.parseLong(datas[25]),  // askpRsqn3
            Long.parseLong(datas[26]),  // askpRsqn4
            Long.parseLong(datas[27]),  // askpRsqn5
            Long.parseLong(datas[28]),  // askpRsqn6
            Long.parseLong(datas[29]),  // askpRsqn7
            Long.parseLong(datas[30]),  // askpRsqn8
            Long.parseLong(datas[31]),  // askpRsqn9
            Long.parseLong(datas[32]),  // askpRsqn10
            Long.parseLong(datas[33]),  // bidpRsqn1
            Long.parseLong(datas[34]),  // bidpRsqn2
            Long.parseLong(datas[35]),  // bidpRsqn3
            Long.parseLong(datas[36]),  // bidpRsqn4
            Long.parseLong(datas[37]),  // bidpRsqn5
            Long.parseLong(datas[38]),  // bidpRsqn6
            Long.parseLong(datas[39]),  // bidpRsqn7
            Long.parseLong(datas[40]),  // bidpRsqn8
            Long.parseLong(datas[41]),  // bidpRsqn9
            Long.parseLong(datas[42]),  // bidpRsqn10
            Long.parseLong(datas[43]),  // totalAskpRsqn
            Long.parseLong(datas[44]),  // totalBidpRsqn
            Long.parseLong(datas[45]),  // ovtmTotalAskpRsqn
            Long.parseLong(datas[46]),  // ovtmTotalBidpRsqn
            Integer.parseInt(datas[47]),  // antcCnpr
            Long.parseLong(datas[48]),  // antcCnqn
            Long.parseLong(datas[49]),  // antcVol
            Integer.parseInt(datas[50]),  // antcCntgVrss
            datas[51],  // antcCntgVrssSign
            new BigDecimal(datas[52]),  // antcCntgPrdyCtrt
            Long.parseLong(datas[53]),  // acmlVol
            Integer.parseInt(datas[54]),  // totalAskpRsqnIcdc
            Integer.parseInt(datas[55]),  // totalBidpRsqnIcdc
            Integer.parseInt(datas[56]),  // ovtmTotalAskpIcdc
            Integer.parseInt(datas[57])   // ovtmTotalBidpIcdc
        );
    }
}
