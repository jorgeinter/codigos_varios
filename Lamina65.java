// lamina 65, figura 52
// 1
btn_add.setOnClickListener(v -> {
  String task = txt_task.getText().toString();
});


// 2
if (TextUtils.isEmpty(task)) {
  Toast.makeText(this, "No puedes agregar una tarea vacia", Toast.LENGTH_SHORT).show();
} else {
  tasks.add(task);
}


// 3
tasksAdapter.notifyDataSetChanged();
txt_tarea.setText("");
