package com.practical_design_session.sai.enterpin_nodesign;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.EventListener;

public class PinNumber extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_number);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

       /* relativeLayout = (RelativeLayout) findViewById(R.id.activity_pin_number);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(relativeLayout.getWindowToken(), 0);
            }
        });*/

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    et1.clearFocus();
                    et1.removeTextChangedListener(this);
                    et2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //et1.removeTextChangedListener();
            }
        });

        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    et2.clearFocus();
                    et2.removeTextChangedListener(this);
                    et3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //et1.removeTextChangedListener();
            }
        });

        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    et3.clearFocus();
                    et3.removeTextChangedListener(this);
                    et4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //et1.removeTextChangedListener();
            }
        });

        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    et4.clearFocus();
                    et4.removeTextChangedListener(this);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //et1.removeTextChangedListener();
            }
        });
    }
}
