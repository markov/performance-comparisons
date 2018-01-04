package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_443 {
    private val production = Production3_443("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}