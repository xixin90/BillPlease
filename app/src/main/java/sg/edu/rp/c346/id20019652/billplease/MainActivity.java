package sg.edu.rp.c346.id20019652.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultAmt;
    TextView resultAmt2;
    AutoCompleteTextView btnDiscount;

    Button btnCalculate;
    Button btnSvs;
    Button btnGst;
    Button btnReset;

    EditText inputAmt;
    EditText inputPax;

    RadioGroup rgPayMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultAmt = findViewById(R.id.textViewTotBill);
        resultAmt2 = findViewById(R.id.textViewPayment);

        //initialize EditTexts
        String amt = inputAmt.getText().toString();
        String pax = inputPax.getText().toString();
        String disc = btnDiscount.getText().toString();

        //initialize widgets
        inputAmt = findViewById(R.id.editTextAmount);
        inputPax = findViewById(R.id.editTextPaxNo);
        btnDiscount = findViewById(R.id.autoCompleteTextView);

        int tot = Integer.parseInt(amt);
        int people = Integer.parseInt(pax);
        int discount = Integer.parseInt(disc);

        //initialize buttons
        btnGst = findViewById(R.id.buttonGST);
        btnSvs = findViewById(R.id.buttonSVS);
        btnReset = findViewById(R.id.resetButton);
        btnCalculate = findViewById(R.id.splitButton);

        rgPayMethod = findViewById(R.id.buttonPayment);
        double result = tot * disc;

        btnGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnGst.isSelected()) {
                    result += 0.07 * result;
                } else {
                    result = result;
                }
            }
        });

        btnSvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnSvs.isSelected()) {

                    result += 0.1 * result;
                } else {
                    result = result;
                }
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double discounted = discount / 100;
                result = (1 - discounted) * (tot / people);

                }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputAmt.setText("");
                inputPax.setText("");
                btnDiscount.setText("");
            }
        });

        rgPayMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String billRes = resultAmt.getText().toString();
                    String paymentRes = resultAmt2.getText().toString();
                    int checkedRadioId = rgPayMethod.getCheckedRadioButtonId();

                    if (checkedRadioId == R.id.radioButtonCash) {
                        billRes = "Total Bill: $" + result;
                        paymentRes = "Each Pays: $" + result + "in cash";
                    }
                    else{
                        billRes = "Total Bill: $" + result;
                        paymentRes = "Each Pays: $" + result + " via PayNow to 912345678";
                    }
                    resultAmt.setText(billRes);
                    resultAmt2.setText(paymentRes);
            }
        });
    }
}