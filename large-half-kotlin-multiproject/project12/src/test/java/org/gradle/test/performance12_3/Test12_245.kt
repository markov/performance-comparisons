package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_245 {
    private val production = Production12_245("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}