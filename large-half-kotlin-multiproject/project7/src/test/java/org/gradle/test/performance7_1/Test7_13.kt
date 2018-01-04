package org.gradle.test.performance7_1

import org.junit.Assert.*

class Test7_13 {
    private val production = Production7_13("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}