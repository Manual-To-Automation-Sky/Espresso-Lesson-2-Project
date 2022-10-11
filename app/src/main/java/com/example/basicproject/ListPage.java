package com.example.basicproject;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.basicproject.databinding.ListPageBinding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListPage extends ListFragment {
    private ListPageBinding binding;
    private AlertDialog.Builder alertBuilder;
    private AlertDialog alertDialog;
    ListView list;
    String[] listItems = {"One", "Two", "Three", "Four", "Five"};

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = ListPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        binding.list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                buildAlertDialog(selectedItem);
                alertDialog.show();
                System.out.println(selectedItem);
            }
        });

        binding.goBackButton.setOnClickListener(view1 -> NavHostFragment.findNavController(ListPage.this)
                .navigate(R.id.action_listPage_To_FirstFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        List<String> listItems = new ArrayList<String>();
        listItems.add("Android");
        listItems.add("iPhone");
        listItems.add("Android");
        listItems.add("Android");
        listItems.add("Android");
        listItems.add("Android");
        listItems.add("Android");

        for (String item : listItems) {
            System.out.println("test");
        }
    }

    private void buildAlertDialog(String item) {
        alertBuilder = new AlertDialog.Builder(getContext());
        alertBuilder.setMessage(item);
        alertBuilder.setCancelable(true);

        alertBuilder.setNegativeButton(
                "Ok",
                (dialog, id) -> dialog.cancel());

        alertDialog = alertBuilder.create();
    }

}
