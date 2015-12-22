package com.kpi.compsys.service.impl.hibernate;

import com.kpi.compsys.service.AbstractUserServiceTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Vova on 12/22/2015.
 */
@ContextConfiguration(locations = {"classpath:test-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceHibernateTest extends AbstractUserServiceTest {
}
