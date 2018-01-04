package org.gradle.test.performance3_4

import org.junit.Assert.*

class Test3_337 {
    private val production = Production3_337("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}