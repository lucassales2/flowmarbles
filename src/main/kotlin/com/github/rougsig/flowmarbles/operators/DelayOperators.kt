package com.github.rougsig.flowmarbles.operators

import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.sample

fun contextOperators() = listOf(
  menuItem(header("delay"), null),
  menuItem(
    label("debounce", hasBug = true),
    sandbox(
      inputs(
        input(
          marble("1", 0),
          marble("2", 100),
          marble("3", 200),
          marble("4", 800),
          marble("5", 900)
        )
      ),
      "debounce(500)"
    ) { inputs -> inputs[0].debounce(500) }
  ),
  menuItem(
    label("sample"),
    sandbox(
      inputs(
        input(
          marble("1", 0),
          marble("2", 205),
          marble("3", 500),
          marble("4", 750),
          marble("5", 1000)
        )
      ),
      "sample(250)"
    ) { inputs -> inputs[0].sample(250) }
  )
)
