package fiit.baranek.tomas.gpssky;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean SharingInformationSet=false;
    private boolean BasicInformationSet=false;
    private boolean SMSInformationSet=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void BasicSettings(View v){
        Intent intent = new Intent(this, BasicSettingsActivity.class);
        startActivity(intent);
    }

    public void SMSSettings(View v){
        Intent intent = new Intent(this, SMSsettingsActivity.class);
        startActivity(intent);
    }

    public void SharingSettings(View v){
        onPause();
        Intent intent = new Intent(this, SharingSettingsActivity.class);
        startActivity(intent);

    }


    String StatusSetting="";

    public void Start(View v){



        /*if(SharingInformationSet==false) StatusSetting="Sharing";
        if(SMSInformationSet==false && StatusSetting.equals(""))   StatusSetting="SMS";
            else if (SMSInformationSet==false)  StatusSetting=StatusSetting+", sms";

        if(BasicInformationSet==false && StatusSetting.equals(""))   StatusSetting="Basic";
        else if (SMSInformationSet==false)  StatusSetting=StatusSetting +", basic";

        if(StatusSetting.equals("")) Toast.makeText(MainActivity.this, "Letíme do vesmíru", Toast.LENGTH_SHORT).show();
        else Toast.makeText(MainActivity.this, StatusSetting + " information not set", Toast.LENGTH_SHORT).show();
        */
    }

}
