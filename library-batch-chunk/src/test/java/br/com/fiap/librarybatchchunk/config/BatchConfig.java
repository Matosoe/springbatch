package br.com.fiap.librarybatchchunk.config;

import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;

public class BatchConfig {

    @Bean
    public JobLauncherTestUtils launcherTestUtils(){
        return new JobLauncherTestUtils();
    }
}
