package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_252 {
    private val production = Production3_252("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}