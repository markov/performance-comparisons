package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_231 {
    private val production = Production7_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}