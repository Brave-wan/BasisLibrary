package www.jinke.com.utilslibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import www.jinke.com.library.adapter.BaseAdapter;
import www.jinke.com.library.adapter.BaseHolder;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data.add("http://t2.27270.com/uploads/tu/201707/9999/ab1dd75259.jpg");
        data.add("http://t2.27270.com/uploads/tu/201707/9999/b6ec873126.jpg");
        data.add("http://t2.27270.com/uploads/tu/201707/9999/d32231dddc.jpg");
        data.add("http://t2.27270.com/uploads/tu/201707/9999/e32179c89d.jpg");
        data.add("http://t2.27270.com/uploads/tu/201707/9999/0255e0427e.jpg");
        recyclerView = (RecyclerView) findViewById(R.id.listView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this, data, R.layout.listview_item);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
    }

    public class MyAdapter extends BaseAdapter<String> {

        public MyAdapter(Context context, List<String> data, int layoutId) {
            super(context, data, layoutId);
        }

        @Override
        public void onBind(BaseHolder holder, String s, int position) {
            SimpleDraweeView textView = holder.getView(R.id.id_main_sdv_sdv);
            textView.setImageURI(s);

        }
    }
}
