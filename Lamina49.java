// VALIDAR CAMPOS
private boolean validar(String n1, String n2) {
  if (TextUtils.isEmpty(n1) || TextUtils.isEmpty(n2)) {
    Toast.makeText(this, "No envies campos vacios", Toast.LENGTH_SHORT).show();
    return false;
  }
  return true;
}


btn_sumar.setOnClickListener(v -> {
  if (!validar(numero1.getText().toString(), numero2.getText().toString())) {
    return;
  }
  int n1 = Integer.parseInt(numero1.getText().toString());
  int n2 = Integer.parseInt(numero2.getText().toString());
  
  int resultado = sumar(n1, n2);
  
  txt_resultado.setText(String.valueOf(resultado));

})