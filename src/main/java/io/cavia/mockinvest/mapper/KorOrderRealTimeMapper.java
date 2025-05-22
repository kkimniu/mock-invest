package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.OrderRealTime;

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
            datas[3],   // askp1
            datas[4],   // askp2
            datas[5],   // askp3
            datas[6],   // askp4
            datas[7],   // askp5
            datas[8],   // askp6
            datas[9],   // askp7
            datas[10],  // askp8
            datas[11],  // askp9
            datas[12],  // askp10
            datas[13],  // bidp1
            datas[14],  // bidp2
            datas[15],  // bidp3
            datas[16],  // bidp4
            datas[17],  // bidp5
            datas[18],  // bidp6
            datas[19],  // bidp7
            datas[20],  // bidp8
            datas[21],  // bidp9
            datas[22],  // bidp10
            datas[23],  // askpRsqn1
            datas[24],  // askpRsqn2
            datas[25],  // askpRsqn3
            datas[26],  // askpRsqn4
            datas[27],  // askpRsqn5
            datas[28],  // askpRsqn6
            datas[29],  // askpRsqn7
            datas[30],  // askpRsqn8
            datas[31],  // askpRsqn9
            datas[32],  // askpRsqn10
            datas[33],  // bidpRsqn1
            datas[34],  // bidpRsqn2
            datas[35],  // bidpRsqn3
            datas[36],  // bidpRsqn4
            datas[37],  // bidpRsqn5
            datas[38],  // bidpRsqn6
            datas[39],  // bidpRsqn7
            datas[40],  // bidpRsqn8
            datas[41],  // bidpRsqn9
            datas[42],  // bidpRsqn10
            datas[43],  // totalAskpRsqn
            datas[44],  // totalBidpRsqn
            datas[45],  // ovtmTotalAskpRsqn
            datas[46],  // ovtmTotalBidpRsqn
            datas[47],  // antcCnpr
            datas[48],  // antcCnqn
            datas[49],  // antcVol
            datas[50],  // antcCntgVrss
            datas[51],  // antcCntgVrssSign
            datas[52],  // antcCntgPrdyCtrt
            datas[53],  // acmlVol
            datas[54],  // totalAskpRsqnIcdc
            datas[55],  // totalBidpRsqnIcdc
            datas[56],  // ovtmTotalAskpIcdc
            datas[57]   // ovtmTotalBidpIcdc
        );
    }
}
