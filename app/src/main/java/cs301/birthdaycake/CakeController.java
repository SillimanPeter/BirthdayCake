package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements  View.OnClickListener,
                                        CompoundButton.OnCheckedChangeListener,
                                        SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel model;

    CakeController(CakeView view)
    {
        cakeView = view;
        model = view.getCakeModel();
    }

    public void onClick(View viewButt)
    {
        Button newB = (Button)viewButt;
        Log.d("blowOut", " Clicked");
        if(newB.getText().equals("Re-Light"))
        {
            newB.setText("Blowout");
        } else {
            newB.setText("Re-Light");
        }

        model.candlesBlow();
        cakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton viewButt, boolean isChecked)
    {
        if(viewButt.getId() == R.id.candlesSwitch) {
            Log.d("Candles", "Clicked");
            model.candlesToggle();
            cakeView.invalidate();
        } else {
            Log.d("Frosting", "Clicked");
            model.frostingToggle();
            cakeView.invalidate();
        }
    }

    public void onProgressChanged(SeekBar viewSlider, int progress, boolean fromUser)
    {
        Log.d("CandleCount", "Changed to " + progress);
        model.candleCount(progress);
        cakeView.invalidate();
    }

    public void onStopTrackingTouch (SeekBar seekBar) {}
    public void onStartTrackingTouch (SeekBar seekBar) {}

}
