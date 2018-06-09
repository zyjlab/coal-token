package jylink.coaltoken.common;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.github.pagehelper.PageHelper;

public class MybatisConfig {
	  @Bean(name = "sqlSessionFactory")
	    public SqlSessionFactory sqlSessionFactoryBean() {
	    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	//  bean.setDataSource(dataSource());

	    bean.setTypeAliasesPackage("jylink.coaltoken.domain");

	    //��ҳ�������
	    PageHelper pageHelper = new PageHelper();
	    Properties properties = new Properties();
	    properties.setProperty("reasonable", "true");
	    properties.setProperty("supportMethodsArguments", "true");
	    properties.setProperty("returnPageInfo", "check");
	    properties.setProperty("params", "count=countSql");
	    pageHelper.setProperties(properties);

	    //��ӷ�ҳ���
	    bean.setPlugins(new Interceptor[]{pageHelper});

	    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	    try {
	        //����ע��ɨ��Mapper����������xml·��
	        //bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
	        return bean.getObject();
	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new RuntimeException(e);
	    }
	    }
}
