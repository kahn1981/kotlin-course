package cn.dl.studio.kahn.kotlincourse.retrofit.client.controller

import cn.dl.studio.kahn.kotlincourse.retrofit.client.api.IGetApi
import cn.dl.studio.kahn.kotlincourse.retrofit.client.entity.GetApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RestController
@RequestMapping("/invokeapi")
class InvokeApiController {
    @GetMapping("/get")
    fun invokeGetApi():GetApiResponse {
        //步骤4:创建Retrofit对象
        val retrofit = Retrofit.Builder()
            .baseUrl("http://localhost:8899") // 设置 网络请求 Url
            .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
            .build()

        // 步骤5:创建 网络请求接口 的实例
        val request = retrofit.create(IGetApi::class.java)

        //对 发送请求 进行封装
        val call = request.call

        //步骤6:发送网络请求(异步)
        call.enqueue(object : Callback<GetApiResponse> {
            //请求成功时回调
            override fun onResponse(call: Call<GetApiResponse>, response: Response<GetApiResponse>) {
                // 步骤7：处理返回的数据结果
                // response.body().show()
                showResponse(response.body())
            }

            //请求失败时回调
            override fun onFailure(call: Call<GetApiResponse>, throwable: Throwable) {
                println("连接失败")
            }
        })

        return GetApiResponse("invoke get api")
    }

    internal fun showResponse(res: GetApiResponse?): GetApiResponse {
        if (res != null) {
            return res
        } else {
            return GetApiResponse("no response")
        }
    }
}