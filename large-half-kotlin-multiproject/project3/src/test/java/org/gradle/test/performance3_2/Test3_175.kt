package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_175 {
    private val production = Production3_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}