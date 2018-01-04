package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_372 {
    private val production = Production2_372("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}