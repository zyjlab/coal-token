package jylink.coaltoken.common;

import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
//必须在MyBatisConfig注册后再加载MapperScannerConfigurer，否则会报错
@AutoConfigureAfter(MybatisConfig.class)
public class MybitsMapperScannerConfig {

	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    mapperScannerConfigurer.setBasePackage("jylink.coaltoken.data");

    //初始化扫描器的相关配置，这里我们要创建一个Mapper的父类
    Properties properties = new Properties();
    properties.setProperty("mappers", "jylink.coaltoken.common.MyMapper");
    properties.setProperty("notEmpty", "false");
    properties.setProperty("IDENTITY", "MYSQL");

    mapperScannerConfigurer.setProperties(properties);

    return mapperScannerConfigurer;
    }

}
