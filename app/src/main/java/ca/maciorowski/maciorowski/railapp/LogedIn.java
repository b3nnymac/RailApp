package ca.maciorowski.maciorowski.railapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LogedIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged_in);

        String userEmail = getIntent().getStringExtra("passingEmail");
        TextView email = (TextView) findViewById(R.id.userEmail);
        email.setText(userEmail);

        String userPassword = getIntent().getStringExtra("passingPass");
        TextView pass = (TextView) findViewById(R.id.userPassword);
        pass.setText(userPassword);

    }
}
