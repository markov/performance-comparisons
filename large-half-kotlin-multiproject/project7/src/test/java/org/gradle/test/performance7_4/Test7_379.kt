package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_379 {
    private val production = Production7_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}