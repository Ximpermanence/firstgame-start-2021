package cn.ch.firstgamestart;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: chenhao
 * @create:2021/1/27 14:19
 **/
public class Generator {

    /**
     * 只需要修改这5个变量即可
     */
    private static final String MODULE_NAME = "/huawei-admin";
    private static final String PACKAGE_NAME = "cn.ch.firstgamestart";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/firstgame?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=convertToNull&rewriteBatchedStatements=true";
    private static final String USER_NAME = "root";
    private static final String PWD = "root";

    public static void main(String[] args) {

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //配置策略
        //  1.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.println("============>" + projectPath);

        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("ch");
        gc.setOpen(false);

        //是否覆盖
        gc.setFileOverride(false);

        //去掉I前缀
        gc.setServiceName("%sService");

        gc.setIdType(IdType.AUTO);
        gc.setSwagger2(true);
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);

        //设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(DB_URL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername(USER_NAME);
        dsc.setPassword(PWD);
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //配置包
        PackageConfig pc = new PackageConfig();
        pc.setParent(PACKAGE_NAME);
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);

        //策略配置
        StrategyConfig sc = new StrategyConfig();

        //生成单表代码
//        sc.setInclude("person_credential");

        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        sc.setEntityLombokModel(true);
        sc.setRestControllerStyle(true);
        sc.setLogicDeleteFieldName("is_deleted");
//        sc.setVersionFieldName("version");

        //自动填充配置
        TableFill testInsert = new TableFill("create_date", FieldFill.INSERT);
        TableFill testUpdate = new TableFill("modify_date", FieldFill.UPDATE);
        List<TableFill> tableFills = new ArrayList<>();
        tableFills.add(testInsert);
        tableFills.add(testUpdate);
        sc.setTableFillList(tableFills);
        mpg.setStrategy(sc);
        mpg.execute();
    }

}
