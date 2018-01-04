package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_146 {
    private val production = Production3_146("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}