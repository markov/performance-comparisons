package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_283 {
    private val production = Production3_283("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}