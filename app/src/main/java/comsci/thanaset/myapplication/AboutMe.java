package comsci.thanaset.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }




    public void facebook(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/?stype=lo&jlou=Afc6Lo-wLIH0tskKujSTsxw8IovkKE4pOmQinwrxP7V8NumVB-Lu2PFCHcmveL1uMRCAdPfc58RTmd68W92mNsf92BQKY39HRfdKyt1Cxk7m2g&smuh=59046&lh=Ac_hicu_U7xe8IRZ"));
        startActivity(intent);


    }

    public void cickbackk(View view){

        finish();
    }
}
