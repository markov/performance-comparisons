package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_128 {
    private val production = Production47_128("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
