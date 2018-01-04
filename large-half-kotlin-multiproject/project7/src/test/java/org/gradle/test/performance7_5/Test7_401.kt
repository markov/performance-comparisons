package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_401 {
    private val production = Production7_401("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}