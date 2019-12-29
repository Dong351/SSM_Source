package com.learn.test;

import com.learn.dao.IAccountDao;
import com.learn.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    InputStream in;
    IAccountDao accountDao;
    SqlSession session;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        session = factory.openSession(true);
        accountDao = session.getMapper(IAccountDao.class);
    }
    @After
    public void destroy() throws IOException {
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void findAllTest(){
        List<Account> allaccount = accountDao.findAll();
        System.out.println(allaccount);
    }

    @Test
    public void saveTest(){
        Account account = new Account();
        account.setName("zs");
        account.setMoney(123);

        accountDao.save(account);
    }
}
