package cn.cdqf.kjxzmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplate {
    private Integer id;

    private String cId;

    private String cCategory;

    private String cExpireType;

    private Integer cExpireDay;

    private Date cCreateTime;

    private String cConsumeStatus;

    private String cMerchantId;

    private String cMerchantName;

    private String cLogo;

    private String cDesc;

    private String cProductLine;

    private String cAreaId;

    private Integer cLimiter;

    private Integer cCount;

    private Double cAmount;

    private Integer cAmountLimit;

    private String cLinkUrl;

}