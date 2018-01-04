package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_399 {
    private val production = Production2_399("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}