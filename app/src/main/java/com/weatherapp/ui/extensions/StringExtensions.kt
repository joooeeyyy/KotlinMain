package com.weatherapp.ui.extensions

fun String.getPlural(number: Int) = if (number == 1) this else this + "s"
