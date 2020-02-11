//IntelliJ IDEA
//transaction
//DemoService
//2020/2/11
// Author:御承扬
//E-mail:2923616405@qq.com


package com.pyc.transaction.service;

import com.pyc.transaction.domain.Person;

public interface DemoService {
    public Person savePersonWithRollBack(Person person);
    public Person savePersonWithoutRollBack(Person person);
}
