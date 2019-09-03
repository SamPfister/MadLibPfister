package com.example.madlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MadLibText extends AppCompatActivity {
    public static final String RESTAURANT1 = "restaurant1";
    public static final String NUMBER1 = "number1";
    public static final String DAY1 = "day1";
    public static final String NUMBER2 = "number2";
    public static final String FOOD1 = "food1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_text);
        Intent intent = getIntent();
        String number1 = intent.getStringExtra(NUMBER1);
        String restaurant1 = intent.getStringExtra(RESTAURANT1);
        String day1 = intent.getStringExtra(DAY1);
        String number2 = intent.getStringExtra(NUMBER2);
        String food1 = intent.getStringExtra(FOOD1);
        String myMessage = "After " + number1 + " long months of campaigning, the CEO of " + restaurant1 + " has been elected President of the United States. ";
        myMessage += "'I can't believe you idiots actually voted for me, what's my qualification?' said the President-elect last " + day1 + ", going on to say that ";
        myMessage += "'You know, " + number2 +" years ago I was just a manager, but now I'm here, somehow.'";
        myMessage += " Political experts believe that the CEO of " + restaurant1 + "'s political success came from the slogan '" + food1 +"s for all', though this is just speculation.";
        myMessage += " Stay tuned until 10 to find out how eggs might be bad for you.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(myMessage);
    }



    public void shareInfo(View v) {
        TextView madLib = (TextView) findViewById(R.id.info);
        String madLibShare = madLib.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, madLibShare);
        // declare the title for when pulling up all the apps
        String chooserTitle = getString(R.string.chooser);
        // the createChooser method will select all the apps that are able to send messages
        // and will list them along with the title specified above. Whichever one you select
        // is returned, and then that activity is launched with the info passed.
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

}
