package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView myImageView;
    ImageButton myImageButton;
    TextView myTextView;
    View myView;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView apple1 = (ImageView) findViewById(R.id.apple1);
        apple1.setOnTouchListener(handleTouch);

        ImageView apple2 = (ImageView) findViewById(R.id.apple2);
        apple2.setOnTouchListener(handleTouch);

        ImageView apple3 = (ImageView) findViewById(R.id.apple3);
        apple3.setOnTouchListener(handleTouch);

        ImageView apple4 = (ImageView) findViewById(R.id.apple4);
        apple4.setOnTouchListener(handleTouch);

        ImageView apple5 = (ImageView) findViewById(R.id.apple5);
        apple5.setOnTouchListener(handleTouch);

        ImageView apple6 = (ImageView) findViewById(R.id.apple6);
        apple6.setOnTouchListener(handleTouch);

        ImageView apple7 = (ImageView) findViewById(R.id.apple7);
        apple7.setOnTouchListener(handleTouch);

        ImageView apple8 = (ImageView) findViewById(R.id.apple8);
        apple8.setOnTouchListener(handleTouch);

        ImageView apple9 = (ImageView) findViewById(R.id.apple9);
        apple9.setOnTouchListener(handleTouch);

        buttonEqualClick(myView);

        }




   /* public void HideView (View myView){
        View secondview;
        secondview = (View) findViewById(R.id.view2);
        secondview.setVisibility(View.INVISIBLE);
    }

    public void ShowView (View myView ){
        View view2;
        view2 = (View) findViewById(R.id.view2);
        view2.setVisibility(View.VISIBLE);
    }*/

    public void button0(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 0){   gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }

    public void button1(View v) {
        //View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 1){  gosecondpage (myView);

        }
else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
            }

    }

    public void button2(View v) {
        //View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if (result == 2) {
            gosecondpage (myView);

        } else {
            Toast.makeText(this, "TRY AGAIN", Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }
    }
        public void button3(View v) {
            View view2;
            //myTextView = findViewById(R.id.display);
            //myTextView.setText("1");

            if(result == 3){  gosecondpage (myView);

            }
            else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
                //buttonEqualClick(myView );
            }

        }

    public void button4(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 4){  gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }
    public void button5(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 5){  gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }
    public void button6(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 6){   gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }
    public void button7(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 7){  gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }
    public void button8(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 8){  gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }
    public void button9(View v) {
        View view2;
        //myTextView = findViewById(R.id.display);
        //myTextView.setText("1");

        if(result == 9){  gosecondpage (myView);

        }
        else{Toast.makeText(this, "TRY AGAIN",Toast.LENGTH_SHORT).show();
            //buttonEqualClick(myView );
        }

    }

    public void resetgame (View v) {
        buttonEqualClick(myView);
    }


    public void buttonEqualClick(View v) {

        myTextView = findViewById(R.id.display);
        //int result = leftOperand + rightOperand;
        Random r = new Random();
        int upperbound = 5;
        int leftoperand = r.nextInt(upperbound), rightoperand = r.nextInt(upperbound);

        int number = 1;//leftoperand + rightoperand;



            TextView textView = (TextView) findViewById(R.id.display);
            textView.setText(leftoperand + "+" + rightoperand + "= ?");
        /*myTextView.setText(String.valueOf(number));
        System.out.println(leftoperand);*/
            result = leftoperand + rightoperand;


    }
    /*public void buttonPlusClick(View v) {
        myTextView = findViewById(R.id.resultText);
        myTextView.setText("+");

    }*/

        public void gosecondpage (View v){
            startActivity(new Intent(MainActivity.this,MainActivity2.class));

        }





    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0)
                            .start();
                    break;
                default:
                    return false;

            }
            return true;
        }
    };
}