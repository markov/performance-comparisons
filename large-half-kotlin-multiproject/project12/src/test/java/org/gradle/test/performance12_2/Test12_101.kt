package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_101 {
    private val production = Production12_101("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}