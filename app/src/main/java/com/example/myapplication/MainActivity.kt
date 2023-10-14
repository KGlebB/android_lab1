package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var plusButton: Button;
    private lateinit var minusButton: Button;
    private lateinit var multiplyButton: Button;
    private lateinit var divisionButton: Button;
    private lateinit var inputFirstNumber: EditText;
    private lateinit var inputSecondNumber: EditText;
    private lateinit var resultTextView: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        setupVars()
        initButtons()
    }

    private fun setupVars() {
        plusButton = findViewById<Button>(R.id.plusButton)
        minusButton = findViewById<Button>(R.id.minusButton)
        multiplyButton = findViewById<Button>(R.id.multiplyButton)
        divisionButton = findViewById<Button>(R.id.divisionButton)

        inputFirstNumber = findViewById<EditText>(R.id.inputFirstNumber)
        inputSecondNumber = findViewById<EditText>(R.id.inputSecondNumber)

        resultTextView = findViewById<TextView>(R.id.resultTextView)
    }

    private fun initButtons() {
        plusButton.setOnClickListener {
            handlePlus()
        }
        minusButton.setOnClickListener {
            handleMinus()
        }
        multiplyButton.setOnClickListener {
            handleMultiply()
        }
        divisionButton.setOnClickListener {
            handleDivision()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setResultText(result: Double) {
        resultTextView.text = "Результат: $result"
    }

    private fun handlePlus() {
        val first = inputFirstNumber.text.toString().toDouble()
        val second = inputSecondNumber.text.toString().toDouble()
        setResultText(first + second)
    }

    private fun handleMinus() {
        val first = inputFirstNumber.text.toString().toDouble()
        val second = inputSecondNumber.text.toString().toDouble()
        setResultText(first - second)
    }

    private fun handleMultiply() {
        val first = inputFirstNumber.text.toString().toDouble()
        val second = inputSecondNumber.text.toString().toDouble()
        setResultText(first * second)
    }

    private fun handleDivision() {
        val first = inputFirstNumber.text.toString().toDouble()
        val second = inputSecondNumber.text.toString().toDouble()
        if (second != 0.0) {
            setResultText(first / second)
        } else {
            setResultText(.0)
        }
    }
}