package com.example.papierkamiennozyczki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //---------------------------------------------------------------
    Button btnRestart = null ;
    Rozgrywka gra = new Rozgrywka();
    int[] numer=new int[1];

    ImageView ivWynik = null;
    TextView tvWynik = null;
    //---------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivWynik= (ImageView) findViewById(R.id.ivWynik);
        tvWynik=(TextView) findViewById(R.id.tvWynik);

        btnRestart=(Button)findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Restart gry!");
                ivWynik.setImageResource(R.mipmap.pytanie_foreground);
                tvWynik.setText("");

            }
        });




    }
    //---------------------------------------------------------------
    public void prezentujWynik()
    {
        switch (gra.wybor_przeciwnika)
        {
            case 1:
                ivWynik.setImageResource(R.drawable.papier);
                break;
            case 2:
                ivWynik.setImageResource(R.mipmap.kamien_foreground);
                break;
            case 3:
                ivWynik.setImageResource(R.mipmap.nozyczki_foreground);
                break;
        }


        String wynik=gra.slownie_wynik(gra.wynik);
        tvWynik.setText(wynik);
   int kk=2;
    }


    //---------------------------------------------------------------

    public void clickPapier(View view)
    {
        numer[0] =1;
        gra.wybor= numer[0];
        gra.losowanie();
        gra.ustal_wynik();
        showToast("Wybrałeś papier");
        prezentujWynik();

    }
    //---------------------------------------------------------------
    public void clickKamien(View view)
    {
        numer[0] =2;
        gra.wybor= numer[0];
        gra.losowanie();
        gra.ustal_wynik();
        showToast("Wybrałeś kamien");
        prezentujWynik();
    }
    //---------------------------------------------------------------
    public void clickNozyczki(View view)
    {
        numer[0] =3;
        gra.wybor= numer[0];
        gra.losowanie();
        gra.ustal_wynik();
        showToast("Wybrałeś nożyczki");
        prezentujWynik();
    }
    //---------------------------------------------------------------
    public void showToast (String message)
    {
        View tastView=getLayoutInflater().inflate(R.layout.toast,(ViewGroup)findViewById(R.id.linlay));
        TextView tvToast =(TextView)tastView.findViewById(R.id.tvToast);
        tvToast.setText(message);
        Toast toast=new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(tastView);
        toast.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL,0,0);
        toast.show();

    }

    //---------------------------------------------------------------
}
