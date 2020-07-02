package cn.cdqf.kjxzmanager.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("接收优惠券模板参数")
public class CouponTemplateParam implements Serializable {
    //分类
    @ApiModelProperty(name = "cCategory", dataType = "string", required = true, value = "优惠券类型：0：立减 1：满减  2：折扣")
    @NotBlank(message = "分类不能为null")//参数校验
    private String cCategory;
    //过期分类
    @ApiModelProperty(name = "cExpireType", dataType = "string", required = true, value = "过期分类: 0：固定时间 1：动态时间")
    private String cExpireType;
    //过期时间
    @ApiModelProperty(name = "cExpireDay", dataType = "Integer", required = true, value = "过期天数")
    private Integer cExpireDay;
    //商家ID
    @ApiModelProperty(name = "cMerchantId", dataType = "string", required = true, value = "商家id:指定在当前商户及商户的子分店使用,可以为null，就是平台发的")
    private String cMerchantId;
    //商家名称
    @ApiModelProperty(name = "cMerchantName", dataType = "string", required = true, value = "商家名称")
    private String cMerchantName;
    //描述
    @ApiModelProperty(name = "cDesc", dataType = "string", required = true, value = "描述")
    private String cDesc;
    //生产线
    @ApiModelProperty(name = "cDesc", dataType = "string", required = true, value = "生产线")
    private String cProductLine;
    //每个人领的数量限制
    @ApiModelProperty(name = "cLimiter", dataType = "integer", required = true, value = "每个人领的数量限制")
    private Integer cLimiter;
    //这种优惠券的数量
    @ApiModelProperty(name = "cCount", dataType = "integer", required = true, value = "这种优惠券的数量")
    private Integer cCount;
    //优惠金额
    @ApiModelProperty(name = "cAmount", dataType = "double", required = true, value = "金额0<amount<1就是折扣券")
    private double cAmount;
    //优惠条件
    @ApiModelProperty(name = "cAmountLimit", dataType = "double", required = true, value = "优惠券使用条件")
    private double cAmountLimit;
    //消费限制
    @ApiModelProperty(name = "cConsumeStatus", dataType = "string", required = true, value = "消费限制:1.同类不可使用 2.不能与所有进行使用 3.都可以使用")
    private String cConsumeStatus;

    public String getcCategory() {
        return cCategory;
    }

    public void setcCategory(String cCategory) {
        this.cCategory = cCategory;
    }

    public String getcExpireType() {
        return cExpireType;
    }

    public void setcExpireType(String cExpireType) {
        this.cExpireType = cExpireType;
    }

    public Integer getcExpireDay() {
        return cExpireDay;
    }

    public void setcExpireDay(Integer cExpireDay) {
        this.cExpireDay = cExpireDay;
    }

    public String getcMerchantId() {
        return cMerchantId;
    }

    public void setcMerchantId(String cMerchantId) {
        this.cMerchantId = cMerchantId;
    }

    public String getcMerchantName() {
        return cMerchantName;
    }

    public void setcMerchantName(String cMerchantName) {
        this.cMerchantName = cMerchantName;
    }


    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public String getcProductLine() {
        return cProductLine;
    }

    public void setcProductLine(String cProductLine) {
        this.cProductLine = cProductLine;
    }

    public Integer getcLimiter() {
        return cLimiter;
    }

    public void setcLimiter(Integer cLimiter) {
        this.cLimiter = cLimiter;
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }

    public double getcAmount() {
        return cAmount;
    }

    public void setcAmount(double cAmount) {
        this.cAmount = cAmount;
    }

    public double getcAmountLimit() {
        return cAmountLimit;
    }

    public void setcAmountLimit(double cAmountLimit) {
        this.cAmountLimit = cAmountLimit;
    }

    public String getcConsumeStatus() {
        return cConsumeStatus;
    }

    public void setcConsumeStatus(String cConsumeStatus) {
        this.cConsumeStatus = cConsumeStatus;
    }

}