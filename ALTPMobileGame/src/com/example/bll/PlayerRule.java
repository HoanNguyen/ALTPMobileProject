package com.example.bll;

import android.app.Activity;

public class PlayerRule extends Thread{
	
	Activity temp;
	public PlayerRule(Activity temp)
	{
		this.temp = temp;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		PlayerActivity_BLL.guidePlayerRule(this.temp);
	}
}
