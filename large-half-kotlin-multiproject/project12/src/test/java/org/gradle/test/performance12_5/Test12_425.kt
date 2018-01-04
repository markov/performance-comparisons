package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_425 {
    private val production = Production12_425("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}