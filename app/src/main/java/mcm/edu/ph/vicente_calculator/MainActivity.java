package mcm.edu.ph.vicente_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Answer;
    EditText First_Variable, Second_Variable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Calculator(View v) {
        Answer = (TextView) findViewById(R.id.Answer);
        First_Variable = (EditText) findViewById(R.id.First_Variable);
        Second_Variable = (EditText) findViewById(R.id.Second_Variable);
        double Num1 = Float.parseFloat(First_Variable.getText().toString());
        double Num2 = Float.parseFloat(Second_Variable.getText().toString());
        double result = 0;
        switch (v.getId()){
            case R.id.Add:
                Add(result,Num1,Num2);
                break;
            case R.id.Subtract:
                Subtract(result,Num1,Num2);
                break;
            case R.id.Multiply:
                Multiply(result,Num1,Num2);
                break;
            case R.id.Divide:
                Divide(result,Num1,Num2);
                break;
            case R.id.Remainder:
                Remainder(result,Num1,Num2);
                break;
        }
    }
    public void Add(double a, double b, double c){
        a = b + c;
        Answer.setText(Double.toString(a));
    }
    public void Subtract(double a, double b, double c){
        a = b - c;
        Answer.setText(Double.toString(a));
    }
    public void Multiply(double a, double b, double c){
        a = b * c;
        Answer.setText(Double.toString(a));
    }
    public void Divide(double a, double b, double c){
        a = b / c;
        Answer.setText(Double.toString(a));
    }
    public void Remainder(double a, double b, double c){
        a = b % c;
        Answer.setText(Double.toString(a));
    }
}