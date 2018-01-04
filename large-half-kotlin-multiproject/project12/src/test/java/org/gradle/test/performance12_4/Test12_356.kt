package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_356 {
    private val production = Production12_356("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}