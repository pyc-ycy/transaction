//IntelliJ IDEA
//transaction
//WebController
//2020/2/11
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.transaction.web;


import com.pyc.transaction.domain.Person;
import com.pyc.transaction.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    DemoService demoService;

    // 测试回滚
    // try rollback transaction
    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.savePersonWithRollBack(person);
    }

    // trying no rollback transaction
    @RequestMapping("/norollback")
    public Person noRollback(Person person){
        return demoService.savePersonWithoutRollBack(person);
    }
}
