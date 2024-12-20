package com.app.gui.calculator

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import tornadofx.View
class Calculator : View() {
    override val root: VBox by fxml()

    @FXML
    lateinit var display: Label

    init {
        title = "Kotlin Calculator"

        root.lookupAll(".button").forEach {
            it.setOnMouseClicked {
                operator((it as Button).text)
            }
        }

        root.addEventFilter(KeyEvent.KEY_TYPED) {
            operator(it.character.uppercase().replace('\r','='))
        }
    }

    var state: Operator = Operator.Add(0)

    fun onAction(fn: Operator) {
        state = fn
        display.text = ""
    }

    val displayValue: Long
        get() = when(display.text) {
            "" -> 0
            else -> display.text.toLong()
        }

    private fun operator(x: String) {
        if(Regex("[0-9]").matches(x)) {
            display.text += x
        } else {
            when(x) {
                "+" -> onAction(Operator.Add(displayValue))
                "-" -> onAction(Operator.Sub(displayValue))
                "X" -> onAction(Operator.Mul(displayValue))
                "/" -> onAction(Operator.Div(displayValue))
                "%" -> {
                    onAction(Operator.Add(displayValue / 100))
                    operator("=")
                }
                "C" -> onAction(Operator.Add(0))
                "+/-" -> {
                    onAction(Operator.Add(-1 * displayValue))
                    operator("=")
                }
                "=" -> display.text = state.calculator(displayValue).toString()
            }
        }
    }
}