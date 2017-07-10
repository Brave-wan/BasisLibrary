package www.jinke.com.utilslibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

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
        data.add("hello");
        data.add("hello");
        data.add("hello");
        data.add("hello");
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
            TextView textView = holder.getView(R.id.hello);
            textView.setText("hello");
        }
    }
}
