package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_160 {
    private val production = Production47_160("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
