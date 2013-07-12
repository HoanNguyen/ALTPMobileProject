package com.example.bll;

import android.os.Message;

import com.example.altpmobilegame.PlayerActivity;
import com.example.altpmobilegame.R;

public class MoneyLevelBackground extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1; i<17; i++)
		{
			Message msg = PlayerActivity.handler.obtainMessage(1, (String)String.valueOf(i));
			PlayerActivity.handler.sendMessage(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		//PlayerActivity_BLL.setMoneyLevelBackground();
		//PlayerActivity_BLL.setTextViewBackground(PlayerActivity.lblMoney1, R.drawable.blue_gradient);
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//PlayerActivity_BLL.setTextViewBackground(PlayerActivity.lblMoney2, R.drawable.blue_gradient);
	}
}
