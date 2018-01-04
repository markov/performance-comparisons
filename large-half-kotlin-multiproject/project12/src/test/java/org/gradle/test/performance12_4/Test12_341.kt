package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_341 {
    private val production = Production12_341("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}