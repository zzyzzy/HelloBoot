package zzyzzy.spring.helloboot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.naming.factory.ResourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory
            sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(dataSource);
        Resource[] res = new PathMatchingResourcePatternResolver()
            .getResources("classpath*:mybatis3/*Mapper.xml");
        sfb.setMapperLocations(res);

        return sfb.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sfb) {
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(sfb);
        return sqlSession;
    }

}
