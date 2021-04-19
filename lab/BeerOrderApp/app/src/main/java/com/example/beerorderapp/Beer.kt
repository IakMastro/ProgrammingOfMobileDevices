package com.example.beerorderapp

import java.lang.StringBuilder

class Beer(private val type: String, private val brands: Array<String>) {
    override fun toString(): String {
        val str = StringBuilder("Κατηγορία: ")
        str.append(type)

        str.append("\nΠροϊόντα\n")
        for (brand in brands) {
            str.append(brand)
            str.append("\n")
        }

        return str.toString()
    }
}