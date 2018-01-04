package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_428 {
    private val production = Production3_428("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}