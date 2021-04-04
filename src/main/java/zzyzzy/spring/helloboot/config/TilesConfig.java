package zzyzzy.spring.helloboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer tc = new TilesConfigurer();
        tc.setDefinitions(new String[] { "/WEB-INF/tiles.xml" });
        tc.setCheckRefresh(true);
        return tc;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver tvr = new TilesViewResolver();
        tvr.setViewClass(TilesView.class);
        tvr.setOrder(1);
        return tvr;
    }

}

