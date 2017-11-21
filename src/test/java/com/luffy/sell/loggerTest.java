package com.luffy.sell;



import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @Author:luffyhongliang
 * @Date:Created in :17:30 2017/11/20
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class loggerTest {
  private final Logger logger = LoggerFactory.getLogger(loggerTest.class);


    @Test
    public void testLogger(){
        logger.debug("debug");
        logger.info("info");


    }
}
