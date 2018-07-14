package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ans;
    TextView tv1;
    RadioButton a, b, c, d;
    Button bt;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rg;
    LinearLayout LL, editTextLL;
    String answer;
    int q, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.name);
        ans = (EditText) findViewById(R.id.ans);
        ans.getText();
        answer = ans.toString();
        tv1 = (TextView) findViewById(R.id.ques);
        rg = (RadioGroup) findViewById(R.id.optionGroup);
        LL = (LinearLayout) findViewById(R.id.checkBoxLL);
        editTextLL = (LinearLayout) findViewById(R.id.editTextLL);
        a = (RadioButton) findViewById(R.id.option1);
        b = (RadioButton) findViewById(R.id.option2);
        c = (RadioButton) findViewById(R.id.option3);
        d = (RadioButton) findViewById(R.id.option4);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        bt = (Button) findViewById(R.id.next);
        q = 0;
        s = 0;

    }

    public void quiz(View v) {
        switch (q) {
            case 0: {
                rg.setVisibility(View.VISIBLE);
                LL.setVisibility(View.INVISIBLE);
                editTextLL.setVisibility(View.INVISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText("Next");
                s = 0;

                tv1.setText("1. Film director Spike Lee has been able to keep his independence as a filmmaker mostly by");
                a.setText("carefully creating projects with commercial potential.");
                b.setText("keeping costs under control and making do.");
                c.setText("getting huge budgets from film studios.");
                d.setText("directing only blockbuster films.");
                q = 1;
                break;
            }
            case 1: {
                ed1.setEnabled(false);
                tv1.setText("2.Before Akshay Kumar became an actor, he worked as a...?");
                a.setText("Waiter");
                b.setText("Reporter");
                c.setText("Journalist");
                d.setText("model");

                if (b.isChecked()) {
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                    s = s + 10;
                } else {
                    Toast.makeText(this, "wrong answer is B", Toast.LENGTH_SHORT).show();
                }
                q = 2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2: {
                tv1.setText("3.Subhash Ghai's first film as a director was...?");
                a.setText("Karma");
                b.setText("Vidhaata");
                c.setText("Kalicharan");
                d.setText("Pardes");
                if (a.isChecked()) {
                    s = s + 10;
                    Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "wrong answer is A", Toast.LENGTH_SHORT).show();
                }
                q = 3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3: {

                tv1.setText("4.In which year did Amitabh Bachchan debut in Hindi cinema?");
                a.setText("1950");
                b.setText("1972");
                c.setText("1974");
                d.setText("1960");
                if (c.isChecked()) {
                    s = s + 10;
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "wrong answer is C", Toast.LENGTH_SHORT).show();

                }
                q = 4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4: {
                tv1.setText("5. In Harry Potter, who plays Hagrid in the movie?");
                a.setText("Robert DeNiro");
                b.setText("John Coltrane");
                c.setText("Robbie Coltrane");
                d.setText("Robbie Coltrane");
                if (b.isChecked()) {
                    s = s + 10;
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "wrong answer is B", Toast.LENGTH_SHORT).show();
                }
                q = 5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 5: {
                LL.setVisibility(View.VISIBLE);
                tv1.setText("7.which names apart from akbar completes the name of this iconic indian movie? ");
                cb1.setText("Amar");
                cb2.setText("Abdul");
                cb3.setText("Anthony");
                cb4.setText("Adam");
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (d.isChecked()) {
                    s = s + 10;
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "wrong answer is D", Toast.LENGTH_SHORT).show();
                }
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                rg.setVisibility(View.INVISIBLE);
                q = 6;
                break;
            }
            case 6: {
                LL.setVisibility(View.INVISIBLE);
                editTextLL.setVisibility(View.VISIBLE);
                tv1.setText("7. Which hollywood actress has recieved the most number of oscar nominations");
                answer = ans.getText().toString();
                answer = answer.trim();
                if (cb1.isChecked() && cb3.isChecked() && !cb2.isChecked() && !cb4.isChecked()) {
                    s = s + 10;
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "wrong answer is A & C", Toast.LENGTH_SHORT).show();
                }
                q = 7;
                bt.setText("Finish");
                break;
            }
            case 7: {
                String ans7 = "merylstreep";
                if (ans7.equalsIgnoreCase(answer)) {
                    s = s + 10;
                    Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "wrong, answer is Meryl Streep", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(this, ed1.getText() + "'s final score is " + s, Toast.LENGTH_LONG).show();
                bt.setText("Restart");
                q = 0;
                break;
            }
        }
    }
}
