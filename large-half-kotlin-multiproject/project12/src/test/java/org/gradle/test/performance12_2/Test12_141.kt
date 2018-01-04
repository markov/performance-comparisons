package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_141 {
    private val production = Production12_141("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}