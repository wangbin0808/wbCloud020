package com.wb.myrule;

import com.wb.cloud.load.MyRuleBalancer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName : MyRole
 * @Author : 王斌
 * @Date : 2020-11-21 11:08
 * @Description
 * @Version
 */
//@Configuration
public class MyRule {

    @Bean
    public MyRuleBalancer randomRule(){
        return new MyRuleBalancer();
    }

}
