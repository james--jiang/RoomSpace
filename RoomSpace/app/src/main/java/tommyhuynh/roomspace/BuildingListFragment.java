package tommyhuynh.roomspace;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class BuildingListFragment extends Fragment {
    private ArrayAdapter<String>  mBuildingAdapter;

    private final ArrayList<String> BUILDINGS = new ArrayList<String>() {{
        add("Dwinelle");
    }};


    public BuildingListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mBuildingAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.building_list_item,
                R.id.building_name,
                BUILDINGS);

        ListView buildingListView = (ListView) rootView.findViewById(R.id.buildings_listview);
        buildingListView.setAdapter(mBuildingAdapter);


        buildingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String buildingName = mBuildingAdapter.getItem(position);

                // Setting up the Toast popup.
                Context context = getActivity();
                int duration = Toast.LENGTH_SHORT;
                Toast toast_popup = Toast.makeText(context, buildingName, duration);
                toast_popup.show();
            }
        });
        return rootView;
    }
}
