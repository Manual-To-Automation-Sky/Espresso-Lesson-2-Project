package com.example.basicproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicproject.databinding.TextFieldPageBinding;

public class TextFieldPage extends Fragment {
    private TextFieldPageBinding binding;
    private String errorMessage = "No text was entered!";

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = TextFieldPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.submitButton.setOnClickListener(view1 -> {
            if (binding.textField.getText().toString().equals("")) {
                binding.textFieldErrorLabel.setText(errorMessage);
            } else {
                binding.enteredTextLabel.setText(new StringBuilder().append(binding.enteredTextLabel.getText()).append(" ").append(binding.textField.getText().toString()).toString());
                binding.textFieldErrorLabel.setText("");
            }
        });

        binding.goBackButton.setOnClickListener(view1 -> NavHostFragment.findNavController(TextFieldPage.this)
                .navigate(R.id.action_textFieldPage_to_FirstFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
