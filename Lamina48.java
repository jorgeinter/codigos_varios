btn_multiplicar.setOnClickListener(v -> {
    int n1 = Integer.parseInt(numero1.getText().toString());
    int n2 = Integer.parseInt(numero2.getText().toString());

    int resultado = multiplicar(n1, n2);

    txt_resultado.setText(String.valueOf(resultado));
});

btn_dividir.setOnClickListener(v -> {
    int n1 = Integer.parseInt(numero1.getText().toString());
    int n2 = Integer.parseInt(numero2.getText().toString());

    if (n2 != 0) {
        double resultado = dividir(n1, n2);
        txt_resultado.setText(String.valueOf(resultado));
    } else {
        txt_resultado.setText("Error: División por cero");
    }
});