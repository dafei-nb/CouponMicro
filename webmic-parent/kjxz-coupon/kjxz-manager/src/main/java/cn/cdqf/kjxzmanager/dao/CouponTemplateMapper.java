package cn.cdqf.kjxzmanager.dao;

import cn.cdqf.kjxzmanager.entity.CouponTemplate;

public interface CouponTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponTemplate record);

    int insertSelective(CouponTemplate record);

    CouponTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponTemplate record);

    int updateByPrimaryKey(CouponTemplate record);
}