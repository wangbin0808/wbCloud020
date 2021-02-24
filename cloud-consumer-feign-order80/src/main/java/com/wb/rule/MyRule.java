package com.wb.rule;

import com.wb.cloud.load.MyRuleBalancer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName : MyRule
 * @Author : 王斌
 * @Date : 2020-11-23 16:46
 * @Description
 * @Version
 */
public class MyRule {
    @Bean
    public MyRuleBalancer randomRule(){
        return new MyRuleBalancer();
    }
}
