package com.example.remarks.api;

import com.alibaba.fastjson.JSONObject;
import com.example.api.RemarksServiceApi;
import com.example.global.util.baseResponse.BaseApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemarksServiceImp extends BaseApiService<JSONObject> implements RemarksServiceApi {

    @Autowired
    private com.example.remarks.service.RemarksService remarksService;

    @Override
    public JSONObject getRemarksInfo(Long remarksId) {
        JSONObject responseData = new JSONObject();
        responseData.put("remarksInfo", remarksService.getRemarksInfo(remarksId));
        return responseData;
    }
}
