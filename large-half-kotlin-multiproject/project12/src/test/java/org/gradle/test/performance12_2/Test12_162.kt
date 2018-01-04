package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_162 {
    private val production = Production12_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}