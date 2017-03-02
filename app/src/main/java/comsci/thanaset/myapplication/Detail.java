package comsci.thanaset.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //initial view ผูกหน้า ui กับ java
        TextView titailTextView = (TextView) findViewById(R.id.txtTitledetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.bntBack);

        //show data from mainactivity มาแสดงใน detail
        titailTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("image",R.drawable.traffic_01));
    }

    public void clickback(View view){

        finish();
    }
}
