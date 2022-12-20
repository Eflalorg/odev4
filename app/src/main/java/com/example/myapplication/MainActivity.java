package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        gorselArrayList = new ArrayList<>();

        Gorsel balon = new Gorsel("Sarı Balon",1,R.drawable.balon);
        Gorsel cicek = new Gorsel("Mavi Çiçek",2,R.drawable.cicek);
        Gorsel kelebek = new Gorsel("Mavi Kelebek",3,R.drawable.kelebek);
        Gorsel kus = new Gorsel("Yuvada Kuş",4,R.drawable.kus);

        gorselArrayList.add(balon);
        gorselArrayList.add(cicek);
        gorselArrayList.add(kelebek);
        gorselArrayList.add(kus);

        binding.imageView.setImageResource(gorselArrayList.get(0).foto);
        binding.textView.setText("Bilgi :" + gorselArrayList.get(0).bilgi);
    }
    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi :" + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
    public void ileriGitme(View view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

}