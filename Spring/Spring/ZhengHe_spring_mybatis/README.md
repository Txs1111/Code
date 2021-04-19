##Spring整合MyBatis

整合步骤:
1. 导入包 
    + mybatis
    + mysql-connector-java
    + mybatis-spring
    + spring-webmvc
    + spring-jdbc  
    注意：mybatis中用8版本以上的需要将数据源中的driverClassName的值改为com.mysql.cj.jdbc.Driver,并且配置&amp;serverTimezone=UTC
2. 在spring配置文件中导入dataSource数据源
3. 配置sqlSessionFactory
4. 配置sqlSession
5. 写一个接口实现类将mapper中的方法传递出来
6. 最后调用即可