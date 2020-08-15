package com.example.androideventstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);

        /* 화면 위쪽에 배치한 뷰(view)를 findViewById()메서드로 찾아 참조한 후 setOnTouchListener()메서드를 호출하여 리스너를 등록
        *  이 메서드를 호출할 때 파라미터로 리스너 객체를 전달하는데, new 연산자를 이용해 OnTouchListener 객체를 생성하면서 전달합니다.
        *  그러면 뷰가 터치되었을 때 이 리스너 객체의 onTouch() 메서드가 자동으로 호출됩니다.
        *
        * onTouch() 메서드로는 MotionEvent 객체가 파라미터로 전달됩니다. 이 객체에는 액션 정보나 터치한 곳의 좌표 등이 들어 있습니다.
        * 액션 정보는 getAction() 메서드로 확인할 수 있으며 손가락이 눌렸는지 눌린 상태로 움직이는지, 또는 손가락이 떼졌는지를 알 수 있도록 합니다.
        * getAction() 메서드를 호출하면 정수 자료형의 값이 반환되는데 그 값과 MotionEvent 클래스에 정의된 상수 값을 비교하면 손가락이 눌렸거나 눌린 상태로 움직이거나 또는 떼졌을 때의 상태를 알 수있습니다.
        *
        * MotionEvent.ACTION_DOWN - 손가락이 눌렸을 때
        * MotionEvent.ACTION_MOVE - 손가락이 눌린 상태로 움직일 때
        * MotionEvent.ACTION_UP - 손가락이 떼졌을 때
        *
        * */

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){

                int action = motionEvent.getAction();

                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                if(action == MotionEvent.ACTION_DOWN){
                    println("손가락 눌림 : " + curX + ", " + curY);
                }else if(action == MotionEvent.ACTION_HOVER_MOVE){
                    println("손가락 움직임 : " + curX + ", " + curY);
                }else if(action == MotionEvent.ACTION_UP){
                    println("손가락 뗌 : " + curX + "," + curY);
                }
                return true;
            }

        });

    }

    public void println(String data){
        textView.append(data + "\n");
    }
}