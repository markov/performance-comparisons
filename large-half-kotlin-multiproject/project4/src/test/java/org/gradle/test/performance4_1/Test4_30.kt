package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_30 {
    private val production = Production4_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}