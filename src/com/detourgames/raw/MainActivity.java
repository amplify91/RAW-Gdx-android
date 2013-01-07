package com.detourgames.raw;

import tv.ouya.console.api.OuyaFacade;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication {
	
	public static final String OUYA_DEV_ID = "7d711435-a3f5-4f4b-b9e9-70f101d43df0";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//OuyaFacade.getInstance().init(this, OUYA_DEV_ID);
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = true;
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        
        initialize(GameRAW.getGameRAW(), cfg);
        
    }
    
    @Override
    protected void onDestroy() {
        //OuyaFacade.getInstance().shutdown();
        super.onDestroy();
    }
}