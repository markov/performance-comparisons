package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_301 {
    private val production = Production12_301("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}