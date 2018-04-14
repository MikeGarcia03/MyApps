import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tics.myapp.R;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter <User>{

    public UserAdapter(Context context, ArrayList<User> objects){
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_view,parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.myName);
        TextView tvLast = convertView.findViewById(R.id.myLast);
        tvName.setText(user.name);
        tvLast.setText(user.last);
        return convertView;
    }
}
