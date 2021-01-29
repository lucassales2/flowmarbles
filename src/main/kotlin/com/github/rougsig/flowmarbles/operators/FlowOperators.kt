package com.github.rougsig.flowmarbles.operators

val operators = listOf(
  contextOperators(),
  delayOperators(),
  distinctOperators(),
  emittersOperators(),
  limitOperators(),
  mergeOperators(),
  transformOperators(),
  zipOperators()
).flatten()
