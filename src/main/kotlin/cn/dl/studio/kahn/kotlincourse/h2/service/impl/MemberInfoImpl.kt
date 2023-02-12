package cn.dl.studio.kahn.kotlincourse.h2.service.impl

import cn.dl.studio.kahn.kotlincourse.h2.dao.MemberInfoDao
import cn.dl.studio.kahn.kotlincourse.h2.entity.MemberInfoEntity
import cn.dl.studio.kahn.kotlincourse.h2.service.IMemberInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberInfoImpl : IMemberInfo {
    @Autowired
    lateinit var memberInfoDao: MemberInfoDao

    override fun getMemberInfoEntityById(mId: String): MemberInfoEntity {
        return memberInfoDao.getMemberInfoEntityById(mId)
    }
}