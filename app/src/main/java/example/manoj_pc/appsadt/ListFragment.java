package example.manoj_pc.appsadt;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.Inflater;

public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_list,container,false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.listRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<EmpInfo> arrayList = new ArrayList<>();
        arrayList.add(new EmpInfo("Android","Android Developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Hybrid","Hybrid ANdroid developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Php","php developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Java","java developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("C++","software developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Windows","c# developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Ios","Ios developer",R.drawable.picture_1));
        arrayList.add(new EmpInfo("Xamarin","Xamarin Developer",R.drawable.picture_1));
        Collections.sort(arrayList);
        ListAdapter listAdapter = new ListAdapter(arrayList);
        recyclerView.setAdapter(listAdapter);

        return view;
    }
}
