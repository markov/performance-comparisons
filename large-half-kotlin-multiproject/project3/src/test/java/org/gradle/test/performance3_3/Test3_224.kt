package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_224 {
    private val production = Production3_224("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}