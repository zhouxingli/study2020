package com.online.study2020;

import com.online.study2020.entity.User;
import com.online.study2020.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Study2020ApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void findAll() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}
//添加
	@Test
	public void addUser(){
		User user=new User();
		user.setAge(2);
		user.setEmail("563864255@qq.com");
		user.setName("沐沐");
		int insert = userMapper.insert(user);
		System.out.println(insert);

	}
	//修改操作
	@Test
	public void updateUser(){
		User user=new User();
		user.setId(1L);
		user.setAge(88);
		int i = userMapper.updateById(user);
		System.out.println(i);
	}
}
