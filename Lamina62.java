import java.util.ArrayList;

public class Lamina62 extends AppCompatActivity {
  private ListView listViewTasks;

  private ArrayList<String> tasksList;

  private ArrayAdapter<String> tasksAdapter;

  private EditText txt_task;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompact.setOnApplyWindowInsetsListener(findViewById(R.id.main_layout), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
    });

    listViewTasks = findViewById(R.id.lista_tareas);
  }
}
