package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_490 {
    private val production = Production12_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}