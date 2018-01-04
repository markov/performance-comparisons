package org.gradle.test.performance4_1

import org.junit.Assert.*

class Test4_55 {
    private val production = Production4_55("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}