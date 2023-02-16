package cn.dl.studio.kahn.kotlincourse.retrofit.svr.controller

import cn.dl.studio.kahn.kotlincourse.retrofit.client.entity.GetApiResponse
import cn.dl.studio.kahn.kotlincourse.retrofit.svr.constant.ApiUrl
import cn.dl.studio.kahn.kotlincourse.retrofit.svr.entity.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/retrofit")
class RetrofitServerController {
    /*
    接收Form形式的输入参数
     */
    @PostMapping("/postinform")
    fun postMethodInForm(postBody: PostReqBody): PostReqBody {
        return postBody
    }

    /*
    接收JSON形式的输入参数，必须用@RequestBody。produces表明返回值的形式，可以不加。
     */
    @PostMapping("/postinjson", produces = ["application/json;charset=utf-8"])
    fun postMethodInJson(@RequestBody postBody: PostReqBody): PostReqBody {
        return postBody
    }

    @GetMapping("/get/{item}")
    fun getMethod(@PathVariable item: String): GetApiResponse {
        return GetApiResponse("str")
    }
}