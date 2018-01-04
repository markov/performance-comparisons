package org.gradle.test.performance3_4

import org.junit.Assert.*

class Test3_377 {
    private val production = Production3_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}