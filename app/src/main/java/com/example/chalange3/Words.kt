package com.example.chalange3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Words(
    val name: String,
    val phoneNumber: Int
) : Parcelable


val alphabets = ('A'..'Z').map { it.toString() }.toMutableList()

enum class Word(val char: String, val words: ArrayList<String>){
    A("A", arrayListOf("Australia")),
    B("B", arrayListOf("Bugis")),
    C("C", arrayListOf("Caramel")),
    D("D", arrayListOf("Doraemon")),
    E("E", arrayListOf("Elang")),
    F("F", arrayListOf("Fosil")),
    G("G", arrayListOf("Gajah")),
    H("H", arrayListOf("Hantu")),
    I("I", arrayListOf("Indosesia")),
    J("j", arrayListOf("Jerapah")),
    K("K", arrayListOf("Kelalawar")),
    L("L", arrayListOf("Lalat")),
    M("M", arrayListOf("Mangga")),
    N("N", arrayListOf("Nasi")),
    O("O", arrayListOf("Ojol")),
    P("P", arrayListOf("Perahu")),
    Q("Q", arrayListOf("Quiz")),
    R("R", arrayListOf("Raja")),
    S("S", arrayListOf("Sumatra")),
    T("T", arrayListOf("Tempe")),
    U("U", arrayListOf("Uang")),
    V("P", arrayListOf("Pantun")),
    W("W", arrayListOf("Wajan")),
    X("X", arrayListOf("Xiomi")),
    Y("Y", arrayListOf("Yordania")),
    Z("Z", arrayListOf("Zebra"))
}

