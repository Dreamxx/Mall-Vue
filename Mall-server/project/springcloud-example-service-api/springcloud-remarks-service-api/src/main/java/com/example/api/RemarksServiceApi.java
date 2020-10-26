package com.example.api;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Api(tags = "评论接口")
public interface RemarksServiceApi {

    /**
     * 返回商品的所有评论信息
     *
     * @return BaseResponse<JSONObject>
     * JSONObject example:
     * remarksList{[RemarksList],[RemarksList]}
     */
    @ApiOperation(value = "返回商品的所有评论信息(统计，详情)")
    @GetMapping("/getRemarksInfo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "remarksId", value = "商品评论信息id", required = true, paramType = "header")
    })
    JSONObject getRemarksInfo(@RequestHeader Long remarksId);

}
