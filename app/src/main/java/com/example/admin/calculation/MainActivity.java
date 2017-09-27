package com.example.admin.calculation;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtLength_a, edtBreadth_a, edtHeight_a, edtTotal_a,
            edtLength_b, edtBreadth_b, edtHeight_b, edtTotal_b,
            edtLength_c, edtBreadth_c, edtHeight_c, edtTotal_c,
            edtTotal_d,edtTotal_e,edtTotal_f,edtTotalqtyfortrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        edtTotal_A();
        edtTotal_B();
        edtTotal_C();
        edtTotalqtyforTrip();

    }

    public void init() {
        edtLength_a = (EditText) findViewById(R.id.edtLength_a);
        edtBreadth_a = (EditText) findViewById(R.id.edtBreadth_a);
        edtHeight_a = (EditText) findViewById(R.id.edtHeight_a);
        edtTotal_a = (EditText) findViewById(R.id.edtTotal_a);
        edtLength_b = (EditText) findViewById(R.id.edtLength_b);
        edtBreadth_b = (EditText) findViewById(R.id.edtBreadth_b);
        edtHeight_b = (EditText) findViewById(R.id.edtHeight_b);
        edtTotal_b = (EditText) findViewById(R.id.edtTotal_b);
        edtLength_c = (EditText) findViewById(R.id.edtLength_c);
        edtBreadth_c = (EditText) findViewById(R.id.edtBreadth_c);
        edtHeight_c = (EditText) findViewById(R.id.edtHeight_c);
        edtTotal_c = (EditText) findViewById(R.id.edtTotal_c);
        edtTotal_d = (EditText) findViewById(R.id.edtTotal_d);
        edtTotal_e = (EditText) findViewById(R.id.edtTotal_e);
        edtTotal_a.setEnabled(false);
        edtTotal_b.setEnabled(false);
        edtTotal_c.setEnabled(false);
        edtTotal_d.setEnabled(false);
        edtTotal_e.setEnabled(false);


    }

    public void edtTotal_A() {
        edtLength_a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtLength_a.getText().clear();

                if (edtLength_a.getText().toString().isEmpty())
                    edtLength_a.setError("enter the value");

                if (edtBreadth_a.getText().toString().isEmpty())
                    edtBreadth_a.setError("Enter the value");

                if (edtHeight_a.getText().toString().isEmpty())
                    edtHeight_a.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_a.getText().toString().isEmpty()) {
                    edtLength_a.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_a.setError("Enter the value");
                }
                if (edtHeight_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_a.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_a.getText().toString()) * Integer.parseInt(edtBreadth_a.getText().toString()) * Integer.parseInt(edtHeight_a.getText().toString());
                    edtTotal_a.setText(String.valueOf(total));
                }
            }
        });

        edtBreadth_a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtBreadth_a.getText().clear();

                if (edtLength_a.getText().toString().isEmpty())
                    edtLength_a.setError("enter the value");

                if (edtBreadth_a.getText().toString().isEmpty())
                    edtBreadth_a.setError("Enter the value");

                if (edtHeight_a.getText().toString().isEmpty())
                    edtHeight_a.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_a.getText().toString().isEmpty()) {
                    edtLength_a.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_a.setError("Enter the value");
                }
                if (edtHeight_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_a.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_a.getText().toString()) * Integer.parseInt(edtBreadth_a.getText().toString()) * Integer.parseInt(edtHeight_a.getText().toString());
                    edtTotal_a.setText(String.valueOf(total));
                }
            }
        });
        edtHeight_a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtHeight_a.getText().clear();

                if (edtLength_a.getText().toString().isEmpty())
                    edtLength_a.setError("enter the value");

                if (edtBreadth_a.getText().toString().isEmpty())
                    edtBreadth_a.setError("Enter the value");

                if (edtHeight_a.getText().toString().isEmpty())
                    edtHeight_a.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_a.getText().toString().isEmpty()) {
                    edtLength_a.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_a.setError("Enter the value");
                }
                if (edtHeight_a.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_a.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_a.getText().toString()) * Integer.parseInt(edtBreadth_a.getText().toString()) * Integer.parseInt(edtHeight_a.getText().toString());
                    edtTotal_a.setText(String.valueOf(total));
                }
            }
        });
    }

    public void edtTotal_B() {
        edtLength_b.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtLength_b.getText().clear();

                if (edtLength_b.getText().toString().isEmpty())
                    edtLength_b.setError("enter the value");

                if (edtBreadth_b.getText().toString().isEmpty())
                    edtBreadth_b.setError("Enter the value");

                if (edtHeight_b.getText().toString().isEmpty())
                    edtHeight_b.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_b.getText().toString().isEmpty()) {
                    edtLength_b.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_b.setError("Enter the value");
                }
                if (edtHeight_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_b.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_b.getText().toString()) * Integer.parseInt(edtBreadth_b.getText().toString()) * Integer.parseInt(edtHeight_b.getText().toString());
                    edtTotal_b.setText(String.valueOf(total));
                }
            }
        });

        edtBreadth_b.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtBreadth_b.getText().clear();

                if (edtLength_b.getText().toString().isEmpty())
                    edtLength_b.setError("enter the value");

                if (edtBreadth_b.getText().toString().isEmpty())
                    edtBreadth_b.setError("Enter the value");

                if (edtHeight_b.getText().toString().isEmpty())
                    edtHeight_b.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_b.getText().toString().isEmpty()) {
                    edtLength_b.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_b.setError("Enter the value");
                }
                if (edtHeight_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_b.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_b.getText().toString()) * Integer.parseInt(edtBreadth_b.getText().toString()) * Integer.parseInt(edtHeight_b.getText().toString());
                    edtTotal_b.setText(String.valueOf(total));
                }
            }
        });
        edtHeight_b.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtHeight_b.getText().clear();

                if (edtLength_b.getText().toString().isEmpty())
                    edtLength_b.setError("enter the value");

                if (edtBreadth_b.getText().toString().isEmpty())
                    edtBreadth_b.setError("Enter the value");

                if (edtHeight_b.getText().toString().isEmpty())
                    edtHeight_b.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_b.getText().toString().isEmpty()) {
                    edtLength_b.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_b.setError("Enter the value");
                }
                if (edtHeight_b.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_b.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_b.getText().toString()) * Integer.parseInt(edtBreadth_b.getText().toString()) * Integer.parseInt(edtHeight_b.getText().toString());
                    edtTotal_b.setText(String.valueOf(total));
                }
            }
        });
    }

    public void edtTotal_C() {
        edtLength_c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtLength_c.getText().clear();

                if (edtLength_c.getText().toString().isEmpty())
                    edtLength_c.setError("enter the value");

                if (edtBreadth_c.getText().toString().isEmpty())
                    edtBreadth_c.setError("Enter the value");

                if (edtHeight_c.getText().toString().isEmpty())
                    edtHeight_c.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_c.getText().toString().isEmpty()) {
                    edtLength_c.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_c.setError("Enter the value");
                }
                if (edtHeight_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_c.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_c.getText().toString()) * Integer.parseInt(edtBreadth_c.getText().toString()) * Integer.parseInt(edtHeight_c.getText().toString());
                    edtTotal_c.setText(String.valueOf(total));
                }
            }
        });

        edtBreadth_c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtBreadth_c.getText().clear();

                if (edtLength_c.getText().toString().isEmpty())
                    edtLength_c.setError("enter the value");

                if (edtBreadth_c.getText().toString().isEmpty())
                    edtBreadth_c.setError("Enter the value");

                if (edtHeight_c.getText().toString().isEmpty())
                    edtHeight_c.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_c.getText().toString().isEmpty()) {
                    edtLength_c.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_c.setError("Enter the value");
                }
                if (edtHeight_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_c.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_c.getText().toString()) * Integer.parseInt(edtBreadth_c.getText().toString()) * Integer.parseInt(edtHeight_c.getText().toString());
                    edtTotal_c.setText(String.valueOf(total));
                }
            }
        });

        edtHeight_c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    edtHeight_c.getText().clear();

                if (edtLength_c.getText().toString().isEmpty())
                    edtLength_c.setError("enter the value");

                if (edtBreadth_c.getText().toString().isEmpty())
                    edtBreadth_c.setError("Enter the value");

                if (edtHeight_c.getText().toString().isEmpty())
                    edtHeight_c.setError("Enter the value");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean f1, f2, f3;
                f1 = f2 = f3 = true;
                if (edtLength_c.getText().toString().isEmpty()) {
                    edtLength_c.setError("enter the value");
                    f1 = false;
                }
                if (edtBreadth_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtBreadth_c.setError("Enter the value");
                }
                if (edtHeight_c.getText().toString().isEmpty()) {
                    f2 = false;
                    edtHeight_c.setError("Enter the value");
                }

                if (f1 && f2 && f3) {
                    int total = Integer.parseInt(edtLength_c.getText().toString()) * Integer.parseInt(edtBreadth_c.getText().toString()) * Integer.parseInt(edtHeight_c.getText().toString());
                    edtTotal_c.setText(String.valueOf(total));
                }
            }
        });

    }
    public void  edtTotalqtyforTrip(){
        Toast.makeText(getApplicationContext(),"hr",Toast.LENGTH_SHORT).show();

        if(edtTotal_b.getText().length()!=0&&edtTotal_c.getText().length()!=0)
        {
            edtTotal_d.setText(String.valueOf(Integer.parseInt(edtTotal_b.getText().toString())+edtTotal_b.getText().toString()));
        }
        if (edtTotal_d.getText().length()!=0)
            edtTotal_e.setText(String.valueOf(Integer.parseInt(edtTotal_b.getText().toString())/2));
    }

}
