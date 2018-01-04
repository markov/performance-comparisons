package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_442 {
    private val production = Production7_442("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}