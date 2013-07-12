package com.example.altpmobilegame;

import com.example.bll.PlayerActivity_BLL;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class PlayerActivity extends Activity{
	
	public static TextView lblMoney1, lblMoney2, lblMoney3, lblMoney4, lblMoney5, lblMoney6,
			lblMoney7, lblMoney8, lblMoney9, lblMoney10, lblMoney11, lblMoney12,
			lblMoney13, lblMoney14, lblMoney15;
	
	public static Handler handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg) 
		{
			int index = Integer.valueOf((String)msg.obj);
			switch(index)
			{
				case 1:
				{
					lblMoney1.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 2:
				{
					lblMoney1.setBackgroundResource(0);
					lblMoney2.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 3:
				{
					lblMoney2.setBackgroundResource(0);
					lblMoney3.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 4:
				{
					lblMoney3.setBackgroundResource(0);
					lblMoney4.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 5:
				{
					lblMoney4.setBackgroundResource(0);
					lblMoney5.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 6:
				{
					lblMoney5.setBackgroundResource(0);
					lblMoney6.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 7:
				{
					lblMoney6.setBackgroundResource(0);
					lblMoney7.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 8:
				{
					lblMoney7.setBackgroundResource(0);
					lblMoney8.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 9:
				{
					lblMoney8.setBackgroundResource(0);
					lblMoney9.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 10:
				{
					lblMoney9.setBackgroundResource(0);
					lblMoney10.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 11:
				{
					lblMoney10.setBackgroundResource(0);
					lblMoney11.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 12:
				{
					lblMoney11.setBackgroundResource(0);
					lblMoney12.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 13:
				{
					lblMoney12.setBackgroundResource(0);
					lblMoney13.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 14:
				{
					lblMoney13.setBackgroundResource(0);
					lblMoney14.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				case 15:
				{
					lblMoney14.setBackgroundResource(0);
					lblMoney15.setBackgroundResource(R.drawable.blue_gradient);
					break;
				}
				default:
				{
					lblMoney15.setBackgroundResource(0);					
					break;
				}
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player);
		
		setTextViewMoney();
		
		PlayerActivity_BLL.guidePlayerRule_Thread(this);
		PlayerActivity_BLL.setMoneyLevelBackground_Thread();
		
	}
	
	private void setTextViewMoney()
	{
		lblMoney1 = (TextView) findViewById(R.id.lblMoney1);
		lblMoney2 = (TextView) findViewById(R.id.lblMoney2);
		lblMoney3 = (TextView) findViewById(R.id.lblMoney3);
		lblMoney4 = (TextView) findViewById(R.id.lblMoney4);
		
		lblMoney5 = (TextView) findViewById(R.id.lblMoney5);
		lblMoney6 = (TextView) findViewById(R.id.lblMoney6);
		lblMoney7 = (TextView) findViewById(R.id.lblMoney7);
		lblMoney8 = (TextView) findViewById(R.id.lblMoney8);
		
		lblMoney9 = (TextView) findViewById(R.id.lblMoney9);
		lblMoney10 = (TextView) findViewById(R.id.lblMoney10);
		lblMoney11 = (TextView) findViewById(R.id.lblMoney11);
		lblMoney12 = (TextView) findViewById(R.id.lblMoney12);
		
		lblMoney13 = (TextView) findViewById(R.id.lblMoney13);
		lblMoney14 = (TextView) findViewById(R.id.lblMoney14);
		lblMoney15 = (TextView) findViewById(R.id.lblMoney15);		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		/*Thread background = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try
				{
					Message msg = handler.obtainMessage(1, (String)"1");
					handler.sendMessage(msg);
					Thread.sleep(1000);
					msg = handler.obtainMessage(1, (String)"2");
					handler.sendMessage(msg);
				}
				catch(Throwable t)
				{
					
				}
			}
		});
		background.start();*/
	}
}
