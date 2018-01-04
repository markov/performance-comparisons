package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_109 {
    private val production = Production3_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}