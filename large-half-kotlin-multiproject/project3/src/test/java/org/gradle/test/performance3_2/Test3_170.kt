package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_170 {
    private val production = Production3_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}