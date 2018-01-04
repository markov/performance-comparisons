package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_480 {
    private val production = Production3_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}