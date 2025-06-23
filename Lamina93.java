// lamina 93, figura 79
// metodo sobreescrito de onComplete
@Override
public void onComplete(@NonNull Task<AuthResult> task) {
  if (task.isSuccessful()) {
    String currentUserID = FirebaseAuth.getInstance().getCurrentUser().getUid();

    Map<String, String> user = new HashMap<>();
    user.put("username", name);
    user.put("email", email);

    FirebaseDatabase.getInstance().getReference()
        .child("users")
        .child(currentUserID)
        .setValue(user);

  } else {
    Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();

  }
}