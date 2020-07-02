package cn.cdqf.global.common;

public interface GlobleConstant {

    interface EnumConstant{
        String NO_MATCH_INSTANCE="当前参数没有匹配的对象：";
    }

    interface CouponTemplateConstant{
        String NO_TEMPLATE_FOR_MERCHANTID_AND_LEVEL="当前店铺没有当前等级对应的优惠券";

        String NOT_ENOUGH_COUPON_COUNT="优惠券模板的数量不足";
    }
}
