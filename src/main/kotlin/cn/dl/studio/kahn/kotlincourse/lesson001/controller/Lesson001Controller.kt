package cn.dl.studio.kahn.kotlincourse.lesson001.controller

import cn.dl.studio.kahn.kotlincourse.h2.entity.MemberInfoEntity
import cn.dl.studio.kahn.kotlincourse.h2.service.IMemberInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lesson001")
class Lesson001Controller {
    @Autowired
    lateinit var memberInfoImpl: IMemberInfo

    @GetMapping("/test")
     fun Test(): String {
        return "OK"
    }

    @GetMapping("/memberinfo/{mId}")
    fun getMemeberInfo(@PathVariable mId:String): MemberInfoEntity {
        return memberInfoImpl.getMemberInfoEntityById(mId)
    }
}