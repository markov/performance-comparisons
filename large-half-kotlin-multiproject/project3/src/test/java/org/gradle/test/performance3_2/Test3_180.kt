package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_180 {
    private val production = Production3_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}