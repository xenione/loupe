package loupe.xenione.com.loupe;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.Toast;

import com.xenione.widget.loupe.LoupeView;

public class MainActivity extends AppCompatActivity {

    private LoupeView mLoupeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoupeView = (LoupeView) findViewById(R.id.image_view);
        assert mLoupeView != null;
        mLoupeView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bg_pau));

        mLoupeView.setMFactor(2);
        SeekBar factorMBar = (SeekBar) findViewById(R.id.factor_bar);
        assert factorMBar != null;
        factorMBar.setOnSeekBarChangeListener(mOnFactorChangeListener);
        factorMBar.setProgress(2);

        mLoupeView.setRadius(100);
        SeekBar radiusBar = (SeekBar) findViewById(R.id.radius_bar);
        assert radiusBar != null;
        radiusBar.setOnSeekBarChangeListener(mOnRadiusChangeListener);
        radiusBar.setProgress(100);

        Toast.makeText(this, "Touch image for zoom", Toast.LENGTH_LONG).show();
    }


    private SeekBar.OnSeekBarChangeListener mOnFactorChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            mLoupeView.setMFactor(progress + 1);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private SeekBar.OnSeekBarChangeListener mOnRadiusChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            mLoupeView.setRadius(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
