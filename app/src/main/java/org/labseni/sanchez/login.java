<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="org.labseni.idiotkyu.login"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="81dp">

<AutoCompleteTextView
        android:id="@+id/editTextEmail"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                tools:layout_constraintRight_creator="1"
                tools:layout_constraintTop_creator="1"
                tools:layout_editor_absoluteX="217dp"
                tools:layout_editor_absoluteY="666dp" />

<Button
        android:id="@+id/buttonRegister"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Daftar"
                tools:layout_constraintRight_creator="1"
                tools:layout_constraintTop_creator="1"
                tools:layout_editor_absoluteX="148dp"
                tools:layout_editor_absoluteY="285dp" />

<EditText
        android:id="@+id/editTextEmail"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Email"
                android:inputType="textPersonName"
                tools:layout_constraintLeft_creator="1"
                tools:layout_constraintRight_creator="1"
                tools:layout_constraintTop_creator="1"
                tools:layout_editor_absoluteX="85dp"
                tools:layout_editor_absoluteY="112dp" />

<EditText
        android:id="@+id/editTextPassword"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Password"
                android:inputType="textPersonName"
                tools:layout_constraintLeft_creator="1"
                tools:layout_constraintRight_creator="1"
                tools:layout_constraintTop_creator="1"
                tools:layout_editor_absoluteX="85dp"
                tools:layout_editor_absoluteY="195dp" />

<TextView
        android:id="@+id/textViewSignup"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Sudah punya akun ?"
                tools:layout_editor_absoluteX="131dp"
                tools:layout_editor_absoluteY="367dp" />

</android.support.constraint.ConstraintLayout>
