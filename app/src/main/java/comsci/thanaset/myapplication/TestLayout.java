package comsci.thanaset.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TestLayout extends AppCompatActivity {

    //Explicit
    MediaPlayer mediaPlayer;
    int soundID =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);

        //toast onclkick
        ImageView clickImageView = (ImageView) findViewById(R.id.imvMypic);
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Hello!!! I am thanaset",Toast.LENGTH_SHORT).show();
                //show sound1 when click image
                soundID = R.raw.name;
                playsound(soundID);//build method sound
            }
        });

        ImageView longClickImageView = (ImageView) findViewById(R.id.imvMypic);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                 Toast.makeText(getApplicationContext(),"Thanks Guy!!!",Toast.LENGTH_SHORT).show();

                soundID = R.raw.tank;
                playsound(soundID);
                return true;

                
            }
        });
        //phone on click
        TextView Phone = (TextView) findViewById(R.id.txtTel);
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:0929942451"));
                startActivity(phoneIntent);

            }
        });//ดักฟังว่ามีการคลิ๊กไหม


    }

    private void playsound(int soundID) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(),soundID);
        mediaPlayer.start();
    }

}

