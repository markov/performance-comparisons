package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_211 {
    private val production = Production12_211("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}