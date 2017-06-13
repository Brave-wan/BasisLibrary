package www.jinke.com.library.utils.commont;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;


/**
 * Created by root on 19/11/16.
 */

public class DrawableUtils {

    public static void setTextDrawable(TextView textView, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public static void setTextTopDrawable(TextView textView, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(null, drawable, null, null);
    }

    public static void setTextRightDrawable(TextView textView, Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(null, null, drawable, null);
    }

    public static void setImageView(SimpleDraweeView draweeView, String path) {
        Uri uri = Uri.parse(path);
        draweeView.setImageURI(uri);
    }

}
