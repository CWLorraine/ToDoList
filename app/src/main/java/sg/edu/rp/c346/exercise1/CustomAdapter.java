package sg.edu.rp.c346.exercise1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by 16039013 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItems> todoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoItems> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvToDo = rowView.findViewById(R.id.textViewToDo);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        ToDoItems currentItem = todoList.get(position);
        String todo = currentItem.getTodo();
        String date = currentItem.getDateString();

        tvToDo.setText(todo);
        tvDate.setText(date);

        return rowView;

    }
}
