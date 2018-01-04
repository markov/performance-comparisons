package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_28 {
    private val production = Production4_28("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}