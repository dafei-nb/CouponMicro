package cn.cdqf.kjxzmanager.service.impl;

import cn.cdqf.global.common.ResultResponse;
import cn.cdqf.global.util.RedisUtils;
import cn.cdqf.kjxzmanager.dao.CouponTemplateMapper;
import cn.cdqf.kjxzmanager.entity.CouponTemplate;
import cn.cdqf.kjxzmanager.entity.param.CouponTemplateParam;
import cn.cdqf.kjxzmanager.service.CouponTemplateService;
import cn.cdqf.kjxzmanager.util.CouponCodeUtil;
import cn.cdqf.kjxzmanager.util.FutureUtils;
import cn.cdqf.kjxzmanager.util.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponTemplateServiceImpl implements CouponTemplateService {
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private IdUtils idUtils;
    @Autowired
    private CouponCodeUtil couponCodeUtil;
    @Autowired
    private CouponTemplateMapper couponTemplateMapper;

    @Override
    public ResultResponse add(CouponTemplateParam couponTemplateParam) {
        CouponTemplate build = CouponTemplate.builder().cAmount(couponTemplateParam.getcAmount())
                .cAmountLimit((int) couponTemplateParam.getcAmountLimit())
                .cCategory(couponTemplateParam.getcCategory())
                .cConsumeStatus(couponTemplateParam.getcConsumeStatus())
                .cCount(couponTemplateParam.getcCount())
                .cDesc(couponTemplateParam.getcDesc())
                .cExpireDay(couponTemplateParam.getcExpireDay())
                .cExpireType(couponTemplateParam.getcExpireType())
                .cLimiter(couponTemplateParam.getcLimiter())
                //暂时
                //.cLinkUrl(couponTemplateParam.getcLinkUrl())
                .cMerchantId(couponTemplateParam.getcMerchantId())
                .cMerchantName(couponTemplateParam.getcMerchantName())
                .cProductLine(couponTemplateParam.getcProductLine())
                .build();
        //设置商家id  用这个idutils是为了以后可能的分库分表
        String couponId = FutureUtils.get(idUtils.getId(couponTemplateParam.getcMerchantId()));
        //todo redis
        //todo logo 文件 linkurl
        //生成优惠券码
        List<String> strings = couponCodeUtil.generateCode(couponTemplateParam.getcCount(), couponTemplateParam.getcMerchantId());
     couponTemplateMapper.insertSelective(build);
        return null;
    }
}
