package com.example.novosti.ui.country;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.novosti.R;
import com.example.novosti.data.model.Article;

import java.util.List;

public class CountryFragment extends Fragment {

    private CountryViewModel countryViewModel;

    private Button btnSerbia;
    private Button btnFrance;
    private Button btnGreece;
    private Button btnIndia;
    private Button btnAmerica;
    private Button btnSweden;
    private Button btnBrazil;
    private Button btnCanada;
    private Button btnRussia;
    private Button btnGermany;
    private Button btnEgypt;
    private Button btnAustralia;
    private Button btnIsrael;
    private Button btnNigeria;
    private Button btnHungary;
    private Button btnIndonesia;
    private Button btnPortugal;
    private Button btnSlovenia;
    private Button btnVenuzuela;
    private Button btnCuba;
    private Button btnMorocco;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        countryViewModel =
                new ViewModelProvider(this).get(CountryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_country, container, false);


        btnSerbia = root.findViewById(R.id.btn_serbia);
        btnFrance = root.findViewById(R.id.btn_france);
        btnGreece = root.findViewById(R.id.btn_greece);
        btnIndia = root.findViewById(R.id.btn_india);
        btnAmerica = root.findViewById(R.id.btn_america);
        btnSweden = root.findViewById(R.id.btn_sweden);
        btnBrazil = root.findViewById(R.id.btn_brazil);
        btnCanada = root.findViewById(R.id.btn_canada);
        btnRussia = root.findViewById(R.id.btn_russia);
        btnGermany = root.findViewById(R.id.btn_germany);
        btnEgypt = root.findViewById(R.id.btn_egypt);
        btnAustralia = root.findViewById(R.id.btn_egypt);
        btnIsrael = root.findViewById(R.id.btn_israel);
        btnNigeria = root.findViewById(R.id.btn_nigeria);
        btnHungary = root.findViewById(R.id.btn_hungary);
        btnIndonesia = root.findViewById(R.id.btn_indonesia);
        btnPortugal = root.findViewById(R.id.btn_portugal);
        btnSlovenia = root.findViewById(R.id.btn_slovenia);
        btnVenuzuela = root.findViewById(R.id.btn_venuzuela);
        btnCuba = root.findViewById(R.id.btn_cuba);
        btnMorocco = root.findViewById(R.id.btn_morocco);


        btnSerbia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("sr");
            }
        });

        btnFrance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("fr"); //fokusiraj se na articles!!!!!
            }
        });

        btnGreece.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("gr");
            }
        });

        btnIndia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("in");
            }
        });

        btnAmerica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("us");
            }
        });

        btnSweden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("se");
            }
        });

        btnBrazil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("br");
            }
        });

        btnCanada.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("ca");
            }
        });

        btnRussia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("ru");
            }
        });
        btnGermany.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("de");
            }
        });
        btnEgypt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("eg");
            }
        });
        btnAustralia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("au");
            }
        });

        btnIsrael.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("il");
            }
        });
        btnNigeria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("ng");
            }
        });
        btnHungary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("hu");
            }
        });
        btnIndonesia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("id");
            }
        });
        btnPortugal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("pt");
            }
        });
        btnSlovenia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("si");
            }
        });
        btnVenuzuela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("ve");
            }
        });
        btnCuba.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("cu");
            }
        });
        btnMorocco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                List<Article> articles =  countryViewModel.getArticlesByCountry("ma");
            }
        });




        return root;
    }
}