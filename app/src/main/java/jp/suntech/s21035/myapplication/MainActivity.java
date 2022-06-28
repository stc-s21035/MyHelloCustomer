package jp.suntech.s21035.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick=findViewById(R.id.btClick);
        HelloListener listener=new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClearN=findViewById(R.id.btClearN);
        btClearN.setOnClickListener(listener);

        Button btClearL=findViewById(R.id.btClearL);
        btClearL.setOnClickListener(listener);


    }
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input1=findViewById(R.id.etName);
            EditText input2=findViewById(R.id.etLive);
            TextView output=findViewById(R.id.tvOutput);

            int id=view.getId();
            switch (id) {
                case R.id.btClick:
                    String inputStr1 = input1.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    output.setText(inputStr2 + "にお住まいの" + inputStr1 + "さんこんにちは");
                    break;
                case R.id.btClearN:
                    String inputStr3 = input2.getText().toString();
                    output.setText(inputStr3 + "にお住まいの***さんこんにちは");
                    break;
                case R.id.btClearL:
                    String inputStr4 = input1.getText().toString();
                    output.setText("***にお住まいの" + inputStr4 + "さんこんにちは");
                    break;

                    }
            }
        }
    }
