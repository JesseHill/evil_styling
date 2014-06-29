package jbhill.evilstyling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class EvilStyling extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evil_styling);
        ((RadioButton) findViewById(R.id.radio_button_one)).setChecked(true);
        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    private void back() {
        startActivity(new Intent(this, AndroidStyling.class));
    }
}
