package cn.dl.studio.kahn.kotlincourse.retrofit.java.controller;

import cn.dl.studio.kahn.kotlincourse.retrofit.client.entity.GetApiResponse;
import cn.dl.studio.kahn.kotlincourse.retrofit.java.api.RetrofitApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invokeapi")
public class RetrofitApiController {
    @Autowired
    private RetrofitApi retrofitApi;

    @GetMapping("/t2")
    public GetApiResponse t2() {
        return retrofitApi.t2("quanwen");
    }
}
