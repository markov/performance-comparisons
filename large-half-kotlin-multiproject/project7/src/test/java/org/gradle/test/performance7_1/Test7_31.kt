package org.gradle.test.performance7_1

import org.junit.Assert.*

class Test7_31 {
    private val production = Production7_31("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}