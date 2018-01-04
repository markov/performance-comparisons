package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_232 {
    private val production = Production3_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}