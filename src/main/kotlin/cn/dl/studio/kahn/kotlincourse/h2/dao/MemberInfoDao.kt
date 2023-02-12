package cn.dl.studio.kahn.kotlincourse.h2.dao

import cn.dl.studio.kahn.kotlincourse.h2.entity.MemberInfoEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select

@Mapper
interface MemberInfoDao {
    @Select("SELECT id,name,age,email FROM T_MEMBERINFO WHERE id=#{mId}")
    fun getMemberInfoEntityById(mId: String): MemberInfoEntity

}