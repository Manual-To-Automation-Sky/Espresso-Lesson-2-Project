package com.example.basicproject;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicproject.databinding.FragmentFirstBinding;

import java.util.Calendar;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private AlertDialog alertDialog;
    private AlertDialog.Builder alertBuilder;
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private ListPage listPage;
    private int year, month, day;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {



        buildAlertDialog();

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    private void buildAlertDialog() {
        alertBuilder = new AlertDialog.Builder(getContext());
        alertBuilder.setMessage("Show Alert page");
        alertBuilder.setCancelable(true);

        alertBuilder.setPositiveButton(
                "Yes",
                (dialog, id) -> {
                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_Go_To_Alert_Page);
                });

        alertBuilder.setNegativeButton(
                "No",
                (dialog, id) -> dialog.cancel());

        alertDialog = alertBuilder.create();
    }

    private void buildDatePickerDialog() {
        //dateView = (TextView) findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.alertButton.setOnClickListener(view1 -> alertDialog.show());

        binding.textFieldButton.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_textFieldPage));

        binding.formButton.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_formPage));

        binding.dateButton.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_datePickerPage));

        binding.switchButton.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_switchPage));

        binding.listButton.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_Go_To_List_Page));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}