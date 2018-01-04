package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_30 {
    private val production = Production3_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}