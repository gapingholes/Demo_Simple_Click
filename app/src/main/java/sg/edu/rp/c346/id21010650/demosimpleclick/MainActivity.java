package sg.edu.rp.c346.id21010650.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //1 - create handles
    Button button;
    TextView tv;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 - bridge UI with controller
        button = findViewById(R.id.button);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tbtn = findViewById(R.id.tbtn);
        rgGender = findViewById(R.id.rgGender);


        //3 - set event listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //4 - set actions
                if (tbtn.isChecked() == true) {
                    String data = etInput.getText().toString();
                    int selectedID = rgGender.getCheckedRadioButtonId();

                    if (selectedID == R.id.rbMale) {
                        tv.setText("Hi Mr, \n" + data);
                    } else {
                        tv.setText("Hi Ms, \n" + data);
                    }

                }
                tbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (tbtn.isChecked() == true) {
                            button.setEnabled(true);
                        } else {
                            button.setEnabled(false);
                        }

                        //grab input from EditText
                        //set to TextView
                        String data = etInput.getText().toString();
                        tv.setText(data);
                    }

                });
            }
        });
    }
}







