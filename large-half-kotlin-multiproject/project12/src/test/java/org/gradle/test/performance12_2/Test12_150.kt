package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_150 {
    private val production = Production12_150("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}