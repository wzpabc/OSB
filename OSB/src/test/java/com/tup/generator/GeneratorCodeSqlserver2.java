package com.tup.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.tup.commons.generator.AutoGenerator;
import com.tup.commons.generator.InjectionConfig;
import com.tup.commons.generator.config.DataSourceConfig;
import com.tup.commons.generator.config.GlobalConfig;
import com.tup.commons.generator.config.PackageConfig;
import com.tup.commons.generator.config.StrategyConfig;
import com.tup.commons.generator.config.TemplateConfig;
import com.tup.commons.generator.config.rules.DbType;
import com.tup.commons.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class GeneratorCodeSqlserver2 {
	/**
	 * <p>
	 * MySQL 生成演示
	 * </p>
	 */
	public static void main(String[] args) {
		/* 获取 JDBC 配置文件 */
		Properties props = getProperties();

		AutoGenerator mpg = new AutoGenerator();
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("E:/java/generator/code");

		gc.setFileOverride(true);
		gc.setActiveRecord(true);
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList
		gc.setAuthor("patrick.wang");
		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setMapperName("%sMapper");
		gc.setXmlName("%sMapper");
		gc.setServiceName("I%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");
		gc.setFormName("%sHelper");
		

		gc.setListName("%s");
		gc.setAddName("%sAdd");
		gc.setEditName("%sEdit");

		mpg.setGlobalConfig(gc);
		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.SQLSERVER);
		dsc.setDriverName(props.getProperty("jdbc.sqlserver.driver"));
		dsc.setUsername(props.getProperty("jdbc.sqlserver.username"));
		dsc.setPassword(props.getProperty("jdbc.sqlserver.password"));
		dsc.setUrl(props.getProperty("jdbc.sqlserver.url"));
		mpg.setDataSource(dsc);
		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		// strategy.setTablePrefix("bmd_");// 此处可以修改为您的表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setInclude(new String[] { "INFORMATION_SCHEMA_TABLES" }); // 需要生成的表
		// strategy.setExclude(new String[]{"test"}); // 排除生成的表
		// 字段名生成策略
		strategy.setFieldNaming(NamingStrategy.underline_to_camel);
		// 自定义实体父类
		// strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
		// 自定义实体，公共字段
		// strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
		// 自定义 mapper 父类
		// strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
		// 自定义 service 父类
		// strategy.setSuperServiceClass("com.baomidou.demo.TestService");
		// 自定义 service 实现类父类
		// strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
		// 自定义 controller 父类
		strategy.setSuperControllerClass("com.tup.commons.base.BaseController");
		// 【实体】是否生成字段常量（默认 false）
		// public static final String ID = "test_id";
		// strategy.setEntityColumnConstant(true);
		// 【实体】是否为构建者模型（默认 false）
		// public User setName(String name) {this.name = name; return this;}
		// strategy.setEntityBuliderModel(true);
		mpg.setStrategy(strategy);
		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.tup");
		pc.setModuleName(null); // 所属模块
		pc.setController("controller");
		pc.setMapper("mssql.mapper");
		pc.setEntity("mssql.model");
		pc.setXml("sqlMapperXml.mssql");
		pc.setForm("form");

		mpg.setPackageInfo(pc);
		// 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
		mpg.setCfg(cfg);
		// 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/template 下面内容修改，
		// 放置自己项目的 src/main/resources/template 目录下, 默认名称一下可以不配置，也可以自定义模板名称
		// TemplateConfig tc = new TemplateConfig();
		// tc.setController("D:/generator/controller.java.vm");
		// tc.setEntity("D:/generator/entity.java.vm");
		// tc.setMapper("D:/generator/mapper.java.vm");
		// tc.setXml("/src/main/resources/template/mapper.xml.vm");
		// tc.setService("/src/main/resources/template/service.java.vm");
		// tc.setServiceImpl("/src/main/resources/template/serviceImpl.java.vm");
		// mpg.setTemplate(tc);
		TemplateConfig tc = new TemplateConfig();
		 tc.setController("/template/controller.java.vm");
		 tc.setEntity("/template/entity.java.vm");
		 tc.setMapper("/template/mapper.java.vm");
		 tc.setXml("/template/mapper.xml.vm");
		 tc.setService("/template/service.java.vm");
		 tc.setServiceImpl("/template/serviceImpl.java.vm");
		 tc.setForm("/template/form.java.vm");
		mpg.setTemplate(tc);
		// 执行生成
		mpg.execute();
		// 打印注入设置
		System.err.println(mpg.getCfg().getMap().get("abc"));
	}

	/**
	 * 获取配置文件
	 *
	 * @return 配置Props
	 */
	private static Properties getProperties() {
		// 读取配置文件
		Resource resource = new ClassPathResource("/application.properties");
		Properties props = new Properties();
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}