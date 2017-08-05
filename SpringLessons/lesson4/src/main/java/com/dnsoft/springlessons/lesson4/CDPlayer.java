package com.dnsoft.springlessons.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	 
	@Autowired
	public CDPlayer(CompactDisc cd) {
	   this.cd = cd;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("cdplayer");
		cd.play();

	}

}
