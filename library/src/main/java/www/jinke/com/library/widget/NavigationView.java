package www.jinke.com.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import www.jinke.com.library.R;

/**
 * Created by root on 16-11-14.
 */
public class NavigationView extends RelativeLayout implements View.OnClickListener {


    public NavigationView(Context context) {
        this(context, null);
    }

    private ImageView backView;
    private TextView titleView;
    private TextView save;
    private Context mContext;

    public NavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        View view = LayoutInflater.from(context).inflate(R.layout.activity_customtitleview, this, true);
        backView = (ImageView) view.findViewById(R.id.customtitle_back);
        backView.setOnClickListener(this);
        titleView = (TextView) view.findViewById(R.id.customtitle_title);
        save = (TextView) view.findViewById(R.id.customtitle_save);
        save.setOnClickListener(this);
    }


    /**
     * 获取返回按钮
     *
     * @return
     */
    public ImageView getBackView() {
        return backView;
    }

    /**
     * 获取标题控件
     *
     * @return
     */
    public TextView getTitleView() {
        return titleView;
    }

    /**
     * 设置标题
     *
     * @param title
     */
    public void setTitle(String title) {
        titleView.setText(title);
    }

    /**
     * 获取右侧按钮,默认不显示
     *
     * @return
     */
    public TextView getRightView() {
        return save;
    }

    /**
     * 设置保存 按钮是否可见
     *
     * @param VISIBLE
     */
    public void setSaveVISIBLE(int VISIBLE) {
        save.setVisibility(VISIBLE);
    }


    public void setBackViewVisible(int VISIBLE){
        backView.setVisibility(VISIBLE);
    }

    private OnNacigationTitleCallback callback;

    /**
     * 设置按钮点击回调接口
     *
     * @param callback
     */
    public void setOnNavigationCallback(OnNacigationTitleCallback callback) {
        this.callback = callback;
    }

    public interface OnNacigationTitleCallback {
        void onBackClick();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.customtitle_back) {
            callback.onBackClick();
            return;
        }

    }
}
