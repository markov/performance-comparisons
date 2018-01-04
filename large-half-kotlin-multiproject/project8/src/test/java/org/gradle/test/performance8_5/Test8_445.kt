package org.gradle.test.performance8_5

import org.junit.Assert.*

class Test8_445 {
    private val production = Production8_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}