package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_419 {
    private val production = Production3_419("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}