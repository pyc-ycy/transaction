//IntelliJ IDEA
//transaction
//DemoServiceImpl
//2020/2/11
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.transaction.service.impl;

import com.pyc.transaction.dao.PersonRepository;
import com.pyc.transaction.domain.Person;
import com.pyc.transaction.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;

    // 使用 @Transaction 注解的 rollback 属性，指定特定异常时，数据回滚
    // comment @Transaction and use property rollback to assign transaction rollback
    // when happen illegal argument exception
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person){
        Person p = personRepository.save(person);
        if(person.getName().equals("林秋延")){
            throw new IllegalArgumentException("林秋延已经存在，数据回滚");
        }
        return p;
    }

    // comment @Transaction and use property rollback to assign transaction no rollback
    // when happen illegal argument exception
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person){
        Person p = personRepository.save(person);
        if(person.getName().equals("pyc")){
            throw new IllegalArgumentException("pyc 虽然已经存在，数据不会回滚");
        }
        return p;
    }
}
