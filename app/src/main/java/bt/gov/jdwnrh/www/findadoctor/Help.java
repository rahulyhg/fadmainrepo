package bt.gov.jdwnrh.www.findadoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void onClick(View view){
        Intent i = new Intent(Help.this, setting.class);
        startActivity(i);
    }
}
