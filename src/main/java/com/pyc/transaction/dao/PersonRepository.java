//IntelliJ IDEA
//transaction
//PersonRepository
//2020/2/11
// Author:御承扬
//E-mail:2923616405@qq.com


package com.pyc.transaction.dao;

import com.pyc.transaction.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
