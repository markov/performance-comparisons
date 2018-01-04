package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_46 {
    private val production = Production12_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}