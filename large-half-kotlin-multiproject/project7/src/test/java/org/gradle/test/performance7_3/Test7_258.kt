package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_258 {
    private val production = Production7_258("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}