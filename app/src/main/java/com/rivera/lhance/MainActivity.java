
package com.rivera.lhance;

import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itb","OnStop() successfully executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itb", "OnStart() successfully executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itb","onResume() successfully executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itb", "onRestart() successfully executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itb", "onPause() successfully executed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itb","onCreate() successfully executed");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("4itb","0nDestroy() successfully executed");
    }

    public void btnBack (View v) {
        Toast.makeText(this, "Sorry! Cannot go back yet.", Toast.LENGTH_SHORT).show();
    }

    public void btnNext (View v) {
        Snackbar.make(v, "Sorry! There's nothing more.", Snackbar.LENGTH_LONG).show();
    }

}
