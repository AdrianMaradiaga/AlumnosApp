package hn.uth.alumnosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import hn.uth.alumnosapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.btnSaludar.setOnClickListener(v -> {
            if(binding.edtNombre.getText().toString().isEmpty()){
                binding.imgSaludo.setVisibility(View.INVISIBLE);
                Snackbar.make(binding.layoutBinvenida, R.string.mensajeErrorNombre,
                                Snackbar.LENGTH_LONG).show();
            }else{
                binding.txtTitulo.setText("Bienvenido " + binding.edtNombre.getText());
                binding.imgSaludo.setVisibility(View.VISIBLE);
            }
        });
    }
}