//Lamina 47
// Asignacion de actividades a los botones de sumar y restar
btn_sumar.setOnClickListener(v -> {
  int n1 = Integer.parseInt(numero1.getText().toString());
  int n2 = Integer.parseInt(numero2.getText().toString());

  int resultado = sumar(n1, n2);

  txt_resultado.setText(String.valueOf(resultado));
});

btn_restar.setOnClickListener(v -> {
  int n1 = Integer.parseInt(numero1.getText().toString());
  int n2 = Integer.parseInt(numero2.getText().toString());

  int resultado = restar(n1, n2);

  txt_resultado.setText(String.valueOf(resultado));
});

