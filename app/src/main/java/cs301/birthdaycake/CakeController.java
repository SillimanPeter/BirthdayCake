package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView view;
    private CakeModel model;

    CakeController(CakeView view)
    {
        this.view = view;
        model = view.getCakeModel();
    }

    public void onClick(View view)
    {
        Log.d("blowOut", " Clicked.");
        model.toggleLit();
        view.invalidate();
    }

}
