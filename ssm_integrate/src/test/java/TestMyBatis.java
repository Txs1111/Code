import com.T_Lyon.mapper.UserMapper;
import com.T_Lyon.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {
    @Test
    public void testMyBatis() {

        SqlSessionFactory sqlSessionFactory;
        String resource = "mybatis-config.xml";
//            resource存进流中可能会报错，所以把它放进异常中
        try {
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userByName = mapper.getUserByName("1");
            System.out.println(userByName);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
