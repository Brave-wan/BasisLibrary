package www.jinke.com.library.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import www.jinke.com.library.R;


/**
 * Created by root on 15/12/16.
 */

public class ProgressDialog extends Dialog {
    private ProgressView progressWheel;

    public ProgressDialog(Context context) {
        super(context, R.style.promptDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_progress);
        progressWheel = (ProgressView) findViewById(R.id.progressBarTwo);
        styleRandom(progressWheel,getContext());
        progressWheel.resetCount();
        progressWheel.setText("JK");
        progressWheel.startSpinning();

    }
    private  void styleRandom(ProgressView wheel, Context ctx) {
        wheel.setRimShader(null);
        wheel.setRimColor(0xFFFFFFFF);
        wheel.setCircleColor(0x00000000);
        wheel.setBarColor(0xFF000000);
        wheel.setContourColor(0xFFFFFFFF);
        wheel.setBarWidth(pxFromDp(ctx, 1));
        wheel.setBarLength(pxFromDp(ctx, 100));
        wheel.setSpinSpeed(4f);
        wheel.setDelayMillis(3);
    }


    public static int pxFromDp(final Context context, final float dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }

}
