package org.ht.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ht.pojo.Users;

public interface UsersService {

	List<Users> queryUserslimits(Map<String, Object> map);
	List<Users> userList();
	int insert(Users users);
    List<Users> queryUserslimits(String unickname);

	Users byNameFindUsers(@Param("unickname") String unickname, @Param("upassword") String upassword);
	/**
	 * @author 陈庆山
	 * @param map
	 * @explain users 的分页查询
	 */
	public List<Users> queryUser(Map<String, Object> map);
}
