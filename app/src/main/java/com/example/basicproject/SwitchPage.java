package com.example.basicproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicproject.databinding.SwitchPageBinding;
;

public class SwitchPage extends Fragment {
    private SwitchPageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = SwitchPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.switchOne.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.switchOneLabel.setText("On");
                binding.switchOneLabel.setTextColor(Color.rgb(0, 255, 0));
            } else {
                binding.switchOneLabel.setText("Off");
                binding.switchOneLabel.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        binding.switchTwo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.switchTwoLabel.setText("On");
                binding.switchTwoLabel.setTextColor(Color.rgb(0, 255, 0));
            } else {
                binding.switchTwoLabel.setText("Off");
                binding.switchTwoLabel.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        binding.switchThree.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.switchThreeLabel.setText("On");
                binding.switchThreeLabel.setTextColor(Color.rgb(0, 255, 0));
            } else {
                binding.switchThreeLabel.setText("Off");
                binding.switchThreeLabel.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        binding.switchFour.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.switchFourLabel.setText("On");
                binding.switchFourLabel.setTextColor(Color.rgb(0, 255, 0));
            } else {
                binding.switchFourLabel.setText("Off");
                binding.switchFourLabel.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        binding.switchFive.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.switchFiveLabel.setText("On");
                binding.switchFiveLabel.setTextColor(Color.rgb(0, 255, 0));
            } else {
                binding.switchFiveLabel.setText("Off");
                binding.switchFiveLabel.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        binding.switchPageGoBackButton.setOnClickListener(view1 -> NavHostFragment.findNavController(SwitchPage.this)
                .navigate(R.id.action_switchPage_to_FirstFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
