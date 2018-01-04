package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_493 {
    private val production = Production7_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}