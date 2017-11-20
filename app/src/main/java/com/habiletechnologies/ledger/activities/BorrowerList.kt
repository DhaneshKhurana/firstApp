package com.habiletechnologies.ledger.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.habiletechnologies.ledger.R

class BorrowerList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_borrower_list)
        setContentView(R.layout.activity_borrower_list)
        val value = intent.getStringExtra("Dhanesh")
        println("Valus of Dhanesh is $value")
    }
}
