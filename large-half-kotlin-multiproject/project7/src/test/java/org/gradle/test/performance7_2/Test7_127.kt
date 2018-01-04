package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_127 {
    private val production = Production7_127("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}