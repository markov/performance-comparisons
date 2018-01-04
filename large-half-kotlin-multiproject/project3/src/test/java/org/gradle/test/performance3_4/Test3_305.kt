package org.gradle.test.performance3_4

import org.junit.Assert.*

class Test3_305 {
    private val production = Production3_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}