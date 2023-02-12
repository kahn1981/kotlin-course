package cn.dl.studio.kahn.kotlincourse.h2.service

import cn.dl.studio.kahn.kotlincourse.h2.entity.MemberInfoEntity

interface IMemberInfo {
    fun getMemberInfoEntityById(mId: String): MemberInfoEntity
}