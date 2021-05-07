package sg.edu.rp.c346.id20019652.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    Button btnDisplay2;
    Button btnDisplay3;
    Button btnDisplay4;
    EditText etInput;
    EditText etInput2;
    EditText etInput3;
    RadioGroup rgPayment;
    Number dblNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewAmount);
        btnDisplay = findViewById(R.id.buttonGST);
        btnDisplay2 = findViewById(R.id.buttonSVS);
        btnDisplay3 = findViewById(R.id.splitButton);
        btnDisplay4 = findViewById(R.id.resetButton);
        etInput = findViewById(R.id.editTextAmount);
        etInput2 = findViewById(R.id.editTextPaxNo);
        etInput3 = findViewById(R.id.editTextDiscount);
        rgPayment = findViewById(R.id.buttonPayment);

        String strNumber = "25";
        dblNumber = Double.parseDouble(strNumber);
        int intNumber = Integer.parseInt(strNumber);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dblNumber = 5;

                String strResponse = etInput.getText().toString();
                int checkedRgId = rgPayment.getCheckedRadioButtonId();


                if(checkedRgId== R.id.radioButtonCash){

            }
        });


    }
}