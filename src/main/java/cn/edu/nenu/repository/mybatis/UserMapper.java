package cn.edu.nenu.repository.mybatis;

import cn.edu.nenu.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * UserMapper Class
 *
 */
//@Repository
//@Mapper
public interface UserMapper {

    @Select("select id,name,username,password from ssh_user where id=?1")
    List<User> getPage(int pageNumber, int pageSize, Map<String, Object> param);
}
