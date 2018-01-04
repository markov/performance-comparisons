package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_192 {
    private val production = Production3_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}