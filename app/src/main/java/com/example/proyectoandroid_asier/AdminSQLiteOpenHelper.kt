package com.example.proyectoandroid_asier

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory

class AdminSQLiteOpenHelper(context: Context, name: String, factory: CursorFactory?,
                            version: Int) : SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table usuarios(usuario text primary key, contrasenya text, imagen blob)")
        db.execSQL("create table series(idSerie text primary key, usuario text, capituloActual real, capitulosTotales real, estado text, imagen blob)")

    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}