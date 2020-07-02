package cn.cdqf.kjxzmanager.controller;

import cn.cdqf.global.common.ResultResponse;
import cn.cdqf.kjxzmanager.controller.validator.BindingResultUtil;
import cn.cdqf.kjxzmanager.entity.param.CouponTemplateParam;
import cn.cdqf.kjxzmanager.service.CouponTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Api("优惠券模板接口")
public class CouponTemplateController {
    @Autowired
    private CouponTemplateService couponTemplateService;

    @PostMapping("coupontemplate")
    @ApiOperation("增加优惠券模板")
    public ResultResponse addCouponTemplate(
                                            @ApiParam("模板接收实体类") @Validated CouponTemplateParam couponTemplateParam, BindingResult bindingResult){
        BindingResultUtil.checkBindingResult(bindingResult);
        //todo 当前操作人员
        return couponTemplateService.add(couponTemplateParam);

    }
}
