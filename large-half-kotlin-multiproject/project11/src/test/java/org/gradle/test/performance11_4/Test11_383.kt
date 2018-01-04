package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_383 {
    private val production = Production11_383("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}