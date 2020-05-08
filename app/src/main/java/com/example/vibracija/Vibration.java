package com.example.vibracija;

import android.content.Context;
import android.os.Vibrator;

public class Vibration {
    private Vibrator vibrator;
    private Context context;
    private boolean mIsVibrating = false;
    private long[] pattern = {1000, 2000};


    public Vibration(Context context) {
        this.context = context;
        vibrator = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
    }

    public void TurnOn(int i){
        if(i == 0 && !mIsVibrating){
            vibrator.vibrate(pattern, 0);
            mIsVibrating = true;
        }else if(i != 0){
            Stop();
        }
    }

    public void Stop(){
        vibrator.cancel();
        mIsVibrating = false;
    }
}
