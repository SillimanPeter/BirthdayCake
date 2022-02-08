package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
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
        Log.d("blowOut", " Clicked");
        model.candlesBlow();
        cakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton viewButt, boolean isChecked)
    {
        //if(/*is viewbutt the candleSwitch view or frostingSwitch view? */) {
            Log.d("Candles", "Clicked");
            model.candlesToggle();
            //viewButt.findViewById(R.id.blowOut).setText("Re-light");
            cakeView.invalidate();
       // } else {
            Log.d("Frosting", "Clicked");
            model.frostingToggle();
            cakeView.invalidate();
        //}
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
