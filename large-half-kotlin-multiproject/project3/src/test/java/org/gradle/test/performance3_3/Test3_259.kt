package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_259 {
    private val production = Production3_259("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}