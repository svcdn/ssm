package com.dnsoft.springlessons.lesson4;

import org.junit.Assert;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//需要spring-test包
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dnsoft.springlessons.lesson4.CompactDisc;
import com.dnsoft.springlessons.lesson4.MediaPlayer;
import com.dnsoft.springlessons.lesson4.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
//指定配置类
@ContextConfiguration(classes=SoundSystemConfig.class)
public class AppTest {
    
	@Autowired
	private MediaPlayer player;
	   
	@Autowired
	private CompactDisc cd;

    @Test
    public void testApp()
    {
        player.play();
    }
}
