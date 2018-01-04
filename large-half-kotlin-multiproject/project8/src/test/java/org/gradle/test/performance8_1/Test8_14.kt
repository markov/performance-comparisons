package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_14 {
    private val production = Production8_14("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}