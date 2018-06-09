package jylink.coaltoken.common;

import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
//������MyBatisConfigע����ټ���MapperScannerConfigurer������ᱨ��
@AutoConfigureAfter(MybatisConfig.class)
public class MybitsMapperScannerConfig {

	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    mapperScannerConfigurer.setBasePackage("jylink.coaltoken.data");

    //��ʼ��ɨ������������ã���������Ҫ����һ��Mapper�ĸ���
    Properties properties = new Properties();
    properties.setProperty("mappers", "jylink.coaltoken.common.MyMapper");
    properties.setProperty("notEmpty", "false");
    properties.setProperty("IDENTITY", "MYSQL");

    mapperScannerConfigurer.setProperties(properties);

    return mapperScannerConfigurer;
    }

}
