package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_362 {
    private val production = Production8_362("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}