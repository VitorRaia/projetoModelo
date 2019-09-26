package br.com.vitorprimeiroapp.projetomodelo;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
    private static final int TEMPO_PARA_CHAMAR_PROXIMA_ACITVITY = 3000;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_fullscreen);
        iniciarTeleaSplash();
    }
private void iniciarTeleaSplash(){
    new Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            finish();
            Intent splash = new Intent();
            splash.setClass(FullscreenActivity.this,
                ActivityLogin1.class);
            startActivity(splash);
           }
        },TEMPO_PARA_CHAMAR_PROXIMA_ACITVITY);
    }
}