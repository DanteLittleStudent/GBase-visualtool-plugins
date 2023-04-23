package com.gbase.admin.plugin;

import cn.hutool.extra.spring.SpringUtil;
import com.gitee.starblues.bootstrap.PluginContextHolder;
import com.gitee.starblues.bootstrap.SpringPluginBootstrap;
import com.gitee.starblues.bootstrap.annotation.OneselfConfig;
import lombok.extern.slf4j.Slf4j;
import com.gbase.admin.common.utils.spring.SpringUtils;
import com.gbase.admin.system.plugin.facade.MenuFacade;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import javax.swing.*;

@SpringBootApplication(exclude={
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@Slf4j
public class PluginApplication extends SpringPluginBootstrap {

    public static void main(String[] args) {
        new PluginApplication().run(args);
    }
}
