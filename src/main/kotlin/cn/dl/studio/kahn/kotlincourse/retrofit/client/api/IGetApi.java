package cn.dl.studio.kahn.kotlincourse.retrofit.client.api;

import cn.dl.studio.kahn.kotlincourse.retrofit.client.entity.GetApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IGetApi {
    //传BaseURL后的相对path
    @GET("/retrofit/get/call_from_retrofit")
    Call<GetApiResponse> getCall();
    // Retrofit把网络请求的URL分成了两部分：一部分放在Retrofit对象里，另一部分放在网络请求接口里
    // 如果接口里的url是一个完整的网址，那么放在Retrofit对象里的URL可以忽略
    // getCall()是接受网络请求数据的方法
}
