package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_241 {
    private val production = Production12_241("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}