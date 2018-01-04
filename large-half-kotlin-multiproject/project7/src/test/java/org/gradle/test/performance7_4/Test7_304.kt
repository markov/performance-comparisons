package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_304 {
    private val production = Production7_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}