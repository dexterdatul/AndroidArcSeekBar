package android.com.androidarcseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.marcinmoskala.arcseekbar.ArcSeekBar;
import com.marcinmoskala.arcseekbar.ProgressListener;

public class MainActivity extends AppCompatActivity {

    ArcSeekBar defaultSeekBar, seekBarBackground, gradientSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultSeekBar = (ArcSeekBar) findViewById(R.id.defaultSeekBar);
        seekBarBackground = (ArcSeekBar) findViewById(R.id.seekBarBackground);
        gradientSeekBar = (ArcSeekBar) findViewById(R.id.gradientSeekBar);

        int[] colorArray = getResources().getIntArray(R.array.gradient);
        gradientSeekBar.setProgressGradient(colorArray);

        defaultSeekBar.setOnProgressChangedListener(new ProgressListener() {
            @Override
            public void invoke(int i) {
                Log.d("VALUE", "" + i);
            }
        });

        seekBarBackground.setOnProgressChangedListener(new ProgressListener() {
            @Override
            public void invoke(int i) {
                Log.d("VALUE", "" + i);
            }
        });

        gradientSeekBar.setOnProgressChangedListener(new ProgressListener() {
            @Override
            public void invoke(int i) {
                Log.d("VALUE", "" + i);
            }
        });


    }
}
