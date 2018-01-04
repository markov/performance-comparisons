package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_358 {
    private val production = Production8_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}