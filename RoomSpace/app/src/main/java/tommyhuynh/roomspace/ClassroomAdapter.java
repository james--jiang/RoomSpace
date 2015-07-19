package tommyhuynh.roomspace;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by TommysMAC on 7/18/15.
 */
public class ClassroomAdapter extends BaseAdapter {

    public ClassroomAdapter(Context context, ArrayList<Objects> objects) {

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        //return objects.get(position);
        return null;
    }

    @Override
    public int getCount() {
        //return objects.size();
        return -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
