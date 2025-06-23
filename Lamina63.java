// Lamina 63, figura 51
// 1
ListViewTaks = findViewById(R.id.lista_tareas);
txt_task = findViewById(R.id.txt_tarea);


// 2 
Button btn_add = findViewById(R.id.btn_agregar);


// 3 
tasks = new ArrayList<>();


// 4
tasksAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tasks);
listViewTasks.setAdapter(tasksAdapter);
