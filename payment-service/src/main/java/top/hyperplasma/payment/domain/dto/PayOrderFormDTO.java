package top.hyperplasma.payment.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ApiModel(description = "支付确认表单实体")
public class PayOrderFormDTO {
    @ApiModelProperty("支付订单id")
    @NotNull(message = "支付订单id不能为空")
    private Long id;

    @ApiModelProperty("支付密码")
    @NotNull(message = "支付密码不能为空")
    private String pw;
}