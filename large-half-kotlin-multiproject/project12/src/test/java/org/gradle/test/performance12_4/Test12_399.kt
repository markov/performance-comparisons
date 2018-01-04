package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_399 {
    private val production = Production12_399("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}