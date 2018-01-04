package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_265 {
    private val production = Production12_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}