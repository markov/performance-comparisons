package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_181 {
    private val production = Production3_181("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}