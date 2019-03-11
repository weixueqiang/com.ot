package test;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jo.dy.ot.dao.UserMapper;
import com.jo.dy.ot.entity.User;

import tk.mybatis.mapper.entity.Example;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class tt {

	@Resource
	private UserMapper userMapper;

	@Test
	public void test() {
		System.out.println("启动成功");
		System.out.println(userMapper);
		List<User> selectAll = userMapper.selectAll();
		System.out.println(selectAll);
		User record = new User(23, "test", "2313", "fdsfdf");
		int insert = userMapper.insert(record);
		System.out.println(insert);
	}

	@Test
	public void selectByExample() {
		Example example = new Example(User.class);
		example.selectProperties("id", "username");
		example.createCriteria().andBetween("id", 12, 24);
		List<User> selectByExample = userMapper.selectByExample(example);
		selectByExample.forEach(System.out::println);

	}

	@Test
	public void batchCreate() {
		List<User> asList = Arrays.asList(new User(0, "tttt", "ok", ""), new User(0, "tttt22", "ok2", "dsff "));
		userMapper.insertList(asList);

	}

}
