package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_150 {
    private val production = Production3_150("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}