package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_84 {
    private val production = Production4_84("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}