package left.gefei.community.mapper;

import left.gefei.community.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into user (account_id,name,token,gmt_create,gmt_modified,avatar_url) values (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insect(User user);

    @Select("select * from user where token= #{token}")
    User findByToken(@Param("token") String token);
    @Select("select * from user where id= #{id}")
    User finById(@Param("id") Integer id);

    @Update("update user set name = #{name},token = #{token},gmt_modified = #{gmtModified},avatar_url = #{avatarUrl} where id = #{id}")
    void update(User user);

    @Select("select * from user where account_id= #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);
}
