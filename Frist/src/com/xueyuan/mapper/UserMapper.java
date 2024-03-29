package com.xueyuan.mapper;

import java.util.List;

import com.xueyuan.beans.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_users
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_users
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_users
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_users
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_users
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int updateByPrimaryKey(User record);
    
    //根据用户名查找用户
	User selectUserByuserName(String username);
}