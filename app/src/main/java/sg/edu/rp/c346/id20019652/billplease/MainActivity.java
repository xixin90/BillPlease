package sg.edu.rp.c346.id20019652.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView resultAmt;
    TextView resultAmt2;

    Button btnCalculate;
    Button btnSvs;
    Button btnGst;
    Button btnReset;

    EditText inputAmt;
    EditText inputPax;
    EditText inputDiscount;

    //RadioGroup rgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tvResult = findViewById(R.id.textViewTotBill);
        //tvResult2 = findViewById(R.id.textViewPayment);

        //initialize buttons
        btnGst = findViewById(R.id.buttonGST);
        btnSvs = findViewById(R.id.buttonSVS);
        btnReset = findViewById(R.id.resetButton);

        //initialize widgets
        inputAmt = findViewById(R.id.editTextAmount);
        inputPax = findViewById(R.id.editTextPaxNo);
        inputDiscount = findViewById(R.id.editTextDiscount);
        btnCalculate = findViewById(R.id.splitButton);
       // rgPayment = findViewById(R.id.buttonPayment);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNum1 = etResult.getText().toString();
                String strNum2 = etResult1.getText().toString();
                String strNum3 = etResult2.getText().toString();

                int iNum1 = Integer.parseInt(strNum1);
                int iNum2 = Integer.parseInt(strNum2);
                int iNum3 = Integer.parseInt(strNum3);

                if(btnResult.isChecked()) {
                    etResult.setEnabled(true);
                }
                else{
                    etResult.setEnabled(false);
                }

            }
        });


    }
}