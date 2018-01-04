package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_105 {
    private val production = Production12_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}