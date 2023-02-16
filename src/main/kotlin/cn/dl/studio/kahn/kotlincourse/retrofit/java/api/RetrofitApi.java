package cn.dl.studio.kahn.kotlincourse.retrofit.java.api;

import cn.dl.studio.kahn.kotlincourse.retrofit.client.entity.GetApiResponse;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Path;

@RetrofitClient(baseUrl = "http://localhost:8899/")
public interface RetrofitApi {
    @GET("/retrofit/get/{item}")
    GetApiResponse t2(@Path("item") String item);
}
