package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_310 {
    private val production = Production12_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}