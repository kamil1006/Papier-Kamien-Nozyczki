package com.example.papierkamiennozyczki;

public class Rozgrywka
{
    int wybor;
    int wybor_przeciwnika;
    int wynik;
    //_________________________________________________________________
    Rozgrywka()      {    }

    Rozgrywka(int wybor, int wybor_przeciwnika)
    {
        this.wybor = wybor;
        this.wybor_przeciwnika = wybor_przeciwnika;
    }
    //_________________________________________________________________
    public String slownie(int a)
    {
        String sslownie="";
        switch (a)
        {
            case 1:
                sslownie = "papier";
                break;
            case 2:
                sslownie = "kamien";
                break;
            case 3:
                sslownie = "nozyce";
                break;
        }
        return sslownie	;
    }
    //_________________________________________________________________
    public String slownie_wynik(int a)
    {
        String sslownie="";
        switch (a)
        {
            case 0:
                sslownie = "remis";
                break;

            case 1:
                sslownie = "wygrana";
                break;

            case 2:
                sslownie = "porazka";
                break;
            default:
                break;
        }
        return sslownie;
    }

    //_________________________________________________________________
    public void losowanie()
    {
        long a;
        int Low ;
        int High ;
        Low = 1;
        High = 3;
        a = Math.round((High - Low + 1) * Math.random() + Low);
        if (a > 3) {a=3;}
        wybor_przeciwnika=(int)a;
    }

    //_________________________________________________________________
    public void ustal_wynik()
    {

        switch (wybor)
        {
            case 1:
                switch (wybor_przeciwnika)
                {
                    case 1:
                        wynik = 0 ;// remis;
                        break;

                    case 2:
                        wynik = 1; // wygrana;
                        break;

                    case 3:
                        wynik = 2 ;//porazka;
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (wybor_przeciwnika)
                {
                    case 1:
                        wynik = 2 ;//porazka;
                        break;

                    case 2:
                        wynik = 0 ;// remis;
                        break;

                    case 3:
                        wynik = 1; // wygrana;
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (wybor_przeciwnika)
                {
                    case 1:
                        wynik = 1; // wygrana;
                        break;

                    case 2:
                        wynik = 2 ;//porazka;
                        break;

                    case 3:
                        wynik = 0 ;// remis;
                        break;
                    default:
                        break;
                }
                break;
        }
    }

    //_________________________________________________________________

}
