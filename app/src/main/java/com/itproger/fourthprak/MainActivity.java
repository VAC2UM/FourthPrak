package com.itproger.fourthprak;
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_main);
//        LinearLayout linearLayout = new LinearLayout(this);
//        // горизонтальная ориентация
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//
//        TextView textView = new TextView(this);
//        textView.setText("Hello");
//        textView.setTextSize(30);
//        // создаем параметры позиционирования для элемента
//        LinearLayout.LayoutParams layoutParams = new
//                LinearLayout.LayoutParams
//                (LinearLayout.LayoutParams.WRAP_CONTENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT);
//        // устанавливаем отступы
//        layoutParams.setMargins(100, 100, 0, 0);
//        textView.setLayoutParams(layoutParams);
//        // добавляем элемент в LinearLayout
//        linearLayout.addView(textView);
//        setContentView(linearLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RelativeLayout;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//        EditText editText = new EditText(this);
//        editText.setId(EditText.generateViewId());
//        Button button = new Button(this);
//        button.setText("Отправить");
//        // устанавливаем параметры положения для EditText
//        RelativeLayout.LayoutParams editTextParams = new
//                RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание по центру родительского контейнера
//        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
//        // добавляем в RelativeLayout
//        relativeLayout.addView(editText, editTextParams);
//        // устанавливаем параметры положения для Button
//        RelativeLayout.LayoutParams buttonParams = new
//                RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        // выравнивание справа и снизу от поля EditText
//        buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
//        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
//        // добавляем в RelativeLayout
//        relativeLayout.addView(button, buttonParams);
//        setContentView(relativeLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.EditText;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        TableLayout tableLayout = new TableLayout( this);
//
//        // первая строка
//        TableRow tableRow1 = new TableRow(this);
//        TextView textView1 = new TextView(this);
//        textView1.setText("Логин");
//        tableRow1.addView(textView1, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
//        EditText editText1 = new EditText(this);
//        tableRow1.addView(editText1, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
//        // вторая строка
//        TableRow tableRow2 = new TableRow(this);
//        TextView textView2 = new TextView(this);
//        textView2.setText("Email");
//        tableRow2.addView(textView2, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
//        EditText editText2 = new EditText(this);
//        tableRow2.addView(editText2, new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT, 1.f));
//        tableLayout.addView(tableRow1);
//        tableLayout.addView(tableRow2);
//        setContentView(tableLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Gravity;
//import android.widget.FrameLayout;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        FrameLayout frameLayout = new FrameLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello World!");
//        FrameLayout.LayoutParams layoutParams = new
//                FrameLayout.LayoutParams
//                (FrameLayout.LayoutParams.WRAP_CONTENT,
//                        FrameLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;
//        textView.setLayoutParams(layoutParams);
//        textView.setTextSize(26);
//        frameLayout.addView(textView);
//        setContentView(frameLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Gravity;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.GridLayout;
//import android.widget.LinearLayout;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        GridLayout gridLayout = new GridLayout( this);
//        // количество строк
//        gridLayout.setRowCount(3);
//        // количество столбцов
//        gridLayout.setColumnCount(3);
//        for(int i = 1; i <=9; i++){
//            Button btn = new Button(this);
//            btn.setText(String.valueOf(i));
//            gridLayout.addView(btn);
//        }
//        setContentView(gridLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.view.Gravity;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.GridLayout;
//import android.widget.LinearLayout;
//import android.widget.TableLayout;
//import android.widget.TableRow;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        GridLayout gridLayout = new GridLayout( this);
//        // количество строк
//        gridLayout.setRowCount(3);
//        // количество столбцов
//        gridLayout.setColumnCount(3);
//        for(int i = 1; i <=3; i++){
//            Button btn = new Button(this);
//            btn.setText(String.valueOf(i));
//            gridLayout.addView(btn);
//        }
//        Button btn4 = new Button(this);
//        btn4.setText("4");
//        GridLayout.LayoutParams layoutParams4 = new
//                GridLayout.LayoutParams();
//        layoutParams4.columnSpec = GridLayout.spec(0,2);
//        layoutParams4.width = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 180,
//                getResources().getDisplayMetrics());
//        gridLayout.addView(btn4, layoutParams4);
//        Button btn5 = new Button(this);
//        btn5.setText("5");
//        GridLayout.LayoutParams layoutParams5 = new
//                GridLayout.LayoutParams();
//        layoutParams5.rowSpec = GridLayout.spec(1,2);
//        layoutParams5.height = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 100,
//                getResources().getDisplayMetrics());
//        gridLayout.addView(btn5, layoutParams5);
//        Button btn6 = new Button(this);
//        btn6.setText("6");
//        Button btn7 = new Button(this);
//        btn7.setText("7");
//        gridLayout.addView(btn6);
//        gridLayout.addView(btn7);
//
//        setContentView(gridLayout);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.ViewGroup;
//import android.widget.ScrollView;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_main);
//        ScrollView scrollView = new ScrollView(this);
//        TextView textView = new TextView(this);
//        textView.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum.");
//        textView.setLayoutParams(new ViewGroup.LayoutParams
//                (ViewGroup.LayoutParams.WRAP_CONTENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT));
//        textView.setTextSize(26);
//        scrollView.addView(textView);
//        setContentView(scrollView);
//    }
//}

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//public class MainActivity extends AppCompatActivity {
//    int clicks = 0;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void onClick(View view){
//        TextView clicksText = findViewById(R.id.clicksText);
//        clicks++;
//        clicksText.setText(clicks + " Clicks");
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello Android!");
        textView.setTextSize(30);
        textView.setBackgroundColor(0xffe8eaf6);
        // установка gravity
        textView.setGravity(Gravity.CENTER);
        // установка высоты и ширины
        ConstraintLayout.LayoutParams layoutParams = new
                ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, 200);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.bottomToBottom =
                ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
    }
}