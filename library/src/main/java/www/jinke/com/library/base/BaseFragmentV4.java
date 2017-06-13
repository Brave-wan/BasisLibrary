package www.jinke.com.library.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import www.jinke.com.library.utils.commont.NetWorksUtils;

/**
 * Created by root on 16-11-13.
 */
public abstract class BaseFragmentV4 extends Fragment {

    protected BaseActivity mActivity;

    //获取布局文件ID
    protected abstract int getLayoutId();
    public boolean isConnected = false;
    protected abstract void initView(View view, Bundle savedInstanceState);

    //获取宿主Activity
    protected BaseActivity getHoldingActivity() {
        return mActivity;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        isConnected = NetWorksUtils.isConnected(getActivity());
        View view = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        initView(view, savedInstanceState);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mActivity = (BaseActivity) context;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public void showToast(String msg){
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();

    }


}
