package com.example.altpmobilegame;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	SQLiteDatabase db;
	
	Button btnStart;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        
        setContentView(R.layout.screen_main);
        
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(btnStart_Listener);
        
        /*String myDbPath = "data/data/com.example.altpmobilegame/ALTP_DB";
        TextView txtMsg = (TextView)findViewById(R.id.txtMsg);
        txtMsg.setText("DB Path: " + myDbPath);
        try
        {
        	db = SQLiteDatabase.openDatabase(myDbPath,
        			null, SQLiteDatabase.CREATE_IF_NECESSARY);
        	db.close();
        	txtMsg.append("\nAll done!");
        }
        catch(SQLiteException e)
        {
        	txtMsg.append(e.getMessage());
        }*/
    }

    private OnClickListener btnStart_Listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			playWelcome();
		}
	};
	
	public void playWelcome()
	{
		try
		{
			MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.welcome_altp);
			mp.start();
			
			mp.setOnCompletionListener(new OnCompletionListener() {
				
				@Override
				public void onCompletion(MediaPlayer arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
					startActivity(intent);
					
				}
			});
		}
		catch(Exception e)
		{
			Toast.makeText(MainActivity.this, e.getMessage(), 1).show();
		}
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
