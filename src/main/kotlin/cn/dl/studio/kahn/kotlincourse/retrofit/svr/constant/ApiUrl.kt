package cn.dl.studio.kahn.kotlincourse.retrofit.svr.constant

class ApiUrl{
    companion object{
        /**
         * kotlin通过引入“伴生对象”的概念来替代java里的静态变量及方法
         * 下面是定义伴生对象的代码：
         * class StaticTest {
        companion object{//伴生对象是可以指定名字的，不过一般都省略掉。
        var STATIC_VAR = 0
        fun staticMethod(str: String?) {
        println(str)
        }
        }
        }
         */
        //登录
        const val LOGIN_URL = "/prod-api/api/login"
        //全部服务
        const val ALL_SERVICE = "/prod-api/api/service/list"
        //TOKEN
        var TOKEN = ""
    }
}