package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_103 {
    private val production = Production12_103("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}