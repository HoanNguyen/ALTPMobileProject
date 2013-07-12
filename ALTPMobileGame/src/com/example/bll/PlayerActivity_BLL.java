package com.example.bll;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;
import android.widget.Toast;

import com.example.altpmobilegame.PlayerActivity;
import com.example.altpmobilegame.R;

public class PlayerActivity_BLL {
	
	public static void guidePlayerRule(Activity playerActivity)
	{
		try
		{		
			MediaPlayer mp = MediaPlayer.create(playerActivity, R.raw.play_rule);
			mp.start();
						
			mp.setOnCompletionListener(new OnCompletionListener() {
				
				@Override
				public void onCompletion(MediaPlayer arg0) {
					// TODO Auto-generated method stub
										
				}
			});
		}
		catch(Exception e)
		{
			Toast.makeText(playerActivity, e.getMessage(), 1).show();
		}
	}
	
	public static void guidePlayerRule_Thread(Activity playerActivity)
	{
		PlayerRule playerRule = new PlayerRule(playerActivity);
		playerRule.start();
	}
	
	public static void setMoneyLevelBackground()
	{
		//setTextViewBackground(PlayerActivity.lblMoney1, R.drawable.blue_gradient);
		/*Handler handler = new Handler(); 
	    handler.postDelayed(new Runnable() { 
	         public void run() { 
	        	 setTextViewBackground(PlayerActivity.lblMoney1, 0); 
	         } 
	    }, 500); */
		//SystemClock.sleep(500);
		/*final Handler handler = new Handler(); 
        Timer t = new Timer(); 
        t.schedule(new TimerTask() { 
                public void run() { 
                        handler.post(new Runnable() { 
                                public void run() { 
                                	setTextViewBackground(PlayerActivity.lblMoney1, 0); 
                                } 
                        }); 
                } 
        }, 500); */
		new Thread() {
            public void run() {
                try{
                    // Do some work here
                    sleep(5000);
                } catch (Exception e) {
                }
                
            }
        }.start();  
		
		//setTextViewBackground(PlayerActivity.lblMoney2, R.drawable.blue_gradient);
		
		//setTextViewBackground(PlayerActivity.lblMoney2, 0);
	}
	
	public static void setTextViewBackground(TextView lbl, int resid)
	{		
		lbl.setBackgroundResource(resid);
	}
	
	public static void setMoneyLevelBackground_Thread()
	{
		MoneyLevelBackground moneyLevelBackground = new MoneyLevelBackground();
		moneyLevelBackground.start();
	}
	
}
