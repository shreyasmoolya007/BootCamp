package com.av.dto;

import com.av.dto.Branch;
import com.av.dto.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BranchDriver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Branch branch = (Branch) applicationContext.getBean("branch");
        branch.display();
    }
}
