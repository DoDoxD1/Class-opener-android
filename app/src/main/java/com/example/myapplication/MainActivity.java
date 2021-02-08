package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //refrences
        TextView display = findViewById(R.id.dispplay);
        Button joinButton = findViewById(R.id.join);

        //current time and day
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String classNow = "Null";

        switch (day){
            case 1:
                display.setText("Lol! bro today is sunday.");
                break;
            case 2:
                classNow = monday(hour,min);
                display.setText(classNow);
                break;
            case 3:
                classNow = tuesday(hour,min);
                display.setText(classNow);
                break;
            case 4:
                classNow = wednesday(hour,min);
                display.setText(classNow);
                break;
            case 5:
                classNow = thursday(hour,min);
                display.setText(classNow);
                break;
            case 6:
                classNow = friday(hour,min);
                display.setText(classNow);
                break;
            case 7:
                display.setText("Now saturday is off too!");
                break;
            default:
                display.setText("Something suspicious!");
        }

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String activeClass = display.getText().toString();
                joinClass(activeClass);
            }

            private void joinClass(String activeClass) {
                if (activeClass.equals("Computer Workshop")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_15591_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Communication")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_16923_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Communication Lab")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_16776_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Maths/Calculus")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_17254_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("IOT")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_15901_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("BEEE")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_16210_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Maths/Calculus")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_17254_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("BEEE Lab")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_16147_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Mentoring")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_17913_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("C++")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_15736_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("C++ Lab")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_15441_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Physics")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_17522_1/outline"));
                    startActivity(browserIntent);
                }
                else if(activeClass.equals("Physics Lab")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cuchd.blackboard.com/ultra/courses/_17429_1/outline"));
                    startActivity(browserIntent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Error!, Can't join class at the moment",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private String monday(int hour, int min) {
        if (hour == 9)
            if (min>45)
                return "Communication";
            else
                return "No class now";
        else if (hour == 10)
            if (min>45)
                return "Physics Lab";
            else
                return "Communication";
        else if (hour == 11)
            if (min>45)
                return "Physics Lab";
            else
                return "Physics Lab";
        else if (hour == 12)
            if (min>45)
                return "It's lunch Bro!";
            else
                return "Physics Lab";
        else if (hour == 13)
            if (min>30)
                return "Maths/Calculus";
            else
                return "It's lunch Bro!";
        else if (hour == 14)
            if (min>30)
                return "Communication Lab";
            else
                return "Maths/Calculus";
        else if (hour == 15)
            if (min>30)
                return "Communication Lab";
            else
                return "Communication Lab";
        else
            return "No class now";
    }

    private String tuesday(int hour, int min) {
        if (hour == 9)
            if (min>45)
                return "Maths";
            else
                return "No class now";
        else if (hour == 10)
            if (min>45)
                return "Computer Workshop";
            else
                return "Maths";
        else if (hour == 11)
            if (min>45)
                return "Computer Workshop";
            else
                return "Computer Workshop";
        else if (hour == 12)
            if (min>45)
                return "It's lunch Bro!";
            else
                return "Computer Workshop";
        else if (hour == 13)
            if (min>30)
                return "BEEE";
            else
                return "It's lunch Bro!";
        else if (hour == 14)
            if (min>30)
                return "Maths/Calculus";
            else
                return "BEEE";
        else if (hour == 15)
            if (min>30)
                return "Mentoring";
            else
                return "Maths/Calculus";
        else
            return "No class now";
    }

    private String wednesday(int hour, int min) {
        if (hour == 9)
            if (min>45)
                return "C++ Lab";
            else
                return "No class now";
        else if (hour == 10)
            if (min>45)
                return "C++ Lab";
            else
                return "C++ Lab";
        else if (hour == 11)
            if (min>45)
                return "Maths/Calculus";
            else
                return "C++ Lab";
        else if (hour == 12)
            if (min>45)
                return "It's lunch Bro!";
            else
                return "Maths/Calculus";
        else if (hour == 13)
            if (min>30)
                return "IOT";
            else
                return "It's lunch Bro!";
        else if (hour == 14)
            if (min>30)
                return "IOT";
            else
                return "IOT";
        else if (hour == 15)
            if (min>30)
                return "Physics";
            else
                return "IOT";
        else
            return "No class now";
    }

    private String thursday(int hour, int min) {
        if (hour == 9)
            if (min>45)
                return "Physics";
            else
                return "No class now";
        else if (hour == 10)
            if (min>45)
                return "BEEE";
            else
                return "Physics";
        else if (hour == 11)
            if (min>45)
                return "It's lunch Bro!";
            else
                return "BEEE";
        else if (hour == 12)
            if (min>45)
                return "Communication";
            else
                return "It's lunch Bro!";
        else if (hour == 13)
            if (min>30)
                return "Maths/Calculus";
            else
                return "Communication";
        else if (hour == 14)
            if (min>30)
                return "C++ Lab";
            else
                return "Maths/Calculus";
        else if (hour == 15)
            if (min>30)
                return "C++ Lab";
            else
                return "C++ Lab";
        else
            return "No class now";
    }

    private String friday(int hour, int min){
        if (hour == 9)
            if (min>45)
                return "BEEE";
            else
                return "No class now";
        else if (hour == 10)
            if (min>45)
                return "C++";
            else
                return "BEEE";
        else if (hour == 11)
            if (min>45)
                return "C++";
            else
                return "C++";
        else if (hour == 12)
            if (min>45)
                return "It's lunch Bro!";
            else
                return "C++";
        else if (hour == 13)
            if (min>30)
                return "Physics";
            else
                return "It's lunch Bro!";
        else if (hour == 14)
            if (min>30)
                return "BEEE Lab";
            else
                return "Physics";
        else if (hour == 15)
            if (min>30)
                return "BEEE Lab";
            else
                return "BEEE Lab";
        else
            return "No class now";
    }

}