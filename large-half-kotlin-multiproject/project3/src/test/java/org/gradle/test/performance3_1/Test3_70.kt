package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_70 {
    private val production = Production3_70("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}