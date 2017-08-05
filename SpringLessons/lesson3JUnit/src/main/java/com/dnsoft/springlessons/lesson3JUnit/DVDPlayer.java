package com.dnsoft.springlessons.lesson3JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DVDPlayer implements MediaPlayer {

	private CompactDisc cd;
	 
	@Autowired
	public DVDPlayer(CompactDisc cd) {
	   this.cd = cd;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("dvdplayer");
		cd.play();

	}

}
