package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.UserBean;

@Mapper
@Repository
public interface UserDao {
	@Select("select * from User")
	List<UserBean> searchUserBeans();
	
	@Select("select * from User where phone_number = #{phone}")
	UserBean findbyPhone(String phone);
	
	@Insert("insert into user(password,phone_number) values(#{password},#{phoneNumber})")
	int insertUser(UserBean userBean);
	
	@Update("update user set username = #{username} where phone_number = #{phone}")
	int updateUser(String username,String phone);
}
