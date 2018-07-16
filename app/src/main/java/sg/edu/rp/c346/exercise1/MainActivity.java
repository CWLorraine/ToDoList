package sg.edu.rp.c346.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItems> alToDo;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ListViewToDo);
        alToDo = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set (2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set (2018,9,22);

        ToDoItems item1 = new ToDoItems("MSA",date1);
        ToDoItems item2 = new ToDoItems("Go for haircut", date2);

        alToDo.add(item1);
        alToDo.add(item2);

        caToDo = new CustomAdapter(this, R.layout.todo_list, alToDo);
        lvToDo.setAdapter(caToDo);







    }
}
