package in.www.sessionlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String name1,txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx=findViewById(R.id.txt1);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        name1=preferences.getString("key_id",null);
      checkUser();
        Button logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = settings.edit();
                editor.remove("Key_id");
                editor.clear();
                editor.commit();
                if(settings.getString("key_id",null)!=null) {
                    Toast.makeText(getApplicationContext(),"bfbdf",Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent i=new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"hdfdhds12",Toast.LENGTH_SHORT).show();
                }
                }


               /* Intent i=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);*/



        });

    }
    public void checkUser()
    {
        if(name1!=null)
        {
            Toast.makeText(MainActivity.this,"dbsadhadg",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
            Toast.makeText(MainActivity.this,"dabhsf",Toast.LENGTH_SHORT).show();
        }

    }
}
