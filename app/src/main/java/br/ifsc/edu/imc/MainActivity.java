package br.ifsc.edu.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    List<Integer> lista_imagens;
    int posicaoImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        lista_imagens = Arrays.asList(
                R.drawable.cachorro,
                R.drawable.patinho,
                R.drawable.porquinho,
                R.drawable.gardem,
                R.drawable.happy);

        posicaoImagem = 0;


    }



    public void mudaFoto(View view){


        for (int i=0; i < lista_imagens.size(); i++){
            if (   posicaoImagem < lista_imagens.size()-1){
                imageView.setImageResource(lista_imagens.get(posicaoImagem));
            }
            else{
                posicaoImagem=0;
                imageView.setImageResource(lista_imagens.get(posicaoImagem));
            }
            posicaoImagem++;
        }
    }


}
