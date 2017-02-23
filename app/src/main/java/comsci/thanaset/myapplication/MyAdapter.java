package comsci.thanaset.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thanaset on 23/2/2560.
 */
// Activity นี้ทำเสร้างเพื่อทำ rayout เสมือนเพื่อนำไปแสดงผลหน้า Main Activity
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private int [] ints;
    private String [] titleStrings,detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount( ) { //ใช้นับจำนวนข้อมูล แล้วส่งไป getview
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//รับจำนวนข้อมูลแล้วนำไปแสดงผลต่อบนหน้าเว็ป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.my_listview,parent,false);
        //intitial view ผูกIDของ view กับตัวแปร เพื่อให้รู้จักกัน

        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titletextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailtextView  = (TextView) view.findViewById(R.id.txtDetaiLiv);
        // show view นำข้อมูลไปแสดงผมบนห้า app
        imageView.setImageResource(ints[position]);
        titletextView.setText(titleStrings[position]);
        detailtextView.setText(detailStrings[position]);


        return view;
    }
} // main class
