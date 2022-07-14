package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SpclFunc extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv ,bcr,bp,bkm,bm,bfar,bcel,bdeg,brad,bb1,bb2,bc,bac, bsf;
    TextView tvmain,tvsec;
    static int prev;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spcl_func);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bcr = findViewById(R.id.bcr);
        bp = findViewById(R.id.bp);
        bkm = findViewById(R.id.bkm);
        bm = findViewById(R.id.bm);
        bfar = findViewById(R.id.bfar);
        bcel = findViewById(R.id.bcel);
        brad = findViewById(R.id.brad);
        bdeg = findViewById(R.id.bdeg);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        bsf = findViewById(R.id.bsf);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        brad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(tvmain.getText().toString());
                double rad = Math.toRadians(degree);
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(rad));
            }
        });
        bdeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double rad = Double.parseDouble(tvmain.getText().toString());
                double degree = Math.toDegrees(rad);
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(degree));
            }
        });
        bcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double far = Double.parseDouble(tvmain.getText().toString());
                double cel = (far - 32) / 1.8;
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(cel));
            }
        });
        bkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double m = Double.parseDouble(tvmain.getText().toString());
                double km = m/1000;
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(km));
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev = Integer.parseInt(tvmain.getText().toString());
                tvmain.setText(tvmain.getText()+"p");
            }
        });

        bcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev = Integer.parseInt(tvmain.getText().toString());
                tvmain.setText(tvmain.getText()+"c");
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double km = Double.parseDouble(tvmain.getText().toString());
                double m = km*1000;
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(m));
            }
        });
        bfar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cel = Double.parseDouble(tvmain.getText().toString());
                double far = (cel *1.8) +32;
                tvsec.setText(tvmain.getText());
                tvmain.setText(String.valueOf(far));
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result;
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                if(val.indexOf("p") != -1 || val.indexOf("c") != -1)
                {
                    String perm_comb_str;
                    if(val.indexOf("p") != -1)
                    {
                        perm_comb_str = val.substring(val.indexOf("p"));
                    }
                    else
                    {
                        perm_comb_str = val.substring(val.indexOf("c"));
                    }
                    result = eval(prev, perm_comb_str);
                }
                else
                {
                    result = eval(0, replacedstr);
                }

                if(result == -99999)
                {
                    Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_LONG).show();
                    tvmain.setText("");
                }
                else
                {
                    tvmain.setText(String.valueOf(result));
                    tvsec.setText(val);
                }
            }
        });

        bsf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nxt_act = new Intent(SpclFunc.this, MainActivity.class);
                startActivity(nxt_act);
            }
        });

    }

    //factorial function
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }


    //eval function
    public static double eval(int prev_num, final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("p"))
                    {
                        if(prev_num < x)
                        {
                            x = -99999;
                        }
                        else
                        {
                            int i, numerator = 1, denominator = 1;
                            for (i = 1; i <= prev_num; i++) {
                                numerator = numerator * i;
                            }
                            for (i = 1; i <= prev_num - x; i++) {
                                denominator = denominator * i;
                            }
                            x = numerator / denominator;
                        }
                    }
                    else if (func.equals("c")) {
                        if(prev_num < x)
                        {
                            x = -99999;
                        }
                        else
                        {
                            int i, numerator = 1, denominator_2 = 1, denominator_1 = 1;
                            for (i = 1; i <= prev_num; i++) {
                                numerator = numerator * i;
                            }
                            for (i = 1; i <= prev_num - x; i++) {
                                denominator_2 = denominator_2 * i;
                            }
                            for (i = 1; i <= x; i++) {
                                denominator_1 = denominator_1 * i;
                            }
                            x = numerator / (denominator_2 * denominator_1);
                        }
                    }
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}