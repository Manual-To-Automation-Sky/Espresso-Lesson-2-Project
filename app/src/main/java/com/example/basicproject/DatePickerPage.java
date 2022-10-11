package com.example.basicproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicproject.databinding.DatePickerPageBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DatePickerPage extends Fragment {
    private DatePickerPageBinding binding;
    private Map<Integer, String> monthMap;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        setUpMonthMap();

        binding = DatePickerPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    private void setUpMonthMap() {
        monthMap = new HashMap<>();
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.dateSelector.setOnDateChangeListener((view1, year, month, dayOfMonth) -> {
            String pattern = "dd MMMM, yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String formattedDate = simpleDateFormat.format(new Date(binding.dateSelector.getDate()));
            binding.enteredDateLabel.setText(formattedDate);
        });

        binding.datePageGoBackButton.setOnClickListener(view1 -> NavHostFragment.findNavController(DatePickerPage.this)
                .navigate(R.id.action_datePickerPage_to_FirstFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
