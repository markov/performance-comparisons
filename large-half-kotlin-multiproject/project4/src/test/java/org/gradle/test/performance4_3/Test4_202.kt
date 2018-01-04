package org.gradle.test.performance4_3

import org.junit.Assert.*

class Test4_202 {
    private val production = Production4_202("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}