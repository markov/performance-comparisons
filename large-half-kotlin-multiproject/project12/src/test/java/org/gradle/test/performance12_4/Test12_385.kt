package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_385 {
    private val production = Production12_385("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}