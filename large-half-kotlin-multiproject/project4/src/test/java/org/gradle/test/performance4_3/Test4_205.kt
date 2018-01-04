package org.gradle.test.performance4_3

import org.junit.Assert.*

class Test4_205 {
    private val production = Production4_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}