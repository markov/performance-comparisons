package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_426 {
    private val production = Production10_426("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}